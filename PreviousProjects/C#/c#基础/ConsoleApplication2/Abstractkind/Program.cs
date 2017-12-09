using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Abstractkind
{
    class Program
    {
        static void Main(string[] args)
        {
            Child c = new Child();
            c.say();
            People p;
            p = c;
            p.say();
        }
    }
}
