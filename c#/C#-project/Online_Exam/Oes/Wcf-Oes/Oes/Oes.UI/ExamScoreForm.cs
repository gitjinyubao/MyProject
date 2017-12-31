using System;
using System.Drawing;
using System.Windows.Forms;
using Oes.Entity.Custom;

namespace Oes.Entity
{
    public partial class examScoreForm : Form
    {
        // x and y represent this form location
        private int x, y;

        // Defines a globle variable of ExamDetail object
        private ExamDetail examDetail;

        public examScoreForm(ExamDetail examDetail)
        {
            this.examDetail = examDetail;

            InitializeComponent();

            // Initializes label's text
            InitailizationLabel();

            this.btnGoToExamDetail.Click += new EventHandler(LblGoToExamDetailClick);

            this.ExamTabPageTitleHead.MinimizeClick +=new EventHandler(ExamTabPageTitleHeadMinimizeClick);

            // Adds event to implement function of form relocation
            this.MouseDown += new MouseEventHandler(FormMainMouseDown);
            this.MouseMove += new MouseEventHandler(FormMainMouseMove);

            this.ExamTabPageTitleHead.ClosFormClick += new EventHandler(CloseFormClick);
        }

        /// <summary>
        /// Handles lblGoToExamDetail click event .
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void LblGoToExamDetailClick(object sender, EventArgs e)
        {
            this.Hide();
            examDetailForm examDetailForm = new examDetailForm(examDetail);
            examDetailForm.ShowDialog();
            Application.ExitThread();
        }

        /// <summary>
        /// Initializes label's text
        /// </summary>
        private void InitailizationLabel()
        {
            this.lblQuestiosTitle.Text = Constans.YourScoreIs + examDetail.Exam.ExamScore + Constans.PointsYouGot + examDetail.Exam.RightAnswerQuentity + Constans.InThisText;
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

        /// <summary>
        /// Minizes this form.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">object</param>
        private void ExamTabPageTitleHeadMinimizeClick(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }

        /// <summary>
        /// Exits application.
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void CloseFormClick(object sender, EventArgs e)
        {
            this.Hide();
            MainForm mainform = new MainForm();
            mainform.ShowDialog();
            Application.ExitThread();
        }
    }
}
