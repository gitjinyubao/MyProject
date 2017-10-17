using System;
using System.Collections.ObjectModel;
using System.ServiceModel;

namespace WCF.Constracts
{
    /// <summary>
    /// Improves methods to operate the method of QuestionsDao.
    /// </summary>
    [ServiceContract]
    public interface IQuestionsService
    {
        /// <summary>
        /// Gets questions's id by exam's id.
        /// </summary>
        /// <param name="examId">exams's id</param>
        /// <returns>The collection of questions's id</returns>
        [OperationContract]
        Questions GetQuestion(int questionsId);

        /// <summary>
        /// Gets questions by questions' id.
        /// </summary>
        /// <param name="questionsId">questions's id</param>
        /// <returns>Questions object</returns>
        [OperationContract]
        Collection<Int32> GetQuestionsId(int examId);

        /// <summary>
        /// Gets ExamQuextions object.
        /// </summary>
        /// <param name="examId">The exam id</param>
        /// <param name="questionsId">The questions id</param>
        /// <returns>ExamQuextions object</returns>
        [OperationContract]
        ExamQuextions GetExamQuestions(int examId, int questionsId);

        /// <summary>
        /// Gets user's questions answer
        /// </summary>
        /// <param name="examId">The exam's id</param>
        /// <param name="userId">The user's id</param>
        /// <returns>The collection of questions's answer</returns>
        [OperationContract]
        Collection<ExamRecord> GetUserQuestionsRecord(int examId, int userId);
    }
}
