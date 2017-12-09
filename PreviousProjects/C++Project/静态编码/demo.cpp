#include"Tank.h"
#include<iostream>
using namespace std;
int main(void)
{
	cout<<Tank::getCount()<<endl;//两种调用函数的方法 
	Tank t(1);
	cout<<t.getCount()<<endl;//两种调用函数的方法，count是私有的数据成员，只能通过函数对其进行访问 
	cout<<Tank::getCount()<<endl;
}
