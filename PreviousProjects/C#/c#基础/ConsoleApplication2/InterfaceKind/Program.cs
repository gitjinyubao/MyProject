using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace InterfaceKind
{
    public interface  Program
    {
        static void Main(string[] args)
        {
             
            //* 不允许使用访问修饰符，所有的借口成员都是公共的
            //* 接口成员不能包含代码体
            //*接口成员不能定义字段成员
            //*接口成员不能用关键字static ，vartual,abstarct,sealed等来定义
            //*类型定义成员是禁止的
        }
    }
}
