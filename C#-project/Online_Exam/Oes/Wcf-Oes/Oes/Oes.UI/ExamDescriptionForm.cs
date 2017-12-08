using System;
using System.Drawing;
using System.Windows.Forms;
using Oes.Entity.Custom;
using Oes.Entity.util;

namespace Oes.Entity
{
    public partial class examDescriptionForm : Form
    {
        // x and y represent this form location
        private int x, y;

        // Defines a class member of examDetail to improve exam's information
        private ExamDetail examDetail;

        // Defines a global variable of effictiveTime to improve data for method
        private DateTime effictiveTime;

        public examDescriptionForm(ExamDetail examDetail)
        {
            this.examDetail = examDetail;

            effictiveTime = examDetail.Exam.EffictiveTime;

            InitializeComponent();

            InitialExamDetail(examDetail);

            this.lblReturn.Click += new EventHandler(RetuenToMainForm);
            this.btnStartExam.Click += new EventHandler(LblStartTestingClick);

            this.LblMakeFormSmal.Click += new EventHandler(LblMakeFormSmalClick);

            // Adds event to implement function of form relocation
            this.MouseDown += new MouseEventHandler(FormMainMouseDown);
            this.MouseMove += new MouseEventHandler(FormMainMouseMove);

            this.LblCloseForm.Click += new EventHandler(CloseMainForm);
        }

        /// <summary>
        /// Handles lblStartTesting click event to implement the function of Clicking the start test button.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void LblStartTestingClick(object sender, EventArgs e)
        {
            if (Constans.ZeroTime.Equals(this.lblShowTime.Text))
            {
                this.btnStartExam.Cursor = Cursors.No;
                this.btnStartExam.Enabled = false;
                this.btnStartExam.Text = Constans.CanNotDo;
            }
            else
            {
                this.Hide();
                DoExamForm doExamForm = new DoExamForm(this.examDetail);
                doExamForm.ShowDialog();
                Application.ExitThread();
            }
        }

        /// <summary>
        /// Initializes exam information on this page.
        /// </summary>
        /// <param name="examDetail">ExamDetail object</param>
        private void InitialExamDetail(ExamDetail examDetail)
        {
            this.lblExamName.Text = examDetail.Exam.Name;
            this.lblExamIdNumber.Text = examDetail.Exam.Number;
            this.lblExamEffectiveTime.Text = examDetail.Exam.EffictiveTime.ToString();
            this.lblExamEndTime.Text = examDetail.Exam.EffictiveTime.AddHours(8.0).ToString();
            this.lblExamDuration.Text = examDetail.Exam.Duration + Constans.Space + Constans.Min;
            this.lblExamTotalScore.Text = examDetail.Exam.TotalScore;
            this.lblExamQuestionsNumber.Text = examDetail.Exam.QuestionQuantity;
        }

        /// <summary>
        /// Handles timer tick event to implement the function of count down.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void TimerTick(object sender, EventArgs e)
        {
            this.tirExamTime.Start();
            TimeSpan ts = effictiveTime - DateTime.Now;

            if (ts.TotalSeconds < 0.0)
            {
                this.tirExamTime.Enabled = false;
                this.lblShowTime.Text = Constans.ZeroTime;
            }
            else
            {
                TimeSpanToString timeSpanToString = new TimeSpanToString();
                this.lblShowTime.Text = timeSpanToString.GetStringFromTimeSpan(ts);
            }
        }

        /// <summary>
        /// Handles btnReturn click event to return MainForm.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void RetuenToMainForm(object sender, EventArgs e)
        {
            this.Hide();
            MainForm mainForm = new MainForm();
            mainForm.ShowDialog();
            Application.ExitThread();
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

        /// <summary>
        /// Minizes this form.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">object</param>
        private void LblMakeFormSmalClick(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }

        /// <summary>
        /// Handles click for lblCloseForm to close this form.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void CloseMainForm(object sender, EventArgs e)
        {
            this.Hide();
            MainForm mainform = new MainForm();
            mainform.ShowDialog();
            Application.ExitThread();
        }
    }
}
