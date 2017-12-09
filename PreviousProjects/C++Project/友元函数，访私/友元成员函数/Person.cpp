#include"Person.h"
Person::Person(string name,string sex,int age)
{
	m_strName=name;
	m_strSex=sex;
    m_iAge=age;	
}
//一定要记得 Person::，若无：[Error] expected ')' before 'name' 
