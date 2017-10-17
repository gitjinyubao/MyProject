using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using Oes.DAL;
using Oes.Entity;

namespace Oes.BAL
{
    /// <summary>
    /// Implement methods of IExamService.
    /// </summary>
    public class ExamService : IExamService
    {
        IExamDao examDao = new ExamDao();

        /// <summary>
        /// Operate the database to get the data about exam list page.
        /// </summary>
        /// <param name="pagenation"></param>
        /// <returns>Collection</returns>
        public Collection<MyExamListIterm> ShowExamList(ExamPagenation pagenation)
        {
            //if (!string.IsNullOrEmpty(pagenation.FindWay))
            //{
            //    pagenation.CurrentPage = "upPage".Equals(pagenation.FindWay) ? (pagenation.CurrentPage - 1) : (pagenation.CurrentPage + 1);
            //}

            return (examDao.QueryUserExam(pagenation));
        }

        /// <summary>
        /// Get the exam's total quantity by pagenation object.
        /// </summary>
        /// <param name="pagenation">The pagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>Exam's total count</returns>
        public int getExamTotalCount(ExamPagenation pagenation)
        {
            return (examDao.GetExamTotal(pagenation));
        }
    }
}
