using WCF.Constracts;

namespace WCF.DAL
{
    /// <summary>
    /// Defineds the method to option the date about exam record.
    /// </summary>
    public interface IExamRecordDao
    {
        /// <summary>
        /// Adds user's exam record about questions answer.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        void InsertExamRecord(ExamRecord examRecord);

        /// <summary>
        /// Updates user's exam record about questions status and right answer.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        void UpdateExamRecord(ExamRecord examRecord);

        /// <summary>
        /// Adds user's exam record about score.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        void AddUserExamResult(UserExamScore userExamScore);

        /// <summary>
        /// Updates user's exam record about finishTime and score and examKind.
        /// </summary>
        /// <param name="userExam"></param>
        void UpdateUserScoreExam(UserExamScore userExam);

        /// <summary>
        /// Updates user's exam record about finishTime.
        /// </summary>
        /// <param name="userExamScore">UserExamScore object</param>
        void UpdateUserFinishTime(UserExamScore userExamScore);

        /// <summary>
        /// Gets user exam details.
        /// </summary>
        /// <param name="examId">exam's id</param>
        /// <param name="userId">user's id</param>
        /// <returns>UserExamScore object</returns>
        UserExamScore GetUserExamScore(int examId, int userId);
    }
}
