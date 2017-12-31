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
        /// Gets myExamListIterm object of collection by pagenation object.
        /// </summary>
        /// <param name="pagenation">ExamPagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>The collection of MyExamListIterm object</returns>
        [OperationContract]
        Collection<StudentExamListIterm> ShowStudentExamList(ExamPagenation pagenation);

        /// <summary>
        /// Gets student's exam total quantity by pagenation object.
        /// </summary>
        /// <param name="pagenation">The pagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>Exam's total count</returns>
        [OperationContract]
        int GetStudentExamTotalCount(ExamPagenation pagenation);

        /// <summary>
        /// Gets TeacherSearchExamListIterm object of collection by pagenation object.
        /// </summary>
        /// <param name="pagenation">ExamPagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>The collection of TeacherSearchExamListIterm object</returns>
        [OperationContract]
        Collection<TeacherSearchExamListIterm> ShowTeacherExamList(ExamPagenation pagenation);

        /// <summary>
        /// Gets teacher's exam total quantity by pagenation object.
        /// </summary>
        /// <param name="pagenation">keyWord</param>
        /// <returns>Exam's total count</returns>
        [OperationContract]
        int GetTeacherExamTotalCount(string keyWord);

        /// <summary>
        /// Gets TeacherSearchExamListIterm object of collection by pagenation object.
        /// </summary>
        /// <param name="pagenation">ExamPagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>The collection of TeacherSearchExamListIterm object</returns>
        [OperationContract]
        Collection<StudentExamListIterm> GetStudentUnfinishedExam(int userId);
    }
}
