using System.Collections.ObjectModel;
using Oes.Entity;

namespace Oes.DAL
{
    /// <summary>
    /// Defined the method to option the date about exam.
    /// </summary>
    public interface IExamDao
    {
        /// <summary>
        /// Get the myExamListIterm object of collection by pagenation object.
        /// </summary>
        /// <param name="pagenation">ExamPagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>The collection of MyExamListIterm object</returns>
        Collection<MyExamListIterm> QueryUserExam(ExamPagenation pagenation);

        /// <summary>
        /// Get the exam's total quantity by pagenation object.
        /// </summary>
        /// <param name="pagenation">The pagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>Exam's total count</returns>
        int GetExamTotal(ExamPagenation pagenation);
    }
}
