using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using Oes.Entity;
namespace Oes.DAL
{
    /// <summary>
    /// Implement methods of IExamRecordDao.
    /// </summary>
    public class ExamRecordDao : IExamRecordDao
    {
        /// <summary>
        /// Add user's exam record.
        /// </summary>
        /// <param name="examRecord">ExamRecord object</param>
        public void InsertExamRecord(ExamRecord examRecord)
        {
            string constr = ConfigurationManager.AppSettings["sqlserver2008"].ToString();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand("add_exam_record", conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter("@exaId", examRecord.ExaId));
                    command.Parameters.Add(new SqlParameter("@userId", examRecord.UserId));
                    command.Parameters.Add(new SqlParameter("@queId", examRecord.QueId));
                    command.Parameters.Add(new SqlParameter("@userAnswer", examRecord.UserAnswer));

                    command.ExecuteNonQuery();
                }
            }
        }
    }
}
