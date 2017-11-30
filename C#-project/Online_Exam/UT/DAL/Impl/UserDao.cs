using System;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using WCF.Constracts;

namespace WCF.DAL
{
    /// <summary>
    /// Implements methods of IUserDao.
    /// </summary>
     public class UserDao : IUserDao
    {
        /// <see cref="IUserDao.FindUserByUsername"/>
         public User FindUserByUsername(string username)
         {
             // The current application configuration file is opended as an object.
             Configuration configuration = ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);
             // Removes node.
             configuration.AppSettings.Settings.Remove(Constants.LastLoginUser);
             //Adds node.
             configuration.AppSettings.Settings.Add(Constants.LastLoginUser, username);
             // Saves node.
             configuration.Save();

             string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
             using (SqlConnection conn = new SqlConnection(constr))
             {
                 conn.Open();
                 using (SqlCommand command = new SqlCommand(Constants.FindUserByName, conn))
                 {
                     command.CommandType = CommandType.StoredProcedure;
                     command.Parameters.Add(new SqlParameter(Constants.UserNameParameter, username));

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

         /// <see cref="IUserDao.UpdateLastLoginTime"/>
         public void UpdateLastLoginTime(int userId, DateTime loginTime)
         {
             string constr = ConfigurationManager.AppSettings[Constants.SqlServer].ToString();
             using (SqlConnection conn = new SqlConnection(constr))
             {
                 conn.Open();
                 using (SqlCommand command = new SqlCommand(Constants.UpdateLastLoginTime, conn))
                 {
                     command.CommandType = CommandType.StoredProcedure;
                     command.Parameters.Add(new SqlParameter(Constants.UserIdParameter, userId));
                     command.Parameters.Add(new SqlParameter(Constants.LoginTimeParameter, loginTime));
                     command.ExecuteNonQuery();
                 }
             }
         }
    }
}
