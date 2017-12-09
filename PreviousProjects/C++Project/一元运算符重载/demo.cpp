#include"Coordinate.h"
#include"You.h"
#include<iostream>
using namespace std;
void jian();
int main(void)
{
	Coordinate c1(2,2);
	cout<<"-"<<endl;
	-c1;
	c1.display();	
	cout<<"++"<<endl; 
	++c1; 
	c1.display();
	cout<<"全局友元函数"<<endl;
	jian(c1); //对象即是引用 
	cout<<"类的友元成员函数"<<endl;
	You y;
	y.fu(c1);
    return 0;	
} 
void jian(Coordinate &c)
{
	c.operator -();
	c.display();
}
