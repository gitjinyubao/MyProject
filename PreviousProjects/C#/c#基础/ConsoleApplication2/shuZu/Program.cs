using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace shuZu
{
    class Program
    {
        /// <summary>
        /// 数组常用方法的测试
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            //第一种方式的初始化
            int[] a = new int[4];
            for (int i = 0; i < a.Length;++i )
            {
                a[i] = i;
            }
            //第二种方式的初始化
            int[] b = new int[] {1,6,9,5,9};
            //通过IndexOf()方法得到某元素第一次出现的索引值
            Console.WriteLine("通过IndexOf()方法得到某元素第一次出现的索引值");
            Console.WriteLine("9第一次出现的位置索引为：" + Array.IndexOf<int>(b,9));
            Console.WriteLine("通过sort()方法对数组进行排序");
            Array.Sort(b);
            foreach(int b1 in b){
                Console.WriteLine(b1);
            }
            string[] s = new string[] {"a","f","e","f"};
            Console.WriteLine("f第一次出现的位置索引为：" + Array.IndexOf<string>(s,"f"));
            //将数组某一范围的元素设置为0或null
            Array.Clear(s,0,2);
            //将数组的内容复制到另外一个新的数组的实体
            Console.WriteLine("将数组的内容复制到另外一个新的数组的实体克隆");
            int [] cloneB;
            cloneB = (int [])b.Clone();
            foreach(int b1 in cloneB){
                Console.WriteLine(b1);
            }
            //从目标索引位置开始进行复制
            Console.WriteLine("从目标索引位置开始进行复制");
            int [] copyToC = new int[7];
            b.CopyTo(copyToC,2);//copyToC必须是被实例化的数组
            foreach(int c in copyToC){
                Console.WriteLine(c);
            }
        }
    }
}
