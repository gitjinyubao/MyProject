using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Convert类型转化
{
    class Program
    {
        static void Main(string[] args)
        {
            //使用convert转化工厂进行类型转化
            string s = "4";
            int s1 = Convert.ToInt16(s);
            double s2 = Convert.ToDouble(s);
            const int p = 7;
            Console.WriteLine(s1);
            Console.WriteLine(s2);
        }
    }
}
