#include <iostream>
#include <stdlib.h>
#include <string>
using namespace std;

/**
 * ��������: Person
 */
class Person
{
public:
    Person()
	{
		cout << "Person" << endl;
	}
	~Person()
	{
		cout << "~Person" << endl;
	}
	void eat()
	{
		cout << "eat" << endl;
	}

};

/**
 * ���幤����: Worker
 * ��̳�����
 */
class Worker : virtual public Person
{
public:
	Worker(string name)
	{
		m_strName = name;
		cout << "Worker" << endl;
	}
	~Worker()
	{
		cout << "~Worker" << endl;
	}
	void work()
	{
		cout << m_strName << endl;
		cout << "work" << endl;
	}
protected:
	string m_strName;
};

/**
 * �����ͯ��:Children
 * ��̳�����
 */
class Children :virtual public Person
{
public:
	Children(int age)
	{
		m_iAge = age;
		cout << "Children" << endl;
	}	
	~Children()
	{
		cout << "~Children" << endl;
	}	
	void play()
	{
		cout << m_iAge << endl;
		cout << "play" << endl;
	}
protected:
	int m_iAge;
};

/**
 * ����ͯ���ࣺChildLabourer
 * ���м̳й�����Ͷ�ͯ��
 */
class ChildLabourer:public Children,public Worker  
{
public:
	ChildLabourer(string name, int age):Worker(name),Children(age)
	{
		cout << "ChildLabourer" << endl;
	}

	~ChildLabourer()
	{
		cout << "~ChildLabourer" << endl;
	}	
};

int main(void)
{
    // ��new�ؼ���ʵ����ͯ�������
	ChildLabourer *p=new ChildLabourer("jin",15);
    // ����ͯ��������������
	p->eat();
	p->work();
	p->play();
	delete p;
	p = NULL;

	return 0;
}
