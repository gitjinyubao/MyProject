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
    }
}
