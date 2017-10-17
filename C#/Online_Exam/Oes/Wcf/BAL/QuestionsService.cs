using System;
using System.Collections.ObjectModel;
using WCF.Constracts;
using WCF.DAL;

namespace WCF.BAL
{
    /// <summary>
    /// Implements methods of IQuestionsService.
    /// </summary>
    public class QuestionsService : IQuestionsService
    {
        IQuestionsDao questionsDao = new QuerstionsDao();

        /// <see cref="IQuestionsService.GetQuestion"/>
        public Questions GetQuestion(int questionsId)
        {
            return questionsDao.GetQuestions(questionsId);
        }

        /// <see cref="IQuestionsService.GetQuestionsId"/>
        public Collection<Int32> GetQuestionsId(int examId)
        {
            return questionsDao.GetQuestionsId(examId);
        }

        /// <see cref="IQuestionsService.GetExamQuestions"/>
        public ExamQuextions GetExamQuestions(int examId, int questionsId)
        {
            return questionsDao.GetExamQuestions(examId, questionsId);
        }

        /// <see cref="IQuestionsService.GetUserQuestionsRecord"/>
        public Collection<ExamRecord> GetUserQuestionsRecord(int examId, int userId)
        {
            return questionsDao.GetUserQuestionsRecord(examId, userId);
        }
    }
}
