using System;
using System.Collections.ObjectModel;
using System.Drawing;
using System.ServiceModel;
using System.Windows.Forms;
using Oes.Entity.Custom;
using Oes.Entity.util;
using WCF.Constracts;

namespace Oes.Entity
{
    public partial class DoExamForm : Form
    {
        // x and y represent this form location
        private int x, y;

        // Defines a class member of examDetail to improve exam's information
        private ExamDetail examDetail;

        // Defines a global variable of examRecord to improve examRecord's information
        private ExamRecord examRecord = new ExamRecord();

        // Defines a global variable of questionsIds that include the current exam's questions id
        private Collection<Int32> questionsIds = new Collection<Int32>();

        // Defines a global variable of isFirstCome that represent the first time to enter DoExamForm
        private Boolean isFirstCome = true;

        // Defines a global variable of nextQuestionNumber that represent collection of questionsIds index
        private int nextQuestionNumber = 0;

        // Defines a global variable of firestTime that represent the time which user enters DoExamForm for the first time
        private DateTime firstTime = DateTime.Now;

        // Defines a global variable of rightAnswerQuentity that represent the right answer's sum for questions
        private int rightAnswerQuentity = 0;

        public DoExamForm(ExamDetail examDetail)
        {
            this.examDetail = examDetail;

            GetQuestionsId(examDetail);

            InitializeComponent();

            this.tirExamTime.Tick += new EventHandler(TirExamTimeTick);

            InitefirstQuestion(questionsIds[nextQuestionNumber]);

            // Adds event to implement function of form relocation
            this.MouseDown += new MouseEventHandler(FormMainMouseDown);
            this.MouseMove += new MouseEventHandler(FormMainMouseMove);

            InitExamRecord();

            this.lblNextQuestions.Click += new EventHandler(LblNextQuestionsClick);
            this.examTabPageTitleHead.MinimizeClick += new EventHandler(LblMakeFormSmalClick);
            this.examTabPageTitleHead.ClosFormClick += new EventHandler(CloseTakeExamFormClick);
        }

        /// <summary>
        /// Handles tick for tirExamTime.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void TirExamTimeTick(object sender, EventArgs e)
        {
            this.tirExamTime.Start();

            if (isFirstCome)
            {
                double durationHour = Convert.ToDouble(FindExamDuration()) / Constans.SixtyMinutes;
                firstTime = DateTime.Now.AddHours(durationHour);
                isFirstCome = false;
            }
            else
            {
                // Nothing to do.
            }

            TimeSpan ts = firstTime - DateTime.Now;
            TimeSpanToString timeSpanToString = new TimeSpanToString();
            this.LblShowTime.Text = timeSpanToString.GetStringFromTimeSpan(ts);

            if (ts.TotalSeconds < 0.0)
            {
                this.tirExamTime.Enabled = false;

                UpdateUserScoreExam();

                MessageBox.Show(Constans.TheTimeIsOver);

                examDetail.Exam.RightAnswerQuentity = rightAnswerQuentity.ToString();
                this.Hide();
                examScoreForm examScoreForm = new examScoreForm(examDetail);
                examScoreForm.ShowDialog();
                Application.ExitThread();
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

                Collection<ExamRecord> examRecords = GetExamUserRecord(examDetail.Exam.Id, UserSession.CurrentUser.Id);

                if (examRecords.Count < Convert.ToInt32(examDetail.Exam.QuestionQuantity) && examRecords.Count > 0)
                {
                    nextQuestionNumber = examRecords.Count;
                }
                else
                {
                    // Nothing to do
                }
            }
        }

        /// <summary>
        /// Initiazes the exam record.
        /// </summary>
        private void InitExamRecord()
        {
            examRecord.UserId = UserSession.CurrentUser.Id;
            examRecord.ExaId = examDetail.Exam.Id;
        }

        /// <summary>
        /// Initialzes questions information on this form.
        /// </summary>
        /// <param name="questionsId">questions's id</param>
        private void InitefirstQuestion(int questionsId)
        {
            Questions questions = new Questions();

            using (ChannelFactory<IQuestionsService> factory = new ChannelFactory<IQuestionsService>(Constans.QuestionsService))
            {
                IQuestionsService questionService = factory.CreateChannel();
                
                questions = questionService.GetQuestion(questionsId);
            }

            this.lblQuestiosTitle.Text = questionsId.ToString() + Constans.TwoSpace + questions.que_title;
            this.rdoQuestionsA.Text = Constans.ASprit + questions.que_a_content;
            this.rdoQuestionsB.Text = Constans.BSprit + questions.que_b_content;
            this.rdoQuestionsC.Text = Constans.CSprit + questions.que_c_content;
            this.rdoQuestionsD.Text = Constans.DSprit + questions.que_d_content;
            examRecord.QueId = questionsId;

            this.LblQuestionNumber.Text = (nextQuestionNumber + 1).ToString() + Constans.Sprit + examDetail.Exam.QuestionQuantity;

            if (isFirstCome)
            {
                ++nextQuestionNumber;
            }
            else
            {
                // Nothing to do
            }

            this.rdoQuestionsA.Checked = false;
            this.rdoQuestionsB.Checked = false;
            this.rdoQuestionsC.Checked = false;
            this.rdoQuestionsD.Checked = false;
         }

        /// <summary>
        /// Handles lblNextQuestion click event.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void LblNextQuestionsClick(object sender, EventArgs e)
        {

            // Takes notes user's answer and changes radio's style
            if (nextQuestionNumber <= questionsIds.Count)
            {
                Boolean isOneRadioChecked = false;

                if (this.rdoQuestionsA.Checked == true)
                {
                    examRecord.UserAnswer = Constans.A;
                    isOneRadioChecked = true;
                }
                else if (this.rdoQuestionsB.Checked == true)
                {
                    examRecord.UserAnswer = Constans.B;
                    isOneRadioChecked = true;
                }
                else if (this.rdoQuestionsC.Checked == true)
                {
                    examRecord.UserAnswer = Constans.C;
                    isOneRadioChecked = true;
                }
                else if (this.rdoQuestionsD.Checked == true)
                {
                    examRecord.UserAnswer = Constans.D;
                    isOneRadioChecked = true;
                }
                else
                {
                    // Nothing To Do
                }

                this.lblNextQuestions.Text = (nextQuestionNumber + 1) >= questionsIds.Count ? Constans.GetScore : Constans.NextQuestions;

                // Adds user's exam record
                if (isOneRadioChecked)
                {
                    if (nextQuestionNumber < questionsIds.Count)
                    {
                        AddUserQuestionsRecord(examRecord);
                        InitefirstQuestion(questionsIds[nextQuestionNumber]);

                        this.LblQuestionNumber.Text = (nextQuestionNumber + 1) + Constans.Sprit + examDetail.Exam.QuestionQuantity;
                        ++nextQuestionNumber;
                    }
                    else
                    {
                        AddUserQuestionsRecord(examRecord);

                        UpdateUserScoreExam();

                        this.tirExamTime.Enabled = false;

                        this.Hide();
                        examDetail.Exam.RightAnswerQuentity = rightAnswerQuentity.ToString();
                        examScoreForm examScoreForm = new examScoreForm(examDetail);
                        examScoreForm.ShowDialog();
                        Application.ExitThread();
                    }
                }
            }
        }

        /// <summary>
        /// Gets student's score.
        /// </summary>
        /// <param name="examId">exam's id</param>
        /// <param name="userId">user's id</param>
        /// <returns></returns>
        private string GetUserScore(int examId, int userId)
        {
            // Initializes student's score of zero
            int score = 0;

            Collection<ExamRecord> userQuestionsRecords = new Collection<ExamRecord>();

            // Gets student's exam record
            userQuestionsRecords = GetExamUserRecord(examId, userId);

            for (int i = 0; i < userQuestionsRecords.Count; ++i)
            {
                ExamQuextions examquestion = GetExamQuestion(examId, questionsIds[i]);

                examRecord.ExaId = examId;
                examRecord.QueId = questionsIds[i];
                examRecord.UserAnswer = userQuestionsRecords[i].UserAnswer;
                examRecord.RightAnswer = examquestion.QuestionsAnswer;
                examRecord.UserId = UserSession.CurrentUser.Id;

                if (userQuestionsRecords[i].UserAnswer.Equals(examquestion.QuestionsAnswer))
                {
                    score += Convert.ToInt32(examquestion.QuestionsScore);
                    examRecord.QuestionStatus = Constans.Right;

                    ++rightAnswerQuentity;
                }
                else
                {
                    examRecord.QuestionStatus = Constans.Wrong;
                }

                UpdateUserExamRecord(examRecord);
            }

            return score.ToString();
        }

        /// <summary>
        /// Gets user's record in exam.
        /// </summary>
        /// <param name="examId">exam's id</param>
        /// <param name="userId">user's id</param>
        /// <returns>the collection of ExamRecord object</returns>
        private Collection<ExamRecord> GetExamUserRecord(int examId, int userId)
        {
            using (ChannelFactory<IQuestionsService> factory = new ChannelFactory<IQuestionsService>(Constans.QuestionsService))
            {
                IQuestionsService questionService = factory.CreateChannel();

                return questionService.GetUserQuestionsRecord(examId, userId);
            }
        }

        /// <summary>
        /// Gets the questions;s information in exam.
        /// </summary>
        /// <param name="examId">exam's id</param>
        /// <param name="questionsId">questions's id</param>
        /// <returns>ExamQuextions object</returns>
        private ExamQuextions GetExamQuestion(int examId, int questionsId)
        {
            using (ChannelFactory<IQuestionsService> factory = new ChannelFactory<IQuestionsService>(Constans.QuestionsService))
            {
                IQuestionsService questionService = factory.CreateChannel();

                return questionService.GetExamQuestions(examId, questionsId);
            }
        }

        /// <summary>
        /// Adds user's exam result.
        /// </summary>
        /// <param name="userExamScore">UserExamScore object</param>
        private void AddUserExamResult(UserExamScore userExamScore)
        {
            using (ChannelFactory<IExamRecordService> factory = new ChannelFactory<IExamRecordService>(Constans.ExamRecordService))
            {
                IExamRecordService examRecordService = factory.CreateChannel();
                examRecordService.AddUserExamResult(userExamScore);
            }
        }

        /// <summary>
        /// Updates user's exam record about questions status and rightAnswer.
        /// </summary>
        /// <param name="userExamScore">ExamRecord object</param>
        private void UpdateUserExamRecord(ExamRecord examRecord)
        {
            using (ChannelFactory<IExamRecordService> factory = new ChannelFactory<IExamRecordService>(Constans.ExamRecordService))
            {
                IExamRecordService examRecordService = factory.CreateChannel();
                examRecordService.UpdateExamRecord(examRecord);
            }
        }

        /// <summary>
        /// Adds user's exam record.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        private void AddUserQuestionsRecord(ExamRecord examRecord)
        {
            using (ChannelFactory<IExamRecordService> factory = new ChannelFactory<IExamRecordService>(Constans.ExamRecordService))
            {
                IExamRecordService examRecordService = factory.CreateChannel();
                examRecordService.AddExamRecord(examRecord);
            }
        }

        /// <summary>
        /// Updates user's exam record about finishtime and the exam's status.
        /// </summary>
        private void UpdateUserScoreExam()
        {
            using (ChannelFactory<IExamRecordService> factory = new ChannelFactory<IExamRecordService>(Constans.ExamRecordService))
            {
                examDetail.Exam.ExamScore = GetUserScore(examDetail.Exam.Id, UserSession.CurrentUser.Id);

                UserExamScore userExam = new UserExamScore();
                userExam.Operations = (Convert.ToInt32(examDetail.Exam.ExamScore) >= Convert.ToInt32(examDetail.Exam.PassCriteria) ? Constans.Pass : Constans.NoPass);
                userExam.Score = examDetail.Exam.ExamScore;
                userExam.UserId = UserSession.CurrentUser.Id;
                userExam.ExamKind = Constans.ExamFinished;
                userExam.ExamId = examDetail.Exam.Id;
                userExam.ScoreIndividureTotal = userExam.Score + Constans.Sprit + examDetail.Exam.TotalScore;

                CalculateFinishTime calculateFinishTime = new CalculateFinishTime();
                string examDuration = calculateFinishTime.GetFinishTime(this.LblShowTime.Text);
                userExam.FinishTime = examDuration;

                IExamRecordService examRecordService = factory.CreateChannel();
                examRecordService.UpdateUserScoreExam(userExam);
            }
        }

        /// <summary>
        /// Gets remainint time.
        /// </summary>
        /// <param name="time">time</param>
        /// <returns>remainint time</returns>
        private string GetRemainintTime(string time)
        {
            DateTime remainTime = Convert.ToDateTime(this.LblShowTime.Text);
            DateTime zeroTime = Convert.ToDateTime(Constans.ZeroTime);
            TimeSpan ts = remainTime.Subtract(zeroTime);
            int remainTimeMinutes = Convert.ToInt32(ts.TotalMinutes);
            return remainTimeMinutes.ToString();
        }

        /// <summary>
        /// Finds exam's duration.
        /// </summary>
        /// <returns>Exam's duration</returns>
        private string FindExamDuration()
        {
            UserExamScore userExamScore = new UserExamScore();

            using (ChannelFactory<IExamRecordService> factory = new ChannelFactory<IExamRecordService>(Constans.ExamRecordService))
            {
                IExamRecordService examRecordService = factory.CreateChannel();
                userExamScore = examRecordService.GetUserExamScore(examDetail.Exam.Id, UserSession.CurrentUser.Id);
                return userExamScore.FinishTime;
            }
        }

        /// <summary>
        /// Updates the time of finishing exam.
        /// </summary>
        private void UpdateFinishedTime()
        {
            UserExamScore userExamScore = new UserExamScore();

            userExamScore.ExamId = examDetail.Exam.Id;
            userExamScore.UserId = UserSession.CurrentUser.Id;
            CalculateFinishTime calculateFinishTime = new CalculateFinishTime();
            string examDuration = calculateFinishTime.GetFinishTime(this.LblShowTime.Text);
            userExamScore.FinishTime = examDuration;

            using (ChannelFactory<IExamRecordService> factory = new ChannelFactory<IExamRecordService>(Constans.ExamRecordService))
            {
                IExamRecordService examRecordService = factory.CreateChannel();
                examRecordService.UpdateUserFinishTime(userExamScore);
            }
        }

        #region Change form location
        /// <summary>
        /// Mouse down and get the formLocation.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
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
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
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
        /// Exits application.
        /// </summary>
        /// <param name="sender">sender</param>
        /// <param name="e">event</param>
        private void CloseTakeExamFormClick(object sender, EventArgs e)
        {
            UpdateFinishedTime();

            this.tirExamTime.Stop();

            this.Hide();
            MainForm mainform = new MainForm();
            mainform.ShowDialog();
            Application.ExitThread();
        }
    }
}
