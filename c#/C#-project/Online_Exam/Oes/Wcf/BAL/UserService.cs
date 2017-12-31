using System;
using WCF.Constracts;
using WCF.DAL;
using log4net;

namespace WCF.BAL
{
    /// <summary>
    /// Implements methods of IUserService.
    /// </summary>
    public class UserService : IUserService
    {
        IUserDao userDao = new UserDao();

        /// <see cref="IUserService.UserLogin"/>
        public User UserLogin(string userName, string password)
        {
            User user = userDao.FindUserByUsername(userName);

            if (user  == null)
            {
                ILog log = LogManager.GetLogger(this.GetType());
                log.Info(new UserNameNotExistException().Message);

                throw new UserNameNotExistException();
            }
            else if (password.Equals(user.Password))
            {
                if (user.IsLogined != true)
                {
                    userDao.UpdateLastLoginTime(user.Id, DateTime.Now, true);
                }
                else
                {
                    // Nothing to do
                }

                return user;
            }
            else
            {
                return null;
            }
        }

        /// <see cref="IUserService.FindUserRoleByUserId"/>
        public string FindUserRoleByUserId(int userId)
        {
            return userDao.FindUserRoleByUserId(userId);
        }

        /// <see cref="IUserService.UpdateLastLoginTime"/>
        public void UpdateLastLoginTime(int userId, DateTime loginTime, bool isLogined)
        {
            userDao.UpdateLastLoginTime(userId, loginTime, isLogined);
        }
    }
}
