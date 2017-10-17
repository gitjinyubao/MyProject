using System.Collections.ObjectModel;
using WCF.Constracts;
using WCF.DAL;
using log4net;

namespace WCF.BAL
{
    /// <summary>
    /// Implements methods of IExamService.
    /// </summary>
    public class ExamService : IExamService
    {
        private IExamDao examDao;
        private ILog log;

        public ExamService()
        {
            this.examDao = new ExamDao();
            this.log = LogManager.GetLogger(this.GetType());
        }

        /// <see cref="IExamService.ShowStudentExamList"/>
        public Collection<StudentExamListIterm> ShowStudentExamList(ExamPagenation pagenation)
        {

            if (pagenation == null)
            {
                log.Info(new ParameterException().Message);
                throw new ParameterException();
            }

            return examDao.QueryStudentExam(pagenation);
        }

        /// <see cref="IExamService.GetStudentExamTotalCount"/>
        public int GetStudentExamTotalCount(ExamPagenation pagenation)
        {

            if (pagenation == null)
            {
                log.Info(new ParameterException().Message);
                throw new ParameterException();
            }

            return (examDao.GetStudentExamTotal(pagenation));
        }

        /// <see cref="IExamService.ShowTeacherExamList"/>
        public Collection<TeacherSearchExamListIterm> ShowTeacherExamList(ExamPagenation pagenation)
        {

            if (pagenation == null)
            {
                log.Info(new ParameterException().Message);
                throw new ParameterException();
            }

            return (examDao.QueryTeacherExam(pagenation));
        }

        /// <see cref="IExamService.GetTeacherExamTotalCount"/>
        public int GetTeacherExamTotalCount(string keyWord)
        {
            if(keyWord == null)
            {
                log.Info(new ParameterException().Message);
                throw new ParameterException();
            }

            return examDao.GetTeacherExamTotal(keyWord);
        }

        /// <see cref="IExamService.GetStudentUnfinishedExam"/>
        public Collection<StudentExamListIterm> GetStudentUnfinishedExam(int userId)
        {
            return examDao.GetStudentUnfinishedExam(userId);
        }
    }
}
