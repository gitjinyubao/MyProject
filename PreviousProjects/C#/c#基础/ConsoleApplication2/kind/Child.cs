using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace kind
{
    class Child:People
    {
        private string hobby;

         
        public Child()
        {
        }

        public string Hobby
        {
            get { return hobby; }
            set { hobby = value; }
        }
        //覆盖基类的虚函数使用override关键字
        public override void say()
        {
            Console.WriteLine("哇哇哇哇哇哇哇哇");
        }

        //覆盖基类的普通方法使用new关键字
        new public void news()
        {
            Console.WriteLine("您的信息是："+this.Age+this.Name+this.Hobby);
        }    
    }
}
