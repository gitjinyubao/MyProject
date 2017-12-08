using System;
using System.Collections.ObjectModel;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using Oes.Entity;

namespace Oes.DAL
{
    /// <summary>
    /// Implement methods of IQuestionsDao.
    /// </summary>
    public class QuerstionsDao : IQuestionsDao
    {
        /// <summary>
        /// Get questions's id by exam's id.
        /// </summary>
        /// <param name="examId">exams's id</param>
        /// <returns>The collection of questions's id</returns>
        public Collection<Int32> GetQuestionsId(int examId)
        {
            Collection<Int32> questionsId = new Collection<Int32>();
            string constr = ConfigurationManager.AppSettings["sqlserver2008"].ToString();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand("find_questions_by_exam_id", conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter("@examId", examId));

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

        /// <summary>
        /// Get questions by questions' id.
        /// </summary>
        /// <param name="questionsId">questions's id</param>
        /// <returns>Questions object</returns>
        public Questions GetQuestions(int questionsId)
        {
            Questions questions = new Questions();
            string constr = ConfigurationManager.AppSettings["sqlserver2008"].ToString();
            using (SqlConnection conn = new SqlConnection(constr))
            {
                conn.Open();
                using (SqlCommand command = new SqlCommand("find_questions_by_id", conn))
                {
                    command.CommandType = CommandType.StoredProcedure;
                    command.Parameters.Add(new SqlParameter("@questionsId", questionsId));

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
                        }
                        else
                        {
                            questions = null;
                        }
                    }
                }
            }

            return questions;
        }
    }
}
