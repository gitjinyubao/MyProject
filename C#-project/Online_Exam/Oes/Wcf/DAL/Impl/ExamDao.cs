using System.Collections.ObjectModel;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using WCF.Constracts;
using System;

namespace WCF.DAL
{
    /// <summary>
    /// Implements methods of IExamDao.
    /// </summary>
    public class ExamDao : IExamDao
    {
        /// <see cref="IExamDao.QueryStudentExam"/>
        public Collection<StudentExamListIterm> QueryStudentExam(ExamPagenation pagenation)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            Collection<StudentExamListIterm> examItermList = new Collection<StudentExamListIterm>();
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
                            StudentExamListIterm examIterm = new StudentExamListIterm();
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
                return null;
            }
        }

        /// <see cref="IExamDao.GetStudentExamTotal"/>
        public int GetStudentExamTotal(ExamPagenation pagenation)
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

        /// <see cref="IExamDao.GetTeacherExamTotal"/>
        public int GetTeacherExamTotal(string keyWord)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            int examTotalCount = 0;

            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.TeacherSearchExamTotalCount, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.KeyWordParameter, keyWord));

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

        /// <see cref="IExamDao.QueryTeacherExam"/>
        public Collection<TeacherSearchExamListIterm> QueryTeacherExam(ExamPagenation pagenation)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            Collection<TeacherSearchExamListIterm> examItermList = new Collection<TeacherSearchExamListIterm>();

            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.TeacherSearchExamResultListShow, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.PageSizeParameter, pagenation.PageSize));
                    command.Parameters.Add(new SqlParameter(Constants.OffSetParameter, pagenation.Offset));
                    command.Parameters.Add(new SqlParameter(Constants.OrderNameParameter, pagenation.OrderName));
                    command.Parameters.Add(new SqlParameter(Constants.OrderWayParameter, pagenation.OrderWay));
                    command.Parameters.Add(new SqlParameter(Constants.KeyWordParameter, pagenation.KeyWord));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            TeacherSearchExamListIterm examIterm = new TeacherSearchExamListIterm();
                            examIterm.Id = reader.IsDBNull(0) ? -1 : reader.GetInt32(0);
                            examIterm.Name = reader.IsDBNull(1) ? string.Empty : reader.GetString(1);
                            examIterm.Number = reader.IsDBNull(2) ? string.Empty : reader.GetString(2);
                            examIterm.EffictiveTime = reader.GetDateTime(3);
                            examIterm.QuestionQuantity = reader.IsDBNull(4) ? string.Empty : reader.GetString(4);
                            examIterm.AverageScore = reader.IsDBNull(5) ? string.Empty : reader.GetString(5);
                            examIterm.ExamineeCount = reader.IsDBNull(6) ? string.Empty : reader.GetString(6);
                            examIterm.NumberOfQualified = reader.IsDBNull(7) ? string.Empty : reader.GetString(7);
                            examIterm.PassRate = reader.IsDBNull(8) ? string.Empty : reader.GetString(8);
                            examItermList.Add(examIterm);
                        }
                    }
                }
            }

            return examItermList;
        }

        /// <see cref="IExamDao.GetStudentUnfinishedExam"/>
        public Collection<StudentExamListIterm> GetStudentUnfinishedExam(int userId)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            Collection<StudentExamListIterm> examItermList = new Collection<StudentExamListIterm>();

            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.GetStudentUnfinishedExam, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, userId));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            StudentExamListIterm examIterm = new StudentExamListIterm();
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
                return null;
            }
        }

        /// <see cref="IExamDao.GetExamAverageScoreByExamId"/>
        public int GetExamAverageScoreByExamId(int examId)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            int averageScore = 0;

            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.GetExamAverageScore, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examId));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        if (reader.Read())
                        {
                            averageScore = reader.GetInt32(0);
                        }
                    }
                }
            }

            return averageScore;
        }

        /// <see cref="IExamDao.GetExamAverageScoreByExamId"/>
        public int GetExamineeCount(int examId)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            int examineeCount = 0;

            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.GetExamineeCount, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examId));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        if (reader.Read())
                        {
                            examineeCount = Convert.ToInt32(reader.GetString(0));
                        }
                    }
                }
            }

            return examineeCount;
        }

        /// <see cref="IExamDao.GetExamAverageScoreByExamId"/>
        public int GetCountOfPassingExam(int examId)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            int passExamCount = 0;

            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.GetCountOfPassingExam, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examId));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        if (reader.Read())
                        {
                            passExamCount = reader.GetInt32(0);
                        }
                    }
                }
            }

            return passExamCount;
        }

        /// <see cref="IExamDao.GetCountOfDoingExam"/>
        public int GetCountOfDoingExam(int examId)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            int doingExamCount = 0;

            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.GetCountOfDoExam, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examId));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        if (reader.Read())
                        {
                            doingExamCount = reader.GetInt32(0);
                        }
                    }
                }
            }

            return doingExamCount;
        }

        /// <see cref="IExamDao.UpdateExamInformationAboutExamRecord"/>
        public void UpdateExamInformationAboutExamRecord(int examId, string averageScore, string passRate, string numberQualified)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();

            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.UpdateExamInformation, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examId));
                    command.Parameters.Add(new SqlParameter(Constants.AverageScoreParameter, averageScore));
                    command.Parameters.Add(new SqlParameter(Constants.PassRateParameter, passRate));
                    command.Parameters.Add(new SqlParameter(Constants.NumberQualifiedParameter, numberQualified));

                    command.ExecuteNonQuery();
                }
            }
        }
    }
}
