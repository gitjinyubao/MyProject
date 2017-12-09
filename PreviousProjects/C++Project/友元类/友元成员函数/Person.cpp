#include"Person.h"
#include<iostream>
using namespace std;
Person::Person(string name,string sex,int age)
{
	m_strName=name;
	m_strSex=sex;
    m_iAge=age;	
}
void Person::printMessage()
{
      cout<<m_strName<<","<<m_strSex<<","<<m_iAge<<endl; 
}
