using System;
using WCF.Constracts;

namespace WCF.DAL
{
    /// <summary>
    /// Defined the method to option the date about user.
    /// </summary>
    public interface IUserDao
    {
        /// <summary>
        /// Get user object by userName.
        /// </summary>
        /// <param name="userName">User's property of userName</param>
        /// <returns>User object</returns>
        User FindUserByUsername(string userName);

        /// <summary>
        /// Upadate user last login time.
        /// </summary>
        /// <param name="userId">User's property of userId</param>
        /// <param name="loginTime">User's login time</param>
        void UpdateLastLoginTime(int userId, DateTime loginTime);
    }
}
