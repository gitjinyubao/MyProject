using System.Collections.ObjectModel;
using WCF.Constracts;

namespace WCF.DAL
{
    /// <summary>
    /// Defineds the method to option the date about exam.
    /// </summary>
    public interface IExamDao
    {
        /// <summary>
        /// Gets the myExamListIterm object of collection by pagenation object.
        /// </summary>
        /// <param name="pagenation">ExamPagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>The collection of MyExamListIterm object</returns>
        Collection<StudentExamListIterm> QueryStudentExam(ExamPagenation pagenation);

        /// <summary>
        /// Gets student's exam total quantity by pagenation object.
        /// </summary>
        /// <param name="pagenation">The pagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>Exam's total count</returns>
        int GetStudentExamTotal(ExamPagenation pagenation);

        /// <summary>
        /// Gets TeacherSearchExamListIterm object of collection by pagenation object.
        /// </summary>
        /// <param name="pagenation">ExamPagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>The collection of TeacherSearchExamListIterm object</returns>
        Collection<TeacherSearchExamListIterm> QueryTeacherExam(ExamPagenation pagenation);

        /// <summary>
        /// Gets teacher's exam total quantity by pagenation object.
        /// </summary>
        /// <param name="pagenation">keyWord</param>
        /// <returns>Exam's total count</returns>
        int GetTeacherExamTotal(string keyWord);

        /// <summary>
        /// Gets TeacherSearchExamListIterm object of collection by pagenation object.
        /// </summary>
        /// <param name="pagenation">ExamPagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>The collection of TeacherSearchExamListIterm object</returns>
        Collection<StudentExamListIterm> GetStudentUnfinishedExam(int userId);

        /// <summary>
        /// Gets exam's average score by exam id.
        /// </summary>
        /// <param name="pagenation">Exam's id</param>
        /// <returns>average score of exam</returns>
        int GetExamAverageScoreByExamId(int examId);

        /// <summary>
        /// Gets examinee count score by exam id.
        /// </summary>
        /// <param name="pagenation">Exam's id</param>
        /// <returns>examinee count</returns>
        int GetExamineeCount(int examId);

        /// <summary>
        /// Gets count of passing exam by exam id.
        /// </summary>
        /// <param name="pagenation">Exam's id</param>
        /// <returns>count of passing exam</returns>
        int GetCountOfPassingExam(int examId);

        /// <summary>
        /// Gets count of doing exam by exam id.
        /// </summary>
        /// <param name="pagenation">Exam's id</param>
        /// <returns>count of doing exam</returns>
        int GetCountOfDoingExam(int examId);

        /// <summary>
        /// Updates exam information about exam record by exam's id.
        /// </summary>
        /// <param name="pagenation">Exam's id</param>
        void UpdateExamInformationAboutExamRecord(int examId, string averageScore, string passRate, string numberQualified);
    }
}
