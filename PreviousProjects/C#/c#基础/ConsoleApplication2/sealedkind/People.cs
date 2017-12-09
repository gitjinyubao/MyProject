using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace sealedkind
{
    abstract class People
    {
        private int age;

        public int Age
        {
            get { return age; }
            set { age = value; }
        }

        public abstract void say();

        public void eatFood()
        {
            Console.WriteLine("米饭");
        }
    }
}
