using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Abstractkind
{
    class Child:People
    {
        //实现抽象方法必须使用override
        public override void say()
        {
            Console.WriteLine("yyyyyyyyyyyyyyyyyyyy");
        }
    }
}
