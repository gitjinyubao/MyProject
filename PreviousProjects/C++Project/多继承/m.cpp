#include <iostream>
#include <stdlib.h>
#include <string>
using namespace std;

/**
 * 定义工人类: Worker
 * 数据成员: m_strName
 * 成员函数: work()
 */
class Worker
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
 * 定义儿童类: Children
 * 数据成员: m_iAge
 * 成员函数: play()
 */
class Children
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
 * 定义童工类: ChildLabourer
 * 公有继承工人类和儿童类
 */
class ChildLabourer :public Worker,public Children
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
    // 使用new关键字创建童工类对象
	ChildLabourer *m=new ChildLabourer("jin",22);
    // 通过童工对象调用父类的work()和play()方法
	m->work();
    m->play();
    // 释放
    delete m;
    m=NULL;

	return 0;
}
