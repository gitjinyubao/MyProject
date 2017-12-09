using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace sealedkind
{
    //密封类Adult是不能被继承的
    sealed class Adult:Child
    {
        new public void eatFood()
        {
            Console.WriteLine("meat");
        }
    }
}
