#include"Member.h"
#include<iostream>
using namespace std;
Member::Member(string name,string sex,int age):p(name,sex,age)
{
	
}
void text()
{
      p.printMessage();
      cout<<p.m_strName<<","<<p.m_strSex<<","<<p.m_iAge<<endl;
}

