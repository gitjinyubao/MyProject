using WCF.Constracts;
using WCF.DAL;
using log4net;
using System;

namespace WCF.BAL
{
    /// <summary>
    /// Implements methods of IExamRecordService.
    /// </summary>
    public class ExamRecordService : IExamRecordService
    {
        IExamRecordDao examRecordDao = new ExamRecordDao();
        IExamDao examDao = new ExamDao();
        private ILog log;

        public ExamRecordService()
        {
            this.log = LogManager.GetLogger(this.GetType());
        }

        ///<see cref="IExamRecordService.AddExamRecord"/>
        public void AddExamRecord(ExamRecord examRecord)
        {

            if (examRecord == null)
            {
                log.Info(new ParameterException().Message);
                throw new ParameterException();
            }

            examRecordDao.InsertExamRecord(examRecord);
        }

        ///<see cref="IExamRecordService.UpdateExamRecord"/>
        public void UpdateExamRecord(ExamRecord examRecord)
        {

            if (examRecord == null)
            {
                log.Info(new ParameterException().Message);
                throw new ParameterException();
            }

            examRecordDao.UpdateExamRecord(examRecord);
        }

        /// <see cref="IExamRecordService.AddUserExamResult"/>
        public void AddUserExamResult(UserExamScore userExamScore)
        {

            if (userExamScore == null)
            {
                log.Info(new ParameterException().Message);
                throw new ParameterException();
            }

            examRecordDao.AddUserExamResult(userExamScore);
        }

        /// <see cref="IExamRecordService.UpdateUserScoreExam"/>
        public void UpdateUserScoreExam(UserExamScore userExam)
        {

            if (userExam == null)
            {
                log.Info(new ParameterException().Message);
                throw new ParameterException();
            }

            examRecordDao.UpdateUserScoreExam(userExam);

            int countStudentOfExam = examDao.GetExamineeCount(userExam.ExamId);

            int countStudentOfPass = examDao.GetCountOfPassingExam(userExam.ExamId);

            int countStudentOfDoIt = examDao.GetCountOfDoingExam(userExam.ExamId);

            int averageScore = examDao.GetExamAverageScoreByExamId(userExam.ExamId);

            double passRateDouble = countStudentOfPass / (countStudentOfExam - countStudentOfDoIt);

            int passRateInt = Convert.ToInt32(passRateDouble * 100);

            string passRateString = passRateInt.ToString() + "%";

            examDao.UpdateExamInformationAboutExamRecord(userExam.ExamId, averageScore.ToString(), passRateString, countStudentOfPass.ToString());
        }

        /// <see cref="IExamRecordService.UpdateUserFinishTime"/>
        public void UpdateUserFinishTime(UserExamScore userExamScore)
        {

            if (userExamScore == null)
            {
                log.Info(new ParameterException().Message);
                throw new ParameterException();
            }

            examRecordDao.UpdateUserFinishTime(userExamScore);
        }

        /// <see cref="IExamRecordService.GetUserExamScore"/>
        public UserExamScore GetUserExamScore(int examId, int userId)
        {
            return examRecordDao.GetUserExamScore(examId, userId);
        }
    }
}
