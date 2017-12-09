#include"Tank.h"
#include<iostream>
using namespace std;
int Tank::count=0;
Tank::Tank(int code)
{
	m_iCode=code;
	count++;
}
Tank::~Tank()
{
	cout<<"~Tank()"<<endl;
	count--;
}
void Tank:: fire()
{
	cout<<"fire()"<<endl;
}

int Tank::getCount()
{
	return count;
}
