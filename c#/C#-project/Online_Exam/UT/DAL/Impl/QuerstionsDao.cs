using System;
using System.Collections.ObjectModel;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using WCF.Constracts;

namespace WCF.DAL
{
    /// <summary>
    /// Implements methods of IQuestionsDao.
    /// </summary>
    public class QuerstionsDao : IQuestionsDao
    {
        /// <see cref="IQuestionsDao.GetQuestionsId"/>
        public Collection<Int32> GetQuestionsId(int examId)
        {
            Collection<Int32> questionsId = new Collection<Int32>();
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.FindQuestionsByExamId, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examId));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            questionsId.Add(reader.GetInt32(0));
                        }
                    }
                }
            }

            return questionsId;
        }

        /// <see cref="IQuestionsDao.GetQuestions"/>
        public Questions GetQuestions(int questionsId)
        {
            Questions questions = new Questions();
            try
            {
                string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();

                using (SqlConnection conn = new SqlConnection(constr))
                {
                    conn.Open();
                    using (SqlCommand command = new SqlCommand(Constants.FindQuestionsById, conn))
                    {
                        command.CommandType = CommandType.StoredProcedure;
                        command.Parameters.Add(new SqlParameter(Constants.QuestionsIdParameter, questionsId));

                        using (SqlDataReader reader = command.ExecuteReader())
                        {
                            if (reader.Read())
                            {
                                questions.Id = reader.IsDBNull(0) ? -1 : reader.GetInt32(0);
                                questions.que_score = reader.IsDBNull(2) ? string.Empty : reader.GetString(2);
                                questions.que_title = reader.IsDBNull(3) ? string.Empty : reader.GetString(3);
                                questions.que_a_content = reader.IsDBNull(4) ? string.Empty : reader.GetString(4);
                                questions.que_b_content = reader.IsDBNull(5) ? string.Empty : reader.GetString(5);
                                questions.que_c_content = reader.IsDBNull(6) ? string.Empty : reader.GetString(6);
                                questions.que_d_content = reader.IsDBNull(7) ? string.Empty : reader.GetString(7);
                                questions.que_answer = reader.IsDBNull(8) ? string.Empty : reader.GetString(8);
                            }
                            else
                            {
                                questions = null;
                            }
                        }
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }

            return questions;
        }

        /// <see cref="IQuestionsDao.GetExamQuestions"/>
        public ExamQuextions GetExamQuestions(int examId, int questionsId)
        {
            ExamQuextions examQuestions = new ExamQuextions();
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.FindQuestionsAnswer, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.QuestionsIdParameter, questionsId));
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examId));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        if (reader.Read())
                        {
                            examQuestions.QuestionsId = reader.IsDBNull(0) ? -1 : reader.GetInt32(0);
                            examQuestions.ExamId = reader.IsDBNull(1) ? -1 : reader.GetInt32(1);
                            examQuestions.QuestionsScore = reader.IsDBNull(2) ? string.Empty : reader.GetString(2);
                            examQuestions.QuestionsAnswer = reader.IsDBNull(3) ? string.Empty : reader.GetString(3);
                        }
                        else
                        {
                            examQuestions = null;
                        }
                    }
                }
            }

            return examQuestions;
        }

        /// <see cref="IQuestionsDao.GetUserQuestionsRecord"/>
        public Collection<ExamRecord> GetUserQuestionsRecord(int examId, int userId)
        {
            Collection<ExamRecord> examRecords = new Collection<ExamRecord>();
            string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand(Constants.FindUserQuestionsRecord, conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, userId));
                    command.Parameters.Add(new SqlParameter(Constants.ExamIdParameter, examId));

                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            ExamRecord examRecord = new ExamRecord();

                            examRecord.Id = reader.IsDBNull(0) ? -1 : reader.GetInt32(0);
                            examRecord.ExaId = reader.IsDBNull(1) ? -1 : reader.GetInt32(1);
                            examRecord.UserId = reader.IsDBNull(2) ? -1 : reader.GetInt32(2);
                            examRecord.QueId = reader.IsDBNull(3) ? -1 : reader.GetInt32(3);
                            examRecord.UserAnswer = reader.IsDBNull(4) ? string.Empty : reader.GetString(4);
                            examRecord.QuestionStatus = reader.IsDBNull(5) ? string.Empty : reader.GetString(5);
                            examRecord.RightAnswer = reader.IsDBNull(6) ? string.Empty : reader.GetString(6);

                            examRecords.Add(examRecord);
                        }
                    }
                }
            }

            return examRecords;
        }
    }
}
