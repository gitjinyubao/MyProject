#include<iostream>
#include"Person.h"
#include"Member.h" 
#include<string>
using namespace std;
int main(void)
{
	Person p("jin","man",22);
	Member m;
	m.printMessage(p);//通过友员函数可以访问另一个类的私有数据成员 
	//p.m_iAge;会报错 
	return 0;
}
 
