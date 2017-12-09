using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace kind
{
    class Program
    {
        static void Main(string[] args)
        {
            Child c = new Child();
            c.Age = 12;
            c.Name = "jin";
            c.Hobby = "1";
            //覆盖方法的调用
            c.news();
            c.say();
            //基类引用子类对象
            People p = new People();
            p = new Child();
            p.say();
        }
    }
}
