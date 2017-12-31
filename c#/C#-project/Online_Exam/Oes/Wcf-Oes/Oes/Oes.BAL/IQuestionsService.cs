using System;
using System.Collections.ObjectModel;
using Oes.Entity;

namespace Oes.BAL
{
    /// <summary>
    /// Improve methods to operate the method of QuestionsDao.
    /// </summary>
    public interface IQuestionsService
    {
        /// <summary>
        /// Get questions's id by exam's id.
        /// </summary>
        /// <param name="examId">exams's id</param>
        /// <returns>The collection of questions's id</returns>
        Questions GetQuestion(int questionsId);

        /// <summary>
        /// Get questions by questions' id.
        /// </summary>
        /// <param name="questionsId">questions's id</param>
        /// <returns>Questions object</returns>
        Collection<Int32> GetQuestionsId(int examId);
    }
}
