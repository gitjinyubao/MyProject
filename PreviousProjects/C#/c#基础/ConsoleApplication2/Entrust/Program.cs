using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Entrust
{
    class Program
    {
        static void Main(string[] args)
        {
            A a = new A();
            Test1 test1;
            //输入方法名称
            test1 = new Test1(a.method1);
            Console.WriteLine("和：" + test1(5, 3));
            test1 = new Test1(a.method2);
            Console.WriteLine("差：" + test1(5, 3));
            Console.WriteLine("------------------------");
            Test2 test2;
            test2 = new Test2(a.say1);
            test2();
            test2 = new Test2(a.say2);
            test2();
        }
    }
}
