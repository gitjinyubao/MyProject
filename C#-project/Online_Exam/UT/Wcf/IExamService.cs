using System.Collections.ObjectModel;
using System.ServiceModel;
namespace WCF.Constracts
{
    /// <summary>
    /// Improves methods to operate the method of ExamDao.
    /// </summary>
    [ServiceContract]
    public interface IExamService
    {
        /// <summary>
        /// Gets the myExamListIterm object of collection by pagenation object.
        /// </summary>
        /// <param name="pagenation">ExamPagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>The collection of MyExamListIterm object</returns>
        [OperationContract]
        Collection<MyExamListIterm> ShowExamList(ExamPagenation pagenation);

        /// <summary>
        /// Gets the exam's total quantity by pagenation object.
        /// </summary>
        /// <param name="pagenation">The pagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>Exam's total count</returns>
        [OperationContract]
        int GetExamTotalCount(ExamPagenation pagenation);
    }
}
