using System;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using Oes.Entity;

namespace Oes.DAL
{
    /// <summary>
    /// Implement methods of IUserDao.
    /// </summary>
     public class UserDao : IUserDao
    {
         /// <summary>
         /// Get user object by userName.
         /// </summary>
         /// <param name="userName">User's property of userName</param>
         /// <returns>User object</returns>
         public User FindUserByUsername(string username)
         {
             //The current application configuration file is opended as an object.
             Configuration configuration = ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);
             //Remove node.
             configuration.AppSettings.Settings.Remove("lastLoginUser");
             //Add node.
             configuration.AppSettings.Settings.Add("lastLoginUser", username);
             //Save node.
             configuration.Save();

             string constr = ConfigurationManager.AppSettings["sqlserver2008"].ToString();
             using (SqlConnection conn = new SqlConnection(constr))
             {
                 conn.Open();
                 using (SqlCommand command = new SqlCommand("findUserByName", conn))
                 {
                     command.CommandType = CommandType.StoredProcedure;
                     command.Parameters.Add(new SqlParameter("@userName", username));

                     using (SqlDataReader reader = command.ExecuteReader())
                     {
                         User user = new User();

                         if (reader.Read())
                         {
                             user.Id = reader.IsDBNull(0) ? -1 : reader.GetInt32(0);
                             user.Username = reader.IsDBNull(1) ? string.Empty : reader.GetString(1);
                             user.ChineseName = reader.IsDBNull(2) ? string.Empty : reader.GetString(2);
                             user.Password = reader.IsDBNull(3) ? string.Empty : reader.GetString(3);
                             user.UserGender = reader.IsDBNull(7) ? string.Empty : reader.GetString(7);
                             user.UserNumber = reader.IsDBNull(4) ? string.Empty : reader.GetString(4);
                             user.UserPhone = reader.IsDBNull(5) ? string.Empty : reader.GetString(5);
                             user.UserEmail = reader.IsDBNull(6) ? string.Empty : reader.GetString(6);
                         }
                         else
                         {
                             user = null;
                         }

                         return user;
                     }
                 }
             }
         }

         /// <summary>
         /// Upadate user last login time.
         /// </summary>
         /// <param name="userId">User's property of userId</param>
         /// <param name="loginTime">User's login time</param>
         public void UpdateLastLoginTime(int userId, DateTime loginTime)
         {
             string constr = ConfigurationManager.AppSettings["sqlserver2008"].ToString();
             using (SqlConnection conn = new SqlConnection(constr))
             {
                 conn.Open();
                 using (SqlCommand command = new SqlCommand("updateLastLoginTime", conn))
                 {
                     command.CommandType = CommandType.StoredProcedure;
                     command.Parameters.Add(new SqlParameter("@userId", userId));
                     command.Parameters.Add(new SqlParameter("@loginTime", loginTime));
                     command.ExecuteNonQuery();
                 }
             }
         }
    }
}
