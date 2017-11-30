using System;
using System.Collections.ObjectModel;
using System.Drawing;
using System.ServiceModel;
using System.Windows.Forms;
using Oes.Entity.Custom;
using WCF.Constracts;

namespace Oes.Entity
{
    public partial class examDetailForm : Form
    {
        // x and y represent this form location
        private int x, y;

        // Defines a globle variable of  ExamDetail object
        private ExamDetail examDetail;

        // Defines a global variable of questionsIds that include the current exam's questions id
        private Collection<Int32> questionsIds = new Collection<Int32>();

        // Calculate the sum of right answer
        private int rightQuestionsCount = 0;

        public examDetailForm(ExamDetail examDetail)
        {
            this.examDetail = examDetail;

            InitializeComponent();

            InitializationQuestionsDetails(UserSession.CurrentUser.Id, examDetail.Exam.Id);

            InitializeExamInformation(examDetail);

            // Adds event to implement function of form relocation
            this.MouseDown += new MouseEventHandler(FormMainMouseDown);
            this.MouseMove += new MouseEventHandler(FormMainMouseMove);

            this.examTabPageTitleHead.ClosFormClick += new EventHandler(ClosForm);

            this.examTabPageTitleHead.MinimizeClick += new EventHandler(ExamTabPageTitleHeadMinimizeClick);
        }

        /// <summary>
        /// Initializes label's text.
        /// </summary>
        /// <param name="examDetail">ExamDetail object</param>
        private void InitializeExamInformation(ExamDetail examDetail)
        {
            StudentExamListIterm exam = examDetail.Exam;

            this.LblScore.Text = exam.ExamScore;
            this.LblRightAnswerSum.Text = rightQuestionsCount.ToString();
            this.lblExamName.Text = exam.Name;
            this.LblExamEffectiveTime.Text = exam.EffictiveTime.ToString();
            this.LblExamDuration.Text = exam.Duration + Constans.Space + Constans.Min;
            this.LblQuestionsQuntity.Text = exam.QuestionQuantity;
            this.LblIdNumber.Text = exam.Number;
            this.lblExamTotalScore.Text = exam.TotalScore;
            this.LblExamScoreRight.Text = exam.ExamScore;
        }

        /// <summary>
        /// Initializes questions details.
        /// </summary>
        /// <param name="userId">user's id</param>
        /// <param name="examId">exam's id</param>
        private void InitializationQuestionsDetails(int userId, int examId)
        {
            GetQuestionsId(examDetail);

            Collection<ExamRecord> userQuestionsRecord = GetexamUserRecord(examId, userId);

            if (questionsIds.Count > 0)
            {
                for (int i = 0; i < Convert.ToInt32(examDetail.Exam.QuestionQuantity); ++i)
                {
                    // Creates a controller of questionsDetail
                    QuestionsDetail questionsDetail = new QuestionsDetail();

                    Questions questions = GetexamQuestion(questionsIds[i]);

                    questionsDetail.QuestionsNumber = (i + 1).ToString();
                    questionsDetail.QuestionsTitle = questions.que_title;
                    questionsDetail.QuestionsAContent = questions.que_a_content;
                    questionsDetail.QuestionsBContent = questions.que_b_content;
                    questionsDetail.QuestionsCContent = questions.que_c_content;
                    questionsDetail.QuestionsDContent = questions.que_d_content;
                    questionsDetail.RightAnswer = questions.que_answer;

                    if (userQuestionsRecord.Count > i)
                    {
                        questionsDetail.UserAnswer = userQuestionsRecord[i].UserAnswer;
                        questionsDetail.QuestionsStatus = userQuestionsRecord[i].QuestionStatus;
                        rightQuestionsCount = Constans.Right.Equals(userQuestionsRecord[i].QuestionStatus) ? (rightQuestionsCount + 1) : rightQuestionsCount;
                    }
                    else
                    {
                        questionsDetail.QuestionsStatus = Constans.Wrong;
                        questionsDetail.UserAnswer = Constans.Space;
                    }

                    questionsDetail.Location = new Point(0, questionsDetail.Height * i);
                    this.pnlExamQuestionsDetail.Controls.Add(questionsDetail);
                }
            }
        }

        /// <summary>
        /// Gets the collection of questions id.
        /// </summary>
        /// <param name="examDetail">ExamDetail object</param>
        private void GetQuestionsId(ExamDetail examDetail)
        {
            using (ChannelFactory<IQuestionsService> factory = new ChannelFactory<IQuestionsService>(Constans.QuestionsService))
            {
                IQuestionsService questionService = factory.CreateChannel();
                questionsIds = questionService.GetQuestionsId(examDetail.Exam.Id);
            }
        }


        /// <summary>
        /// Gets user's record in exam.
        /// </summary>
        /// <param name="examId">exam's id</param>
        /// <param name="userId">user's id</param>
        /// <returns>the collection of ExamRecord object</returns>
        public Collection<ExamRecord> GetexamUserRecord(int examId, int userId)
        {
            using (ChannelFactory<IQuestionsService> factory = new ChannelFactory<IQuestionsService>(Constans.QuestionsService))
            {
                IQuestionsService questionService = factory.CreateChannel();
                return questionService.GetUserQuestionsRecord(examId, userId);
            }
        }

        /// <summary>
        /// Gets exam's questions.
        /// </summary>
        /// <param name="questionsId">questions's id</param>
        /// <returns>Questions object</returns>
        public Questions GetexamQuestion(int questionsId)
        {
            Questions questions = new Questions();

            using (ChannelFactory<IQuestionsService> factory = new ChannelFactory<IQuestionsService>(Constans.QuestionsService))
            {
                IQuestionsService questionService = factory.CreateChannel();
                questions = questionService.GetQuestion(questionsId);
            }

            questions = questions != null ? questions : null;

            return questions;
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
        private void ExamTabPageTitleHeadMinimizeClick(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }

        /// <summary>
        /// Handles click to close form
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void ClosForm(object sender, EventArgs e)
        {
            this.Hide();
            MainForm mainform = new MainForm();
            mainform.ShowDialog();
            Application.ExitThread();
        }
    }
}
