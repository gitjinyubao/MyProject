#ifndef PERSON_H
#define PERSON_H
#include"Member.h"
#include<iostream>
#include<string>
using namespace std;
class Person
{
	friend void Member::printMessage(Person &p);
		public:
	      Person(string name,string sex,int age);
    private:
    	string m_strName;
    	string m_strSex;
    	int m_iAge;
};
#endif
