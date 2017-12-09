using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace kind
{
    class People
    {
        private int age;

        public int Age
        {
            get { return age; }
            set { age = value; }
        }


        private string name;

        public string Name
        {
            get { return name; }
            set { name = value; }
        }
        public virtual void say()
        {
            Console.WriteLine("哈哈哈哈哈哈");
        }
        public void news()
        {
            Console.WriteLine("您的信息是：" + this.age + this.name);
        }       
    }
}
