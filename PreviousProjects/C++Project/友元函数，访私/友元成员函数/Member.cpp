#include"Member.h"
#include"Person.h"
#include<iostream>
using namespace std;
void Member::printMessage(Person &p)
{
      cout<<p.m_strName<<","<<p.m_strSex<<","<<p.m_iAge<<endl; 
      //这个地方暂时还不可以用到快捷键 
}

