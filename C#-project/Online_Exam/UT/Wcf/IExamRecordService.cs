using System.ServiceModel;

namespace WCF.Constracts
{
    /// <summary>
    /// Improves methods to operate the method of ExamRecordDao.
    /// </summary>
    /// 
    [ServiceContract]
    public interface IExamRecordService
    {
        /// <summary>
        /// Adds user's exam record.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        [OperationContract]
        int AddExamRecord(ExamRecord examRecord);

        /// <summary>
        /// Updates user's exam record about questions status and right answer.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        [OperationContract]
        int UpdateExamRecord(ExamRecord examRecord);

        /// <summary>
        /// Adds user's exam record about score.
        /// </summary>
        /// <param name="userExamScore">UserExamScore</param>
        [OperationContract]
        int AddUserExamResult(UserExamScore userExamScore);

         /// <summary>
        /// Updates user's exam record about finishTime and score and examKind.
        /// </summary>
        /// <param name="userExam">UserExamScore object</param>
        [OperationContract]
        int UpdateUserScoreExam(UserExamScore userExam);

        /// <summary>
        /// Updates user's exam record about finishTime.
        /// </summary>
        /// <param name="userExamScore">UserExamScore object</param>
        [OperationContract]
        int UpdateUserFinishTime(UserExamScore userExamScore);

        /// <summary>
        /// Gets user exam details.
        /// </summary>
        /// <param name="examId">exam's id</param>
        /// <param name="userId">user's id</param>
        /// <returns>UserExamScore object</returns>
        [OperationContract]
        UserExamScore GetUserExamScore(int examId, int userId);
    }
}
