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
	cout<<"ȫ����Ԫ����"<<endl;
	jian(c1); //���������� 
	cout<<"�����Ԫ��Ա����"<<endl;
	You y;
	y.fu(c1);
    return 0;	
} 
void jian(Coordinate &c)
{
	c.operator -();
	c.display();
}
