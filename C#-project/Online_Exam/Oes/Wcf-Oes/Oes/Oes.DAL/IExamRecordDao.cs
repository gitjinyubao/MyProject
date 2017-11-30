using Oes.Entity;

namespace Oes.DAL
{
    /// <summary>
    /// Defined the method to option the date about exam record.
    /// </summary>
    public interface IExamRecordDao
    {
        /// <summary>
        /// Add user's exam record.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        void InsertExamRecord(ExamRecord examRecord);
    }
}
