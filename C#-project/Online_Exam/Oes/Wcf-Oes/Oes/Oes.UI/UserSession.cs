using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WCF.Constracts;

namespace Oes.Entity
{
    public class UserSession
    {
        public static User CurrentUser { get; set; }
    }
}
