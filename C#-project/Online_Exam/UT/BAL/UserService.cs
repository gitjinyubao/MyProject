using System;
using WCF.Constracts;
using WCF.DAL;

namespace WCF.BAL
{
    /// <summary>
    /// Implements methods of IUserService.
    /// </summary>
    public class UserService : IUserService
    {
        private IUserDao dao;

        public UserService(IUserDao dao)
        {
            this.dao = dao;
        }

        public UserService() : this(new UserDao())
        {

        }

        /// <see cref="IUserService.UserLogin"/>
        public User UserLogin(string userName, string password)
        {
            User user = dao.FindUserByUsername(userName);

            if (user  == null)
            {
                throw new UserNameNotExistException();
            }
            else if (password.Equals(user.Password))
            {
                dao.UpdateLastLoginTime(user.Id, DateTime.Now);
                return user;
            }
            else
            {
                return null;
            }
        }
    }
}
