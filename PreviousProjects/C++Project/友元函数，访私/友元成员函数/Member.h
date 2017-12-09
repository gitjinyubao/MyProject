#ifndef MEMBER_H
#define MEMBER_H
class Person;//必须这样来引用另外一个类 
class Member
{
	public:
		void printMessage(Person &p);
};
#endif//后面没有分号 
//友元成员函数 
