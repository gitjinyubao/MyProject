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
    public partial class MainForm : Form
    {
        // Defines the number one pagenation's of label width
        private int pageNumberOneWidth = 0;

        // Defines the pnlExamPagination's of panel width
        private int pnlExamPaginationWidth = 0;

        // Determines student come there first
        private Boolean isFirstCome = true;

        // Initializes controllerNumber
        private int controllerNumber = 0;
        private ExamPagenation pagenation = new ExamPagenation();

        // Defines the changeBeforeTextPageNumber of changing textPageNumber.
        private string changeBeforeTextPageNumber;

        // x and y represent this form location
        private int x, y;

        // ExamSelectKind's collection
        private Collection<SelectKindExam> kindExams;

        // ExamSelectKind's collection
        private Collection<KindAbout> kindAbout;

        public MainForm()
        {
            // Initializes order's way and order's name
            pagenation.OrderWay = Constans.Asc;
            pagenation.OrderName = Constans.Id;
            pagenation.KeyWord = Constans.Empty;

            InitializeComponent();

            // Initializes the page data
            InitExamsInfo();
            AddNoticeIterm();
            ShowUserName();

            // Initiazes the number on CboPageSize
            this.cboPageSize.SelectedIndex = Constans.NumberTwoInt;

            // Adds controllers to a collection about SelectKindExam
            this.kindExams = new Collection<SelectKindExam>();
            this.kindExams.Add(this.skeAll);
            this.kindExams.Add(this.skeFinished);
            this.kindExams.Add(this.skeUnFinished);

            // Adds click event to implement that get different find data
            this.skeAll.ControlClick += SelectkindExamClick;
            this.skeFinished.ControlClick += SelectkindExamClick;
            this.skeUnFinished.ControlClick += SelectkindExamClick;

            // Adds controllers to a collection about SelectKindAbout
            this.kindAbout = new Collection<KindAbout>();
            this.kindAbout.Add(this.kaExaminationRules);
            this.kindAbout.Add(this.kaSystemInformation);
            this.kindAbout.Add(this.kaContactUs);

            // Adds click event to implement that get different find data
            this.kaExaminationRules.KindAboutControlClick += SelectkindAbout;
            this.kaSystemInformation.KindAboutControlClick += SelectkindAbout;
            this.kaContactUs.KindAboutControlClick += SelectkindAbout;

            // Adds click event to implement that query data by paging
            this.lblUpPage.Click += new EventHandler(UpPageOrDownClick);
            this.lblDownPage.Click += new EventHandler(UpPageOrDownClick);
            this.cboPageSize.SelectedValueChanged += new EventHandler(CboPageSizeClick);
            this.btnGoPage.Click += new EventHandler(BtnGoPageClick);

            // Adds click event to implement function of sequencing
            this.lblAscName.Click += new EventHandler(OrderPictureClick);
            this.lblDscExamTotalScore.Click += new EventHandler(OrderPictureClick);
            this.lblDscId.Click += new EventHandler(OrderPictureClick);
            this.lblDscPassCriteria.Click += new EventHandler(OrderPictureClick);
            this.lblDscTimeEffective.Click += new EventHandler(OrderPictureClick);
            this.lblDscOperation.Click += new EventHandler(OrderPictureClick);

            // Changes form location
            this.MouseDown += new MouseEventHandler(FormMainMouseDown);
            this.MouseMove += new MouseEventHandler(FormMainMouseMove);

            // Changes minform
            this.lblHome.Click += new EventHandler(lblHomeOrLblMyExamClick);
            this.lblMyExam.Click += new EventHandler(lblHomeOrLblMyExamClick);

            // Remember the pagenumber Before change number
            this.txtPageNumber.Enter += new EventHandler(TxtPageNumberEnter);

            // Changes home content
            this.lblAbout.Click += new EventHandler(lblAboutOrNoticeClick);
            this.lblNotice.Click += new EventHandler(lblAboutOrNoticeClick);

            // ChangeLanguage
            this.lblChineseLanguage.Click += new EventHandler(LblChineseLanguageClick);

            // Logout
            this.lblLogout.Click += new EventHandler(LblLogoutClick);

            // Minimize
            this.LblMakeFormSmal.Click += new EventHandler(LblMakeFormSmalClick);

            // Closes form
            this.LblCloseForm.Click += new EventHandler(CloseMainForm);
        }

        /// <summary>
        /// Handles txtPageNumber click event.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void TxtPageNumberEnter(object sender, EventArgs e)
        {
            changeBeforeTextPageNumber = this.txtPageNumber.Text;
        }

        /// <summary>
        /// Handles lblChineseLanguage click event
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void LblChineseLanguageClick(object sender, EventArgs e)
        {
            Label label = sender as Label;

            if (Constans.Engnish.Equals(label.Text))
            {
                SetLanguage.ReSetLanguage(Constans.En, this, typeof(MainForm));
                ShowUserName();
                label.Text = Constans.Chinese;
                DisplayLable();
            }
            else
            {
                SetLanguage.ReSetLanguage(Constans.ZhHans, this, typeof(MainForm));
                ShowUserName();
                label.Text = Constans.Engnish;
                DisplayLable();
            }
        }

        /// <summary>
        /// Handles lblNotice or lblAbout click event.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void lblAboutOrNoticeClick(object sender, EventArgs e)
        {
            Label label = sender as Label;

            if (label.Name.Equals(Constans.LblNotice))
            {
                this.lblNotice.BackColor = Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
                this.lblNotice.ForeColor = Color.White;
                this.lblAbout.BackColor = Color.White;
                this.lblAbout.ForeColor = Color.Black;
                this.pnlAboutIterms.Hide();
                this.pnlNoticeIterms.Show();
            }
            else
            {
                this.lblAbout.BackColor = Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
                this.lblAbout.ForeColor = Color.White;
                this.lblNotice.BackColor = Color.White;
                this.lblNotice.ForeColor = Color.Black;
                this.pnlAboutIterms.Show();
                this.pnlNoticeIterms.Hide();
            }
        }

        /// <summary>
        /// Handles lblHome or lblMyexam click event.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void lblHomeOrLblMyExamClick(object sender, EventArgs e)
        {
            Label label = sender as Label;

            if (label.Name.Equals(Constans.LblHome))
            {
                this.lblHome.BackColor = Color.FromArgb(((int)(((byte)(210)))), ((int)(((byte)(218)))), ((int)(((byte)(227)))));
                this.lblMyExam.BackColor = Color.White;
                this.pnlMainBody.Hide();
                this.pnlHome.Show();
            }
            else
            {
                this.lblHome.BackColor = Color.White;
                this.lblMyExam.BackColor = Color.FromArgb(((int)(((byte)(210)))), ((int)(((byte)(218)))), ((int)(((byte)(227)))));
                this.pnlMainBody.Show();
                this.pnlHome.Hide();
            }
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
                else if (Constans.E.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblDscExamTotalScore;
                    pagenation.OrderName = Constans.ScoreInDividureTotal;
                }
                else if (Constans.P.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblDscPassCriteria;
                    pagenation.OrderName = Constans.PassCriteria;
                }
                else if (Constans.T.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblDscTimeEffective;
                    pagenation.OrderName = Constans.EffectiveTime;
                }
                else if (Constans.O.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblDscOperation;
                    pagenation.OrderName = Constans.ScoreInDividureTotal;
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
                else if (Constans.E.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblAscExamTotalScore;
                    pagenation.OrderName = Constans.ScoreInDividureTotal;
                }
                else if (Constans.P.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblAscPassCriteria;
                    pagenation.OrderName = Constans.PassCriteria;
                }
                else if (Constans.T.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblAscTimeEffective;
                    pagenation.OrderName = Constans.EffectiveTime;
                }
                else if (Constans.O.Equals(name.Substring(6, 1)))
                {
                    lb.Name = Constans.LblAscOperation;
                    pagenation.OrderName = Constans.ScoreInDividureTotal;
                }
                else
                {
                    // Nothing to do.
                }

                pagenation.OrderWay = Constans.Asc;
                lb.Image = global::Oes.Entity.Properties.Resources.ICN_Increase_10x15_png;
            }

            pnlExams.Controls.Clear();
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
                pnlExams.Controls.Clear();
                InitExamsInfo();
            }
            else
            {
                this.txtPageNumber.Text = changeBeforeTextPageNumber;
            }
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
            pnlExams.Controls.Clear();
            InitExamsInfo();
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
                pnlExams.Controls.Clear();
                InitExamsInfo();
            }
            else
            {
                //Nothing to do.
            }
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
        /// Handles selectkindExam click event.
        /// </summary>
        /// <param name="sender">the sender</param>
        /// <param name="e">event</param>
        private void SelectkindExamClick(object sender, EventArgs e)
        {
            // The collection of kindExams include SkeAll and SkeFinished and SkeUnfished
            foreach(var iterm in kindExams)
            {
                if (iterm != sender)
                {
                    iterm.Selected = false;
                }
                else
                {
                    pnlExams.Controls.Clear();
                    pagenation.ExamKind = iterm.Name.Substring(3);
                    pagenation.CurrentPage = 1;
                    InitExamsInfo();
                }
            }
        }

        /// <summary>
        /// Handles kindAbout click event.
        /// </summary>
        /// <param name="sender">the sender</param>
        /// <param name="e">event</param>
        private void SelectkindAbout(object sender, EventArgs e)
        {
            foreach (var iterm in kindAbout)
            {
                if (iterm != sender)
                {
                    iterm.Selected = false;
                }
                else
                {
                    DisplayKindPanelOfAbout(iterm.Name);
                }
            }
        }

        /// <summary>
        /// Displays Kind Panel.
        /// </summary>
        /// <param name="name">name</param>
        private void DisplayKindPanelOfAbout(string name)
        {

            if (Constans.E.Equals(name.Substring(2, 1)))
            {
                this.pnlExaminationRules.Show();
                this.pnlSystemInformation.Hide();
                this.pnlContactus.Hide();
            }
            else if (Constans.S.Equals(name.Substring(2, 1)))
            {
                this.pnlExaminationRules.Hide();
                this.pnlSystemInformation.Show();
                this.pnlContactus.Hide();
            }
            else
            {
                this.pnlExaminationRules.Hide();
                this.pnlSystemInformation.Hide();
                this.pnlContactus.Show();
            }
        }

        /// <summary>
        /// Initializes exam list.
        /// </summary>
        private void InitExamsInfo()
        {
            // Gets the default pageSize from config
            string pagesize = ConfigurationManager.AppSettings[Constans.PageSize].ToString();

            if (isFirstCome)
            {
                pagenation.PageSize = Convert.ToInt32(pagesize);
                isFirstCome = false;
            }

            // Gets the user's id from UserSession
            pagenation.UserId = UserSession.CurrentUser.Id;

            Collection<StudentExamListIterm> exams = new Collection<StudentExamListIterm>();

            // Gets total count of data and the collection of MyExamListIterm object
            using (ChannelFactory<IExamService> factory = new ChannelFactory<IExamService>(Constans.ExamService))
            {
                IExamService examService = factory.CreateChannel();
                pagenation.TotalCount = examService.GetStudentExamTotalCount(pagenation);
                exams = examService.ShowStudentExamList(pagenation);
            }

            if (exams != null)
            {
                // Gets the value of controller's property
                for (int j = 0; j < exams.Count; j++)
                {
                    var exam = exams[j];
                    ExamDetail examDetail = new ExamDetail();
                    examDetail.Index = (j + 1).ToString();
                    examDetail.ExamName = exam.Name.Length > 15 ? exam.Name.Substring(0, 15) : exam.Name;
                    examDetail.ExamIdNumber = exam.Number;
                    examDetail.ExamEffictiveTime = (exam.EffictiveTime.ToString()).Substring(0);
                    examDetail.ExamDuration = exam.Duration;
                    examDetail.ExamPassCriteria = exam.PassCriteria;
                    examDetail.ExamDivisTotalScore = exam.ExamDivisTotalScore;
                    examDetail.ExamOperation = exam.Options;
                    examDetail.Exam = exam;

                    // Adds click event for controller
                    examDetail.ExamOpertionClick += new EventHandler(TakeExam);

                    // Defines the location of examDetail.
                    examDetail.Location = new Point(0, examDetail.Height * j);

                    examDetail.Lb1ExamNameClick += new EventHandler(ExamDetailLb1ExamNameClick);

                    // Adds controller into panel.
                    pnlExams.Controls.Add(examDetail);
                }

                this.txtPageNumber.Text = pagenation.CurrentPage.ToString();
                DisplayLable();
            }
            else
            {
                // Nothing to do.
            }
        }

        /// <summary>
        /// Handles click for ExamDetail.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">object</param>
        private void ExamDetailLb1ExamNameClick(object sender, EventArgs e)
        {
            ExamDetail examDetail = sender as ExamDetail;

            if (!Constans.Dashes.Equals(examDetail.Exam.ExamScore))
            {
                this.Hide();
                examDetailForm examDetailForm = new examDetailForm(examDetail);
                examDetailForm.ShowDialog();
                Application.ExitThread();
            }
            else
            {
                // Nothing to do
            }
        }

        /// <summary>
        /// Adds NoticeItermControll to pnlNoticeIterms.
        /// </summary>
        /// <param name="Exam">MyExamListIterm object</param>
        private void AddNoticeIterm()
        {
            Collection<StudentExamListIterm> examListIterms = new Collection<StudentExamListIterm>();

            using (ChannelFactory<IExamService> factory = new ChannelFactory<IExamService>(Constans.ExamService))
            {
                IExamService examService = factory.CreateChannel();
                examListIterms = examService.GetStudentUnfinishedExam(UserSession.CurrentUser.Id);
            }

            if (examListIterms != null)
            {
                for (int i = 0; i < examListIterms.Count; ++i)
                {
                    var examListIterm = examListIterms[i];
                    NoticeIterm iterm = new NoticeIterm();
                    iterm.Exam = examListIterm;
                    iterm.Index = (i + 1).ToString();
                    iterm.NoticeContentTitle = examListIterm.Name.Substring(0, 15);
                    iterm.NoticeContentTime = examListIterm.EffictiveTime.ToString();

                    // Defines the location of examDetail.
                    iterm.Location = new Point(0, iterm.Height * i);
                    iterm.lb1ExamNameClick += new EventHandler(ItermLb1ExamNameClick);

                    this.pnlNoticeIterms.Controls.Add(iterm);
                }
            }
            else
            {
                // Nothing to do
            }
        }

        /// <summary>
        /// Handles click for NoticeIterm.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void ItermLb1ExamNameClick(object sender, EventArgs e)
        {
            NoticeIterm noticeIterm = sender as NoticeIterm;
            ExamDetail examDetail = new ExamDetail();
            examDetail.Exam = noticeIterm.Exam;

            this.Hide();
            examDescriptionForm examDetailForm = new examDescriptionForm(examDetail);
            examDetailForm.ShowDialog();
            Application.ExitThread();
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

            if ((currentPage + Constans.NumberTwoInt) <= pageCount)
            {
                AddPageNumberController((currentPage + Constans.NumberOneInt).ToString());
            }

            if ((currentPage + Constans.NumberTwoInt) < pageCount)
            {
                AddPageNumberController((currentPage + Constans.NumberTwoInt).ToString());
            }

            if (currentPage + Constans.NumberThreeInt < pageCount)
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
            this.pnlExamPaginationRight.Location = new Point(pageNumberOneWidth + 300, 607);

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
        /// Handles click for onePageNumber to go to page.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void OnePageNumberClick(object sender, EventArgs e)
        {
            PageNumber pageNumber = sender as PageNumber;
            this.txtPageNumber.Text = pageNumber.OnePagenumber;
            pagenation.CurrentPage = Convert.ToInt32(this.txtPageNumber.Text);
            pnlExams.Controls.Clear();
            InitExamsInfo();
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
        /// Handles click to arrives the page to take a exam.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void TakeExam(object sender, EventArgs e)
        {
            ExamDetail examDetail = sender as ExamDetail;
            this.Hide();
            examDescriptionForm edf = new examDescriptionForm(examDetail);
            edf.ShowDialog();
            Application.ExitThread();
        }

        /// <summary>
        /// Handles LblMakeFormSmal click event to minimizs this form.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void LblMakeFormSmalClick(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }

        /// <summary>
        /// Exits this application.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void CloseMainForm(object sender, EventArgs e)
        {
            ExitLogin.ExitCurrentLogin(UserSession.CurrentUser.Id, DateTime.Now, false);
            Application.ExitThread();
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
