using WCF.Constracts;
using WCF.DAL;

namespace WCF.BAL
{
    /// <summary>
    /// Implements methods of IExamRecordService.
    /// </summary>
    public class ExamRecordService : IExamRecordService
    {
        private IExamRecordDao examRecordDao;

        public ExamRecordService(IExamRecordDao examRecordDao)
        {
            this.examRecordDao = examRecordDao;
        }

        public ExamRecordService() : this(new ExamRecordDao())
        {

        }

        ///<see cref="IExamRecordService.AddExamRecord"/>
        public int AddExamRecord(ExamRecord examRecord)
        {

            if (examRecord == null)
            {
                throw new ParameterException();
            }

            return examRecordDao.InsertExamRecord(examRecord);
        }

        ///<see cref="IExamRecordService.UpdateExamRecord"/>
        public int UpdateExamRecord(ExamRecord examRecord)
        {

            if (examRecord == null)
            {
                throw new ParameterException();
            }

            return examRecordDao.UpdateExamRecord(examRecord);
        }

        /// <see cref="IExamRecordService.AddUserExamResult"/>
        public int AddUserExamResult(UserExamScore userExamScore)
        {

            if (userExamScore == null)
            {
                throw new ParameterException();
            }

            return examRecordDao.AddUserExamResult(userExamScore);
        }

        /// <see cref="IExamRecordService.UpdateUserScoreExam"/>
        public int UpdateUserScoreExam(UserExamScore userExam)
        {

            if (userExam == null)
            {
                throw new ParameterException();
            }

            return examRecordDao.UpdateUserScoreExam(userExam);
        }

        /// <see cref="IExamRecordService.UpdateUserFinishTime"/>
        public int UpdateUserFinishTime(UserExamScore userExamScore)
        {

            if (userExamScore == null)
            {
                throw new ParameterException();
            }

            return examRecordDao.UpdateUserFinishTime(userExamScore);
        }

        /// <see cref="IExamRecordService.GetUserExamScore"/>
        public UserExamScore GetUserExamScore(int examId, int userId)
        {
            return examRecordDao.GetUserExamScore(examId, userId);
        }
    }
}
