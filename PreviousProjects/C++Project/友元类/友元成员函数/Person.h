#ifndef PERSON_H
#define PERSON_H
#include<string>
using namespace std;//没有这个就不能用string 
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
