using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace 利用Array操作数组
{
    class Program
    {
        /// <summary>
        /// 对array操作的数组进行各种测试
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {

            //定义一个int类型的数组
            Array array = Array.CreateInstance(typeof(int),5);

            //使用setValue()的方式进行给数组赋值
            for (int i = 0; i < array.Length;i++ )
            {
                array.SetValue(i,i);
            }

            //使用sort()方法进行排序
            Array.Sort(array);

            //采用foreach的方式进行素组的遍历输出
            foreach(int e in array){
                Console.WriteLine(e);
            }

            //采用Clear()方法进行数组的清空
            Array.Clear(array,0,array.Length);

            foreach (int e in array)
            {
                Console.WriteLine(e);
            }
            Console.WriteLine("------------");

            //定义一个string类型的数组
            Array array1 = Array.CreateInstance(typeof(string),4);

            for (int i = 0; i < array1.Length;i++ )
            {
                //使用ToString()的方法进行int类型和string类型的转化
                array1.SetValue(i.ToString(),i);
            }

            //覆盖原来的元素
            array1.SetValue("我们",2);

            //采用foreach的方式进行素组的遍历输出
            foreach (string e in array1)
            {
                Console.WriteLine(e);
            }

            //获得第一次元素内容是"我们"的元素索引;注意开头是用Array
            Console.WriteLine("我们在："+(Array.IndexOf(array1,"我们",0,array1.Length-1)).ToString());
            Console.WriteLine("------------");

            //定义新的数组准备复制
            Array array2 = Array.CreateInstance(typeof(string),8);

            //复制数组；后面的那个数字代表array1复制的长度
            Array.Copy(array1,array2,4);

            //后面那个数值代表从array2的哪个索引值开始
            array1.CopyTo(array2, 4);

            //Array.ConstrainedCopy指定开始位置，并且复制一系列元素到另外一个数组中
            //Array.ConstrainedCopy(array1,2,array2,2,2);

            //复制数组
            /*
            Array array3 = Array.CreateInstance(typeof(string), 8);
            array3=(Array)array2.Clone();
            */

            //循环遍历输出
            foreach(string e in array2)
            {
                Console.WriteLine(e);
            }
            Console.WriteLine("------------");
        }
    }
}
