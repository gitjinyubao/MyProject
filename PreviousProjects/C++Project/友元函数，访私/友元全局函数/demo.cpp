#include"Person.h"
#include<iostream>
using namespace std;
void print(Person &p);
int main(void)
{
	Person p("jin","man",22);
	print(p);	
}
void print(Person &p)
{
	cout<<p.m_strName<<","<<p.m_strSex<<","<<p.m_iAge<<endl;
}
//友元全局函数 

