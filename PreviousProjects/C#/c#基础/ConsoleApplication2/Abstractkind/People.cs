using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Abstractkind
{
    /// <summary>
    /// 抽象类是不可以实例化的
    /// 他虽然有构造方法
    /// </summary>
    abstract class People
    {
        //抽象类成员不能是私有的,否则子类是看不到的
        private int age;

        public int Age
        {
            get { return age; }
            set { age = value; }
        }

        //抽象方法
        public abstract void say();

        //非抽象方法
        public void news()
        {
            Console.WriteLine("您的信息是：" + this.age);
        }
    }
}
