#ifndef PERSON_H
#define PERSON_H
#include<string>
using namespace std;//û������Ͳ�����string 
class Member;
class Person
{
	    friend class Member;
	public:
	      Person(string name,string sex,int age);
    private:
    	void printMessage();
    	string m_strName;
    	string m_strSex;
    	int m_iAge;
};
#endif
