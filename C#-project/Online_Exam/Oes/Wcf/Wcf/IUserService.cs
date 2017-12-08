using System;
using System.ServiceModel;

namespace WCF.Constracts
{
    /// <summary>
    /// Improves methods to operate the method of UserDao.
    /// </summary>
    [ServiceContract]
    public interface IUserService
    {
        /// <summary>
        /// Checks user's login.
        /// </summary>
        /// <param name="userName">user's name</param>
        /// <param name="password">user's password</param>
        /// <returns>User</returns>
        [OperationContract]
        User UserLogin(string userName, string password);

        /// <summary>
        /// Finds user role by user id.
        /// </summary>
        /// <param name="userId">user id</param>
        /// <returns>user role</returns>
        [OperationContract]
        string FindUserRoleByUserId(int userId);

        /// <summary>
        /// Upadate user login information.
        /// </summary>
        /// <param name="userId">User's property of userId</param>
        /// <param name="loginTime">User's login time</param>
        [OperationContract]
        void UpdateLastLoginTime(int userId, DateTime loginTime, Boolean isLogined);

    }
}
