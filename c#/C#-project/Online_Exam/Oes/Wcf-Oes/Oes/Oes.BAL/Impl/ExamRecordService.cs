using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Oes.DAL;
using Oes.Entity;

namespace Oes.BAL
{
    /// <summary>
    /// Implement methods of IExamRecordService.
    /// </summary>
    public class ExamRecordService : IExamRecordService
    {
        IExamRecordDao examRecordDao = new ExamRecordDao();

        /// <summary>
        /// Add user's exam record.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        public void AddExamRecord(ExamRecord examRecord)
        {
            examRecordDao.InsertExamRecord(examRecord);
        }
    }
}
