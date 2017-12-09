using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace sealedkind
{
    class Child:People
    {
        private string hobby;

        public string Hobby
        {
            get { return hobby; }
            set { hobby = value; }
        }

        //使用sealed定义密封方法：不能被继承
        public sealed override void say()
        {
            Console.WriteLine("棉花糖");
        }

        new public void eatFood()
        {
            Console.Write("葫芦");
        }
    }
}
