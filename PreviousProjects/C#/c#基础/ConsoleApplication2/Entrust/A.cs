using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Entrust
{
    //类的外部定义委托:最好是将委托定义在类外的命名空间中
    public delegate int Test1(int a, int b);

    public delegate void Test2();
    class A
    {
        public int method1(int a, int b)
        {
            return (a+b);
        }

        public int method2(int a, int b)
        {
            return (a - b);
        }

        public void say1()
        {
            Console.WriteLine("哈哈哈");
        }

        public void say2()
        {
            Console.WriteLine("哇哇哇");
        }
    }
}
