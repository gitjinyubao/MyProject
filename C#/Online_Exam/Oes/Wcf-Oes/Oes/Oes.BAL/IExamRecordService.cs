using Oes.Entity;

namespace Oes.BAL
{
    /// <summary>
    /// Improve methods to operate the method of ExamRecordDao.
    /// </summary>
    public interface IExamRecordService
    {
        /// <summary>
        /// Add user's exam record.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        void AddExamRecord(ExamRecord examRecord);
    }
}
