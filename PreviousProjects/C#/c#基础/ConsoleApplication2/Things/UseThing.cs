using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Things
{
    public delegate void outWordDelegete(string word);
    class UseThing
    {
        public  void outWord(string word)
        {
            Console.WriteLine(word);
        }
    }
}
