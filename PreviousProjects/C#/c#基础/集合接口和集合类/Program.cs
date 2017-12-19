using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace 集合接口和集合类
{
    class Program
    {
        /// <summary>
        /// 各种集合的一般用法
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            #region Arraylist的一般用法
            //需要引用System.Collections的命名空间
            /*
             * ArrayList是动态数组，而Array是静态数组
             * 动态的增加和减少元素
             * 动态的访问元素支持多种数据类型的同时存储
             * 实现了ICollection和IList接口
             * 支持自动改变大小的功能
             */
            //定义一个ArrayList的集合类
            ArrayList arraylist = new ArrayList();
            //集合的末尾添加元素;Add()
            arraylist.Add(1);
            //集合的指定位置插入元素:Insert();会把原来位置上的元素的索引值加一
            arraylist.Insert(1,"我们");
            arraylist.Insert(0,2);
            //遍历集合中的元素：foreach
            foreach(Object o in arraylist)
            {
                Console.WriteLine(o.ToString());
            }
            Console.WriteLine("-------------------");
            //定义一个新的集合
            ArrayList arraylist1 = new ArrayList();
            //新的集合里面插入元素
            arraylist1.Insert(0,3);
            //将其他的集合增加到新集合的末尾
            arraylist1.AddRange(arraylist);
            //将其他的集合插入到指定位置
            arraylist1.InsertRange(4,arraylist);
            //遍历集合
            foreach(Object o in arraylist1)
            {
                Console.WriteLine(o.ToString());
            }
            //获得元素xx第一次出现的索引位置
            int index=arraylist1.IndexOf("3");
            Console.WriteLine(index);
            //将数组元素移除
            arraylist1.Remove(1);
            //将其他的集合复制到新集合的某一范围上
            arraylist1.SetRange(1,arraylist);
            //获取新集合的某个子集合
            ArrayList arraylistNew = arraylist1.GetRange(2,3);
            //遍历子集合
            foreach(Object o in arraylistNew)
            {
                Console.WriteLine(o.ToString());
            }
            Console.WriteLine("------------------");
            //定义一个int类型的集合
            ArrayList arraylistInt = new ArrayList();
            //添加元素
            arraylistInt.Add(3);
            arraylistInt.Add(2);
            arraylistInt.Add(1);
            //数组排序
            arraylistInt.Sort();
            //遍历集合
            foreach(Object o in arraylistInt)
            {
                Console.WriteLine(o.ToString());
            }
            //集合中是有否包含此内容的元素
            Console.WriteLine(arraylistInt.Contains("1"));
            //清空集合
            arraylistInt.Clear();
            Console.WriteLine("--------------");
            //此外集合还有的方法是：
            /*
             * Reserve() 将集合或其中一部分的元素进行发转
             * CopyTo() 将集合或其中一部分元素复制到集合中去
             * ToArray() 将集合中的元素复制到新的集合中去
            */
            #endregion

            #region HashTable的一般用法
            /*
             * HashTable是一个键/值对集合，也可以认为是一种字典集合，它的数据是通过键和值来组织的。
             * HashTable可以被称为散列表或者哈希表
             * 可通过键来找到相应的值
             * 常用属性：Count:键值对数量
             *           Keys:获取或设置HashTable中键的集合
             *           Values：获取或设置HashTable中值的集合
             * 常用方法：Add() 添加
             *           Clear() 移除
             *           Clone() 浅表副本
             *           Contains() 包含特定的键
             *           ContainsKey() 包含特定的键
             *           ContainsValue() 包含特定的值
             *           CopyTo() 复制到指定索引位置
             *           Remove（） 移除特定键的元素
             */
            //定义一个HashTable类型的集合
            Hashtable hashtable = new Hashtable();
            //向集合中添加元素
            hashtable.Add("1",1);
            hashtable.Add("2",2);
            //查看是否包含特定的键
            Console.WriteLine(hashtable.ContainsKey("1"));
            //遍历集合；hashtable.Values代表集合中值的集合
            foreach(int e in hashtable.Values)
            {
                Console.WriteLine(e);
            }
            //遍历集合:使用DictionaryEntry
            foreach(DictionaryEntry iterm in hashtable)
            {
                Console.WriteLine(iterm.Value);
            }
            #endregion

            #region SortedList的一般用法
            /*
             * SortedList是混合性的集合，他也是表示键值对的集合，兼顾了ArrayList和HashTable的优点，不仅可以按照索引访问元素，也可以通过键名来访问元素
             * 由于SortedList中的元素都是经过排序存放的，因此又将其称为排序列表
             * 键和值都是顺序排列，和HashTable的区别
             * 常用方法：Add() 添加
             *           Clear() 清除
             *           Contains() 包含特定的键
             *           ContainsKey() 包含特定的键
             *           ContainsValue() 包含特定的值
             *           CopyTo() 复制到指定索引位置
             *           IndexOfKey() .....
             *           IndexOfValue()....
             *           SetByIndexOf() 替换集合中指定索引处的值
             *           GetByIndexOf() 获取集合中指定索引出的值
             *           GetByIndex() 获取集合中指定索引处的值
             *           GetKey() 获取集合中指定索引处的键
             *           GetKeyList() 获取集合中的键
             *           GetValueList() 获取集合中的值
             *           Remove() ...移除指定键
             *           RemoveAt()..移除指定键
             */
            //定义一个集合
            SortedList list = new SortedList();
            //添加元素
            list.Add("1",1);
            list.Add("2",2);
            //遍历元素
            for (int i = 0; i < list.Count;++i )
            {
                Console.WriteLine("\t{0}:\t{1}",list.GetKey(i),list.GetByIndex(i));
            }
            Console.WriteLine("-------------");
            //遍历元素
            foreach(DictionaryEntry iterm in list)
            {
                Console.WriteLine(iterm.Value);
            }
            #endregion

            #region Stack的一般用法
            /*
             * 堆栈集合，先进后出
             * 常用属性：Count
             * 常用方法：Clear()
             *           Clone()创建Stack的浅表副本
             *           CopyTo()从指定集合索引开始将Stack复制到现有的一维数组中
             *           Peek()返回位于Stack顶部的对象但是不将其移除
             *           Pop()移除并且返回位于Stack顶部的对象
             *           Push()将Push()对象插入Stack的顶部
             *           ToArray()将Stack复制到新集合
             */
            //定义一个Stack类型的集合
            Stack stack = new Stack();
            //向集合中添加元素(压栈)
            stack.Push("jin");
            stack.Push("yu");
            stack.Push("bao");
            //移除顶部元素
            stack.Pop();
            //遍历循环元素
            foreach(string e in stack)
            {
                Console.WriteLine(e);
            }
            #endregion

            #region 不常用集合类 Queue BitArray
            /*
             * 此外还有不常用集合类：Queue(先进先出)
             *                       常用属性：
             *                               Count
             *                       常用方法：
             *                               Clear()
             *                               Contains()
             *                               CopyTo()
             *                               Dequeue()返回并移除集合开始处元素
             *                               Enqueue()将元素添加到结尾处
             *                               GetEnumerator()
             *                               Peek() 返回集合开始处元素
             *                               TrimToSize() 容量设置为集合元素的实际数目
             *                               
             *                       BitArray(管理位值的压缩数组，该值表示布尔值)
             *                                true表示位值是打开的(1)
             *                                false...............(0)
             */
            #endregion
        }
    }
}
