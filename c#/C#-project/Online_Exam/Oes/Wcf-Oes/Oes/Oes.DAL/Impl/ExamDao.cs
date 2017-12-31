using System.Collections.ObjectModel;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using Oes.Entity;

namespace Oes.DAL
{
    /// <summary>
    /// Implement methods of IExamDao.
    /// </summary>
    public class ExamDao : IExamDao
    {
        /// <summary>
        /// Get the myExamListIterm object of collection by pagenation object.
        /// </summary>
        /// <param name="pagenation">ExamPagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>The collection of MyExamListIterm object</returns>
        public Collection<MyExamListIterm> QueryUserExam(ExamPagenation pagenation)
        {
            string constr = ConfigurationManager.AppSettings["sqlserver2008"].ToString();
            Collection<MyExamListIterm> examItermList = new Collection<MyExamListIterm>();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand("exam_list_pagenation_two", conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter("@pageSize", pagenation.PageSize));
                    command.Parameters.Add(new SqlParameter("@offSet", pagenation.Offset));
                    command.Parameters.Add(new SqlParameter("@userId", pagenation.UserId));
                    command.Parameters.Add(new SqlParameter("@kindExam", pagenation.ExamKind));
                    command.Parameters.Add(new SqlParameter("@orderName", pagenation.OrderName));
                    command.Parameters.Add(new SqlParameter("@orderWay", pagenation.OrderWay));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {

                        while (reader.Read())
                        {
                            MyExamListIterm examIterm = new MyExamListIterm();
                            examIterm.Id = reader.IsDBNull(0) ? -1 : reader.GetInt32(0);
                            examIterm.Number = reader.IsDBNull(1) ? string.Empty : reader.GetString(1);
                            examIterm.Name = reader.IsDBNull(3) ? string.Empty : reader.GetString(3);
                            examIterm.QuestionQuantity = reader.IsDBNull(5) ? string.Empty : reader.GetString(5);
                            examIterm.EffictiveTime = reader.GetDateTime(6);
                            examIterm.TotalScore = reader.IsDBNull(7) ? string.Empty : reader.GetString(7);
                            examIterm.PassCriteria = reader.IsDBNull(8) ? string.Empty : reader.GetString(8);
                            examIterm.Duration = reader.IsDBNull(13) ? string.Empty : reader.GetString(13);
                            examIterm.ExamScore = reader.IsDBNull(18) ? string.Empty : reader.GetString(18);
                            examIterm.Options = reader.IsDBNull(21) ? string.Empty : reader.GetString(21);
                            examIterm.ExamDivisTotalScore = reader.IsDBNull(22) ? string.Empty : reader.GetString(22);
                            examItermList.Add(examIterm);
                        }
                    }
                }
            }

            if (examItermList.Count > 0)
            {
                return examItermList;
            }
            else
            {
                examItermList = null;

                return examItermList;
            }
        }

        /// <summary>
        /// Get the exam's total quantity by pagenation object.
        /// </summary>
        /// <param name="pagenation">The pagenation object include pageSize and pageCount and offset and currentPage and examKind</param>
        /// <returns>Exam's total count</returns>
        public int GetExamTotal(ExamPagenation pagenation)
        {
            string constr = ConfigurationManager.AppSettings["sqlserver2008"].ToString();
            int examTotalCount = 0;
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand("exam_total_count", conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter("@pageSize", pagenation.PageSize));
                    command.Parameters.Add(new SqlParameter("@offSet", pagenation.CurrentPage));
                    command.Parameters.Add(new SqlParameter("@userId", pagenation.UserId));
                    command.Parameters.Add(new SqlParameter("@kindExam", pagenation.ExamKind));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {

                        if (reader.Read())
                        {
                            examTotalCount = reader.GetInt32(0);
                        }
                    }
                }
            }

            return examTotalCount;
        }
    }
}
