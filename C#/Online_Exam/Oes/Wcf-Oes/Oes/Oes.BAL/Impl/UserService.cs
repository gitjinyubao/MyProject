using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Oes.BAL;
using Oes.DAL;
using Oes.Entity;

namespace Oes.BAL
{
    /// <summary>
    /// Implement methods of IUserService.
    /// </summary>
    public class UserService : IUserService
    {
        /// <summary>
        /// Check user's login
        /// </summary>
        /// <param name="userName"></param>
        /// <param name="password"></param>
        /// <returns>User</returns>
        public User UserLogin(string userName, string password)
        {
            IUserDao userDao = new UserDao();
            User user = userDao.FindUserByUsername(userName);

            if (user  == null)
            {
                throw new UserNameNotExistException();
            }

            else if (password.Equals(user.Password))
            {
                userDao.UpdateLastLoginTime(user.Id, DateTime.Now);
                return user;
            }

            else
            {
                return null;
            }
        }
    }
}
