#ifndef MEMBER_H
#define MEMBER_H
#include"Person.h"//必须这样来引用另外一个类 
class Member
{
	public:
		Member(string name,string sex,int age);
		void text();
	private:
			Person p;
};
#endif//后面没有分号 
//友元成员函数 
