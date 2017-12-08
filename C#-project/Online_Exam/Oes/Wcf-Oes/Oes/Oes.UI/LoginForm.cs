using System;
using System.Configuration;
using System.Drawing;
using System.ServiceModel;
using System.Windows.Forms;
using WCF.Constracts;
using Oes.Entity.util;

namespace Oes.Entity
{
    public partial class loginForm : Form
    {
        //x and y represent this form location
        int x, y;

        public loginForm()
        {
            InitializeComponent();
            getUserInformation();

            this.txtUserName.Leave += new EventHandler(LeavePasswordOrUsername);
            this.txtPassword.Leave += new EventHandler(LeavePasswordOrUsername);

            this.btnLogin.Click += new EventHandler(ClickBtnLogin);
            this.lblCloseLoginForm.Click += new EventHandler(ClickCloseLoginForm);

            this.MouseDown += new MouseEventHandler(FormMainMouseDown);
            this.MouseMove += new MouseEventHandler(FormMainMouseMove);
        }

       /// <summary>
       /// Gets user information from configuation.
       /// </summary>
        private void getUserInformation()
        {

            if (!string.IsNullOrEmpty(ConfigurationManager.AppSettings[Constans.UserName].ToString()) && !string.IsNullOrEmpty(ConfigurationManager.AppSettings[Constans.Password].ToString()))
            {
                this.chxRember.Checked = true;
                this.txtUserName.Text = ConfigurationManager.AppSettings[Constans.UserName].ToString();
                this.txtPassword.Text = ConfigurationManager.AppSettings[Constans.Password].ToString();
                this.txtPassword.PasswordChar = Constans.Asterisk;
            }
        }

        /// <summary>
        /// Handles btnLogin click event to check user login.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void ClickBtnLogin(object sender, EventArgs e)
        {
            string userName = this.txtUserName.Text.Trim();
            string password = this.txtPassword.Text.Trim();

            // Checks txtUserName's text and txtPassword's text
            if (string.IsNullOrEmpty(userName) && string.IsNullOrEmpty(password))
            {
                this.lblErrorMessage.Visible = true;
                this.lblErrorMessage.Text = Constans.UsernameAndPasswordAreRequired;

                return;
            }
            else
            {
                if (string.IsNullOrEmpty(userName))
                {
                    this.lblErrorMessage.Visible = true;
                    this.lblErrorMessage.Text = Constans.UsernameIsRequired;

                    return;
                }
                else
                {
                    // Nothing To Do
                }

                if (string.IsNullOrEmpty(password))
                {
                    this.lblErrorMessage.Visible = true;
                    this.lblErrorMessage.Text = Constans.PasswordIsRequired;

                    return;
                }
                else
                {
                    // Nothing To Do
                }
            }

            this.lblErrorMessage.Visible = false;

            try
            {
                using (ChannelFactory<IUserService> factory = new ChannelFactory<IUserService>(Constans.UserService))
                {
                    IUserService userService = factory.CreateChannel();
                    User user = userService.UserLogin(userName, password);

                    // Validates user object
                    if (user == null)
                    {
                        this.lblErrorMessage.Visible = true;
                        this.lblErrorMessage.Text = Constans.PasswordIsWrong;
                    }
                    else
                    {

                        if (!user.IsLogined)
                        {
                            Configuration configuration = ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);

                            if (this.chxRember.Checked)
                            {
                                configuration.AppSettings.Settings.Remove(Constans.UserName);
                                configuration.AppSettings.Settings.Remove(Constans.Password);
                                configuration.AppSettings.Settings.Add(Constans.UserName, this.txtUserName.Text);
                                configuration.AppSettings.Settings.Add(Constans.Password, this.txtPassword.Text);
                                configuration.Save();
                            }
                            else
                            {
                                configuration.AppSettings.Settings.Remove(Constans.UserName);
                                configuration.AppSettings.Settings.Remove(Constans.Password);
                                configuration.AppSettings.Settings.Add(Constans.UserName, Constans.UserNameText);
                                configuration.AppSettings.Settings.Add(Constans.Password, Constans.PasswordText);
                                configuration.Save();
                            }

                            UserSession.CurrentUser = user;
                            this.lblErrorMessage.Visible = false;

                            string userRole = userService.FindUserRoleByUserId(user.Id);
                            if (Constans.Teacher.Equals(userRole))
                            {
                                this.Hide();
                                TeacherForm teacherForm = new TeacherForm();
                                teacherForm.ShowDialog();
                            }
                            else
                            {
                                this.Hide();
                                MainForm mainForm = new MainForm();
                                mainForm.ShowDialog();
                            }

                            Application.ExitThread();
                        }
                        else
                        {
                            this.lblErrorMessage.Visible = true;
                            this.lblErrorMessage.Text = Constans.UserHasLogined;
                        }
                    }
                }
            }
            catch (FaultException)
            {
                this.lblErrorMessage.Visible = true;
                this.lblErrorMessage.Text = Constans.UsernameDoesNotExist;
            }
        }

        /// <summary>
        /// Handles txtUserName or txtPassword leave event and set the property of visible.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void LeavePasswordOrUsername(object sender, EventArgs e)
        {
            TextBox txt = sender as TextBox;

            if (txt != null)
            {
                if (string.IsNullOrEmpty(txt.Text.Trim()))
                {
                    if (txt.Name.Equals(Constans.TextUserName))
                    {
                        this.lblUserNameWrong.Visible = txt == this.txtUserName ? true : false;
                    }
                    else
                    {
                        this.lblPasswordWrong.Visible = txt == this.txtPassword ? true : false;
                    }
                }
                else
                {
                    if (txt.Name.Equals(Constans.TextUserName))
                    {
                        this.lblUserNameWrong.Visible = txt == this.txtUserName ? false : true;
                    }
                    else
                    {
                        this.lblPasswordWrong.Visible = txt == this.txtPassword ? false : true;
                    }
                }
            }
        }

        /// <summary>
        /// Exits application.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void ClickCloseLoginForm(object sender, EventArgs e)
        {

            if (UserSession.CurrentUser != null)
            {
                ExitLogin.ExitCurrentLogin(UserSession.CurrentUser.Id, DateTime.Now, false);
            }
            else
            {
                // Nothing to do.
            }

            Application.Exit();
        }

        #region Change form location
        private void FormMainMouseDown(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
            {
                x = e.X;
                y = e.Y;
            }
        }

        private void FormMainMouseMove(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
            {
                this.Location = new Point(this.Location.X + (e.X - x), this.Location.Y + (e.Y - y));
            }
        }
        #endregion
    }
}
