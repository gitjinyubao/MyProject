using System;
using System.ServiceModel;
using WCF.Constracts;

namespace Oes.Entity.util
{
    public class ExitLogin
    {
        public static void ExitCurrentLogin(int userId, DateTime time, Boolean isLogiend)
        {
            using (ChannelFactory<IUserService> factory = new ChannelFactory<IUserService>(Constans.UserService))
            {
                IUserService userService = factory.CreateChannel();
                userService.UpdateLastLoginTime(UserSession.CurrentUser.Id, DateTime.Now, false);
            }
        }
    }
}
