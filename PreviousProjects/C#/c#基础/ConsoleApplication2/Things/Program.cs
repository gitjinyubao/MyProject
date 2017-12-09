using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Timers;

namespace Things
{
    class Program
    {
        static void Main(string[] args)
        {
           outWordDelegete outWord;
           UseThing u = new UseThing();
           outWord = new outWordDelegete(u.outWord);
           outWord("哈哈哈哈");

           #region 无效
           Timer myTime = new Timer(100);
           ElapsedEventHandler e ;
           e = new ElapsedEventHandler(say);
           myTime.Elapsed += e;
           myTime.Start();
           #endregion


        }
        public static void say(Object s,ElapsedEventArgs m)
        {
            Console.WriteLine("啦啦啦啦");
        }
    }
}
