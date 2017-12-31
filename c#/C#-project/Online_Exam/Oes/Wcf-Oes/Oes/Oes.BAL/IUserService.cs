using Oes.Entity;

namespace Oes.BAL
{
    /// <summary>
    /// Improve methods to operate the method of UserDao.
    /// </summary>
    public interface IUserService
    {
        /// <summary>
        /// Check user's login
        /// </summary>
        /// <param name="userName"></param>
        /// <param name="password"></param>
        /// <returns>User</returns>
        User UserLogin(string userName, string password);
    }
}
