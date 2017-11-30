using System.Collections.ObjectModel;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using WCF.Constracts;

namespace WCF.DAL
{
    /// <summary>
    /// Implements methods of IExamDao.
    /// </summary>
    public class ExamDao : IExamDao
    {
        /// <see cref="IExamDao.QueryUserExam"/>
        public Collection<MyExamListIterm> QueryUserExam(ExamPagenation pagenation)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            Collection<MyExamListIterm> examItermList = new Collection<MyExamListIterm>();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.ExamListShow, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.PageSizeParameter, pagenation.PageSize));
                    command.Parameters.Add(new SqlParameter(Constants.OffSetParameter, pagenation.Offset));
                    command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, pagenation.UserId));
                    command.Parameters.Add(new SqlParameter(Constants.KindExamParameter, pagenation.ExamKind));
                    command.Parameters.Add(new SqlParameter(Constants.OrderNameParameter, pagenation.OrderName));
                    command.Parameters.Add(new SqlParameter(Constants.OrderWayParameter, pagenation.OrderWay));

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

        /// <see cref="IExamDao.GetExamTotal"/>
        public int GetExamTotal(ExamPagenation pagenation)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            int examTotalCount = 0;
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.ExamTotalCount, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, pagenation.UserId));
                    command.Parameters.Add(new SqlParameter(Constants.KindExamParameter, pagenation.ExamKind));

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
