using System;
using System.Collections.ObjectModel;
using Oes.Entity;

namespace Oes.DAL
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
    }
}
