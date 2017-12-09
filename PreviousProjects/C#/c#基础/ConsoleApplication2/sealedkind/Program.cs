using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace sealedkind
{
    class Program
    {
        static void Main(string[] args)
        {
            Child c = new Child();
            c.eatFood();
            Adult a = new Adult();
            a.eatFood();
        }
    }
}
