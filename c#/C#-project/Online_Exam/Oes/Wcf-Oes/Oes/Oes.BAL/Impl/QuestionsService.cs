using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using Oes.Entity;
using Oes.DAL;

namespace Oes.BAL
{
    /// <summary>
    /// Implement methods of IQuestionsService.
    /// </summary>
    public class QuestionsService : IQuestionsService
    {
        IQuestionsDao questionsDao = new QuerstionsDao();

        /// <summary>
        /// Get questions by questions' id.
        /// </summary>
        /// <param name="questionsId">questions's id</param>
        /// <returns>Questions object</returns>
        public Questions GetQuestion(int questionsId)
        {
            return questionsDao.GetQuestions(questionsId);
        }

        /// <summary>
        /// Get questions's id by exam's id.
        /// </summary>
        /// <param name="examId">exams's id</param>
        /// <returns>The collection of questions's id</returns>
        public Collection<Int32> GetQuestionsId(int examId)
        {
            return questionsDao.GetQuestionsId(examId);
        }
    }
}
