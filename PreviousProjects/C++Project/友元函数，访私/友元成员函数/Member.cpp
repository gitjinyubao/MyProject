#include"Member.h"
#include"Person.h"
#include<iostream>
using namespace std;
void Member::printMessage(Person &p)
{
      cout<<p.m_strName<<","<<p.m_strSex<<","<<p.m_iAge<<endl; 
      //����ط���ʱ���������õ���ݼ� 
}

