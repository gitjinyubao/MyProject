using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Oes.Entity.util
{
    public class IsNumber
    {
        public static bool IsNumeric(string str)
        {
            System.Text.RegularExpressions.Regex reg1 = new System.Text.RegularExpressions.Regex(@"^[0-9]\d*$");
            return reg1.IsMatch(str);
        }
    }
}
