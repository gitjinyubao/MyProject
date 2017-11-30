using System;
using System.Collections.ObjectModel;
using WCF.Constracts;

namespace WCF.DAL
{
    /// <summary>
    /// Defined the method to option the date about question.
    /// </summary>
    public interface IQuestionsDao
    {
        /// <summary>
        /// Get questions's id by exam's id.
        /// </summary>
        /// <param name="examId">exams's id</param>
        /// <returns>The collection of questions's id</returns>
        Collection<Int32> GetQuestionsId(int examId);

        /// <summary>
        /// Get questions by questions' id.
        /// </summary>
        /// <param name="questionsId">questions's id</param>
        /// <returns>Questions object</returns>
        Questions GetQuestions(int questionsId);

        /// <summary>
        /// Get ExamQuextions object.
        /// </summary>
        /// <param name="examId">The exam id</param>
        /// <param name="questionsId">The questions id</param>
        /// <returns>ExamQuextions object</returns>
        ExamQuextions GetExamQuestions(int examId, int questionsId);

        /// <summary>
        /// Get user's questions answer
        /// </summary>
        /// <param name="examId">The exam's id</param>
        /// <param name="userId">The user's id</param>
        /// <returns>The collection of questions's answer</returns>
        Collection<ExamRecord> GetUserQuestionsRecord(int examId, int userId);
    }
}
