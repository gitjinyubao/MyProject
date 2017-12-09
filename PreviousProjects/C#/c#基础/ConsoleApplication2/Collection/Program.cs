using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Collection
{
    class Program
    {
        /// <summary>
        /// 常用集合类的示例
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            #region 集合ArrayList
            //先进先出
            //Add（）添加元素
            ArrayList nums = new ArrayList();
            nums.Add(1);
            nums.Add(2);
            nums.Add(3);
            foreach (int num in nums)
            {
                Console.WriteLine(num);
            }
            Console.WriteLine("---------------------------");
            //insert()在指定索引处添加元素,原集合自动长度变化
            nums.Insert(0,9);
            foreach (int num in nums)
            {
                Console.WriteLine(num);
            }
            Console.WriteLine("---------------------------");
            //删除一个指定值的元素
            nums.Remove(9);
            foreach (int num in nums)
            {
                Console.WriteLine(num);
            }
            Console.WriteLine("---------------------------");
            //删除一个指定索引处的元素
            nums.Insert(0, 9);
            nums.RemoveAt(0);
            foreach (int num in nums)
            {
                Console.WriteLine(num);
            }
            Console.WriteLine("---------------------------");
            //使用count返回元素的个数:注意c#中集合是没有length方法的
            Console.WriteLine(nums.Count);
            Console.WriteLine("---------------------------");
            //排序
            nums.Sort();
            foreach (int num in nums)
            {
                Console.WriteLine(num);
            }
            Console.WriteLine("---------------------------");
            //确定集合中是否包含特定值
            if (nums.Contains(3))
            {
                Console.WriteLine("集合中包含特定值");
            }
            Console.WriteLine("---------------------------");
            #endregion
            
            #region 集合HashTable
            //hashTable是System.Collections命名空间提供的一个处理类似key/value的键值对集合;键不可为空，值可以null
            //先进后出
            //不允许添加重复键值

            //初始化
            Hashtable table = new Hashtable();
            //利用add()添加元素
            table.Add("username","123");
            table.Add("password","456");
            foreach(DictionaryEntry de in table){
                Console.WriteLine(de.Value);
            }
            Console.WriteLine("---------------------------");
            //改变键对应的值(重新赋值)
            table["username"] = "789";
            foreach(DictionaryEntry de in table){
                Console.Write(de.Key);
                Console.Write(de.Value);
            }
            Console.WriteLine("---------------------------");
            //计算集合的长度
            Console.WriteLine(table.Count);
            Console.WriteLine("---------------------------");
            //移除带有指定键的元素
            table.Remove("username");
            foreach (DictionaryEntry de in table)
            {
                Console.Write(de.Key);
                Console.Write(de.Value);
            }
            Console.WriteLine("---------------------------");
            //集合包含特定键的元素
            if (table.ContainsKey("password"))
            {
                Console.WriteLine("集合中包含特定值");
            }
            Console.WriteLine("---------------------------");
            //集合包含特定键的元素
            if (table.ContainsValue("456"))
            {
                Console.WriteLine("集合中包含特定值");
            }
            Console.WriteLine("---------------------------");
            //清空集合(移除所有元素)
            table.Clear();
            //
            #endregion
        }
    }
}
