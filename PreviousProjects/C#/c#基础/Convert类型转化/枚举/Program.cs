using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace 枚举
{
    //将枚举声明在命名空间的下面，类的上面
    public enum Gender
    {
        男,
        女,
    }
    class Program
    {
        private int i1;
        public Program()
        {
            i1 = 0;
        }
        public void intGet()
        {
            Console.WriteLine(i1);
            i1++;
            if (i1 >= 10)
            {
                return;
            }
            intGet();
        }
        static void Main(string[] args)
        {
            Gender gender = Gender.男;
            string sex = gender.ToString();
            Console.WriteLine(gender);
            man m = new man();
            int [] a={1,2,3,5,9,4,10,8,7};
            for (int i = 0; i < a.Length; ++i)
            {
                for (int j = i; j < a.Length - 1;++j )
                {
                    if(a[j]>a[j+1]){
                        int temp=a[j];
                        a[j] = a[j + 1];
                        a[j+1]=temp;
                    }
                }
            }
            for (int i = 0; i < a.Length;i++ )
            {
                Console.Write(a[i] + "\t");
            }

            Program p = new Program();
            p.intGet();
         
        }
    }
}
