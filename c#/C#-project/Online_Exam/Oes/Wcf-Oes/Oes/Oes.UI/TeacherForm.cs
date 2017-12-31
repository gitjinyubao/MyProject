using System;
using System.Collections.ObjectModel;
using System.Configuration;
using System.Drawing;
using System.ServiceModel;
using System.Windows.Forms;
using Oes.Entity.Custom;
using Oes.Entity.util;
using WCF.Constracts;

namespace Oes.Entity
{
    public partial class TeacherForm : Form
    {
        // Defines the number one pagenation's of label width
        private int pageNumberOneWidth = 0;

        // Determines student come there first
        private Boolean isFirstCome = true;

        // Defines the pnlExamPagination's of panel width
        private int pnlExamPaginationWidth = 0;

        // x and y represent this form location
        private int x, y;

        // Initializes controllerNumber
        private int controllerNumber = 0;
        private ExamPagenation pagenation = new ExamPagenation();

        public TeacherForm()
        {
            InitializeComponent();

            // Initializes order's way and order's name
            pagenation.OrderName = Constans.Id;
            pagenation.OrderWay = Constans.Asc;
            pagenation.KeyWord = Constans.Empty;

            // Initiazes the number on CboPageSize
            this.cboPageSize.SelectedIndex = 2;

            InitExamsInfo();

            // Displays userName
            ShowUserName();

            this.txtSerarch.Enter += new EventHandler(TxtSerarchEnter);

            // Adds click event to implement that query data by paging
            this.lblUpPage.Click += new EventHandler(UpPageOrDownClick);
            this.lblDownPage.Click += new EventHandler(UpPageOrDownClick);
            this.cboPageSize.SelectedValueChanged += new EventHandler(CboPageSizeClick);
            this.btnGoPage.Click += new EventHandler(BtnGoPageClick);

            // Adds click event to implement function of sequencing
            this.lblAscName.Click += new EventHandler(OrderPictureClick);
            this.lblDscAverageScore.Click += new EventHandler(OrderPictureClick);
            this.lblDscId.Click += new EventHandler(OrderPictureClick);
            this.lblDscNumberOfQualified.Click += new EventHandler(OrderPictureClick);
            this.lblDscTimeEffective.Click += new EventHandler(OrderPictureClick);
            this.lblAscPassRate.Click += new EventHandler(OrderPictureClick);

            // Changes form location
            this.MouseDown += new MouseEventHandler(FormMainMouseDown);
            this.MouseMove += new MouseEventHandler(FormMainMouseMove);

            this.lblSearch.Click += new EventHandler(LblSearchClick);

            // Logout
            this.lblLogout.Click += new EventHandler(LblLogoutClick);

            this.examTabPageTitleHead.ClosFormClick += new EventHandler(CloseTakeExamFormClick);
        }

        /// <summary>
        /// Handles lblSearch click event.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void LblSearchClick(object sender, EventArgs e)
        {
            pagenation.CurrentPage = 1;
            pagenation.KeyWord = Constans.PleaseInputThePassword.Equals(this.txtSerarch.Text) ? Constans.Empty : this.txtSerarch.Text;
            InitExamsInfo();

        }

        /// <summary>
        /// Handles txtSerarch click event.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void TxtSerarchEnter(object sender, EventArgs e)
        {
            this.txtSerarch.Text = "";
        }

        /// <summary>
        /// Initializes exam list.
        /// </summary>
        private void InitExamsInfo()
        {
            this.pnlFinishedExamInformation.Controls.Clear();

            // Gets the default pageSize from config
            string pagesize = ConfigurationManager.AppSettings[Constans.PageSize].ToString();

            if (isFirstCome)
            {
                pagenation.PageSize = Convert.ToInt32(pagesize);
                isFirstCome = false;
            }
            else
            {
                // Nothing to do
            }

            Collection<TeacherSearchExamListIterm> exams = new Collection<TeacherSearchExamListIterm>();

            // Gets total count of data and the collection of MyExamListIterm object
            using (ChannelFactory<IExamService> factory = new ChannelFactory<IExamService>(Constans.ExamService))
            {
                IExamService examService = factory.CreateChannel();
                pagenation.TotalCount = examService.GetTeacherExamTotalCount(pagenation.KeyWord);
                exams = examService.ShowTeacherExamList(pagenation);
            }

            // Gets the value of controller's property
            for (int j = 0; j < exams.Count; j++)
            {
                var exam = exams[j];
                ExamPassInformation examDetail = new ExamPassInformation();
                examDetail.Index = (j + 1).ToString();
                examDetail.ExamName = exam.Name.Length > 15 ? exam.Name.Substring(0, 15) : exam.Name;
                examDetail.ExamIdNumber = exam.Number;
                examDetail.ExamEffictiveTime = (exam.EffictiveTime.ToString()).Substring(0);
                examDetail.TotalQuantity = exam.QuestionQuantity;
                examDetail.AverageScore = exam.AverageScore;
                examDetail.ExamineeCount = exam.ExamineeCount;
                examDetail.NumberOfQualified = exam.NumberOfQualified;
                examDetail.PassRate = exam.PassRate;

                // Defines the location of examDetail.
                examDetail.Location = new Point(0, examDetail.Height * j);

                // Adds controller into panel.
                this.pnlFinishedExamInformation.Controls.Add(examDetail);
            }

            this.txtPageNumber.Text = pagenation.CurrentPage.ToString();
            DisplayLable();
        }

        /// <summary>
        /// Displays different pagination columns according to numbers.
        /// </summary>
        private void DisplayLable()
        {
            pnlExamPagination.Controls.Clear();

            // The pageCount represent the sum page of data.
            int pageCount = pagenation.PageCount;

            // The currentPage represent current page number.
            int currentPage = pagenation.CurrentPage;

            // Paging logic.
            if (pagenation.CurrentPage > Constans.NumberOneInt)
            {
                AddPageNumberController(Constans.NumberOne);
            }

            if (currentPage > Constans.NumberFourInt)
            {
                AddPageNumberController(Constans.SuspensionPoints);
            }

            if (currentPage > Constans.NumberThreeInt)
            {
                AddPageNumberController((currentPage - Constans.NumberTwoInt).ToString());
            }

            if (currentPage > Constans.NumberTwoInt)
            {
                AddPageNumberController((currentPage - Constans.NumberOneInt).ToString());
            }

            AddPageNumberController(currentPage.ToString());

            if (currentPage <= pageCount - Constans.NumberTwoInt)
            {
                AddPageNumberController((currentPage + Constans.NumberOneInt).ToString());
            }

            if (currentPage <= pageCount - Constans.NumberThreeInt)
            {
                AddPageNumberController((currentPage + Constans.NumberTwoInt).ToString());
            }

            if (currentPage <= pageCount - Constans.NumberFourInt)
            {
                AddPageNumberController(Constans.SuspensionPoints);
            }

            if (currentPage < pageCount)
            {
                AddPageNumberController(pageCount.ToString());
            }

            // Defines the panel of PnlExamPagination location
            this.pnlExamPagination.Width = pageNumberOneWidth;

            // Defines the panel of PnlExamPaginationRight location
            this.pnlExamPaginationRight.Location = new Point(pageNumberOneWidth + 300, 594);

            controllerNumber = 0;
            pageNumberOneWidth = 0;
        }

        /// <summary>
        /// Adds PageNumberController
        /// </summary>
        /// <param name="number">number is on navigation</param>
        private void AddPageNumberController(string number)
        {
            PageNumber pageNumberOne = new PageNumber();

            // Adds style for current page's label
            if (number.Equals(pagenation.CurrentPage.ToString()))
            {
                pageNumberOne.IsCurrentPageNumber = true;
            }

            // Adds click for number
            if (!Constans.SuspensionPoints.Equals(number))
            {
                pageNumberOne.PageNumberClick += new EventHandler(OnePageNumberClick);
            }

            // This number display on the label
            pageNumberOne.OnePagenumber = number;

            // This controller's location
            if (controllerNumber == 0)
            {
                pnlExamPaginationWidth = pageNumberOne.Width;
            }

            pageNumberOneWidth += pageNumberOne.Width;

            pageNumberOne.Location = new Point(pageNumberOneWidth - pnlExamPaginationWidth, 0);

            // Adds this controller in panel.
            this.pnlExamPagination.Controls.Add(pageNumberOne);
            ++controllerNumber;
        }

        /// <summary>
        /// Handles cboPageSize selected event.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void CboPageSizeClick(object sender, EventArgs e)
        {
            pagenation.PageSize = Convert.ToInt32(this.cboPageSize.SelectedItem.ToString());
            pagenation.CurrentPage = 1;
            InitExamsInfo();
        }

        /// <summary>
        /// Handles click for OrderPicture to deal with sequencing.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void OrderPictureClick(object sender, EventArgs e)
        {
            Label lb = sender as Label;
            string name = lb.Name;

            // Takes 'A' represent the ASC
            if (Constans.A.Equals(name.Substring(3, 1)))
            {
                // Takes 'N' represent this label's name
                if (Constans.N.Equals(name.Substring(6, 1)))
                {
                    // Redifines this label's name and set the order name
                    lb.Name = Constans.LblDscName;
                    pagenation.OrderName = Constans.Name;
                }
                else if (Constans.I.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblDscId;
                    pagenation.OrderName = Constans.Id;
                }
                else if (Constans.A.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblDscAverageScore;
                    pagenation.OrderName = Constans.AverageScore;
                }
                else if (Constans.P.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.lblDscPassRate;
                    pagenation.OrderName = Constans.PassRate;
                }
                else if (Constans.N.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.lblDscNumberOfQualified;
                    pagenation.OrderName = Constans.NumberQualified;
                }
                else if (Constans.T.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblDscTimeEffective;
                    pagenation.OrderName = Constans.EffectiveTime;
                }
                else
                {
                    // Nothing to do.
                }

                // Changes this label's background image
                lb.Image = global::Oes.Entity.Properties.Resources.ICN_Decrese_10x15_png;

                // Sets the order way
                pagenation.OrderWay = Constans.Desc;
            }
            else
            {
                if (Constans.N.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblAscName;
                    pagenation.OrderName = Constans.Name;
                }
                else if (Constans.I.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblAscId;
                    pagenation.OrderName = Constans.Id;
                }
                else if (Constans.A.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblAscAverageScore;
                    pagenation.OrderName = Constans.AverageScore;
                }
                else if (Constans.P.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.lblAscPassRate;
                    pagenation.OrderName = Constans.PassRate;
                }
                else if (Constans.N.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.lblAscNumberOfQualified;
                    pagenation.OrderName = Constans.NumberQualified;
                }
                else if (Constans.T.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblAscTimeEffective;
                    pagenation.OrderName = Constans.EffectiveTime;
                }
                else
                {
                    // Nothing to do.
                }

                lb.Image = global::Oes.Entity.Properties.Resources.ICN_Increase_10x15_png;

                // Sets the order way
                pagenation.OrderWay = Constans.Asc;
            }

            InitExamsInfo();
        }

        /// <summary>
        /// Handles btnGoPage click event.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void BtnGoPageClick(object sender, EventArgs e)
        {

            if (!string.IsNullOrEmpty(this.txtPageNumber.Text) && IsNumber.IsNumeric(this.txtPageNumber.Text))
            {
                pagenation.CurrentPage = Convert.ToInt32(this.txtPageNumber.Text) > pagenation.PageCount ? pagenation.PageCount : Convert.ToInt32(this.txtPageNumber.Text);
                InitExamsInfo();
            }
        }

        /// <summary>
        /// Handles lblUpPage and lblDownPage click.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void UpPageOrDownClick(object sender, EventArgs e)
        {
            Label label = sender as Label;
            Boolean isRightClick;

            isRightClick = ((Constans.UpPage.Equals(label.Name) && pagenation.CurrentPage > 1) || (Constans.DownPage.Equals(label.Name) && pagenation.CurrentPage < pagenation.PageCount)) ? true : false;

            pagenation.CurrentPage = (Constans.UpPage.Equals(label.Name) && pagenation.CurrentPage > 1) ? (pagenation.CurrentPage - 1) : pagenation.CurrentPage;
            pagenation.CurrentPage = (Constans.DownPage.Equals(label.Name) && pagenation.CurrentPage < pagenation.PageCount) ? (pagenation.CurrentPage + 1) : pagenation.CurrentPage;

            if (isRightClick)
            {
                InitExamsInfo();
            }
            else
            {
                //Nothing to do.
            }
        }

        /// <summary>
        /// Handles click for onePageNumber to go to page.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void OnePageNumberClick(object sender, EventArgs e)
        {
            PageNumber pageNumber = sender as PageNumber;
            this.txtPageNumber.Text = pageNumber.OnePagenumber;
            pagenation.CurrentPage = Convert.ToInt32(this.txtPageNumber.Text);
            InitExamsInfo();
        }

        /// <summary>
        /// Shows userName on this form.
        /// </summary>
        private void ShowUserName()
        {
            this.lblUserName.Text = UserSession.CurrentUser.Username;
            this.lblUserName.Visible = true;
        }

        /// <summary>
        /// Handlers lblLogout click event.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void LblLogoutClick(object sender, EventArgs e)
        {
            ExitLogin.ExitCurrentLogin(UserSession.CurrentUser.Id, DateTime.Now, false);
            this.Hide();
            loginForm loginForm = new loginForm();
            loginForm.ShowDialog();
            Application.ExitThread();
        }

        /// <summary>
        /// Exits application.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void CloseTakeExamFormClick(object sender, EventArgs e)
        {
            ExitLogin.ExitCurrentLogin(UserSession.CurrentUser.Id, DateTime.Now, false);
            Application.Exit();
        }

        #region Change form location
        /// <summary>
        /// Mouse down and get the formLocation.
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void FormMainMouseDown(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
            {
                x = e.X;
                y = e.Y;
            }
        }

        /// <summary>
        /// Mouse Move and set the new location.
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
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
