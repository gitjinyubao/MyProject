using System;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using WCF.Constracts;

namespace WCF.DAL
{
    /// <summary>
    /// Implements methods of IExamRecordDao.
    /// </summary>
    public class ExamRecordDao : IExamRecordDao
    {
        /// <see cref="IExamRecordDao.InsertExamRecord"/>
        public void InsertExamRecord(ExamRecord examRecord)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.AddExamRecord, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examRecord.ExaId));
                    command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, examRecord.UserId));
                    command.Parameters.Add(new SqlParameter(Constants.QueIdParameter, examRecord.QueId));
                    command.Parameters.Add(new SqlParameter(Constants.UserAnswerParameter, examRecord.UserAnswer));

                    command.ExecuteNonQuery();
                }
            }
        }

        /// <see cref="IExamRecordDao.AddUserExamResult"/>
        public void AddUserExamResult(UserExamScore userExamScore)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.AddUserScore, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, userExamScore.ExamId));
                    command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, userExamScore.UserId));
                    command.Parameters.Add(new SqlParameter(Constants.FinishTimeParameter, userExamScore.FinishTime));
                    command.Parameters.Add(new SqlParameter(Constants.ScoreParameter, userExamScore.Score));

                    command.ExecuteNonQuery();
                }
            }
        }

        /// <see cref="IExamRecordDao.UpdateExamRecord"/>
        public void UpdateExamRecord(ExamRecord examRecord)
        {
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.UpdateExamRecord, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examRecord.ExaId));
                    command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, examRecord.UserId));
                    command.Parameters.Add(new SqlParameter(Constants.QuestionsIdParameter, examRecord.QueId)); 
                    command.Parameters.Add(new SqlParameter(Constants.QuestionStausParameter, examRecord.QuestionStatus));
                    command.Parameters.Add(new SqlParameter(Constants.RightAnswerParameter, examRecord.RightAnswer));

                    command.ExecuteNonQuery();
                }
            }
        }

        /// <see cref="IExamRecordDao.UpdateUserScoreExam"/>
        public void UpdateUserScoreExam(UserExamScore userExam)
        {
            try
            {
                string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
                using (SqlConnection conn = new SqlConnection(constr))
                {
                    conn.Open();
                    using (SqlCommand command = new SqlCommand(Constants.UpdateUserScoreExam, conn))
                    {
                        command.CommandType = CommandType.StoredProcedure;
                        command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, userExam.UserId));
                        command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, userExam.ExamId));
                        command.Parameters.Add(new SqlParameter(Constants.FinishTimeParameter, userExam.FinishTime));
                        command.Parameters.Add(new SqlParameter(Constants.ExamKindParameter, userExam.ExamKind));
                        command.Parameters.Add(new SqlParameter(Constants.OperationParameter, userExam.Operations));
                        command.Parameters.Add(new SqlParameter(Constants.ScoreParameter, userExam.Score));
                        command.Parameters.Add(new SqlParameter(Constants.ScoreIndividureTotalParameter, userExam.ScoreIndividureTotal));

                        command.ExecuteNonQuery();
                    }
                }
            }
            catch(Exception e)
            {
                Console.WriteLine(e);
            }
        }

        /// <see cref="IExamRecordDao.UpdateUserFinishTime"/>
        public void UpdateUserFinishTime(UserExamScore userExamScore)
        {
            try
            {
                string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
                using (SqlConnection conn = new SqlConnection(constr))
                {
                    conn.Open();
                    using (SqlCommand command = new SqlCommand(Constants.UpdateUserFinishTime, conn))
                    {
                        command.CommandType = CommandType.StoredProcedure;
                        command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, userExamScore.UserId));
                        command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, userExamScore.ExamId));
                        command.Parameters.Add(new SqlParameter(Constants.FinishTimeParameter, userExamScore.FinishTime));
                        command.ExecuteNonQuery();
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }

        /// <see cref="IExamRecordDao.GetUserExamScore"/>
        public UserExamScore GetUserExamScore(int examId, int userId)
        {
            UserExamScore userExamScore = new UserExamScore();
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();

            try
            {
                using (SqlConnection conn = new SqlConnection(constr))
                {
                    conn.Open();
                    using (SqlCommand command = new SqlCommand(Constants.FindUserScoreRecord, conn))
                    {
                        command.CommandType = CommandType.StoredProcedure;
                        command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, userId));
                        command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examId));

                        using (SqlDataReader reader = command.ExecuteReader())
                        {
                            if (reader.Read())
                            {
                                userExamScore.UserId = reader.IsDBNull(0) ? -1 : reader.GetInt32(0);
                                userExamScore.ExamId = reader.IsDBNull(1) ? -1 : reader.GetInt32(1);
                                userExamScore.Score = reader.IsDBNull(2) ? string.Empty : reader.GetString(2);
                                userExamScore.FinishTime = reader.IsDBNull(3) ? string.Empty : reader.GetString(3);
                                userExamScore.ExamKind = reader.IsDBNull(4) ? string.Empty : reader.GetString(4);
                                userExamScore.Operations = reader.IsDBNull(5) ? string.Empty : reader.GetString(5);
                                userExamScore.ScoreIndividureTotal = reader.IsDBNull(6) ? string.Empty : reader.GetString(6);
                            }
                        }
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }

            return userExamScore;
        }
    }
}
