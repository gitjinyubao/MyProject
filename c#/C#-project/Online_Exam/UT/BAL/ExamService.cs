using System.Collections.ObjectModel;
using WCF.Constracts;
using WCF.DAL;

namespace WCF.BAL
{
    /// <summary>
    /// Implements methods of IExamService.
    /// </summary>
    public class ExamService : IExamService
    {
        private IExamDao examDao;

        public ExamService(IExamDao examDao)
        {
            this.examDao = examDao;
        }

        public ExamService() : this(new ExamDao())
        {

        }

        /// <see cref="IExamService.ShowExamList"/>
        public Collection<MyExamListIterm> ShowExamList(ExamPagenation pagenation)
        {

            if (pagenation == null)
            {
                throw new ParameterException();
            }

            return examDao.QueryUserExam(pagenation);
        }

        /// <see cref="IExamService.GetExamTotalCount"/>
        public int GetExamTotalCount(ExamPagenation pagenation)
        {

            if (pagenation == null)
            {
                throw new ParameterException();
            }

            return (examDao.GetExamTotal(pagenation));
        }
    }
}
