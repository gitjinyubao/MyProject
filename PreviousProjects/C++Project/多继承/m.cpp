#include <iostream>
#include <stdlib.h>
#include <string>
using namespace std;

/**
 * ���幤����: Worker
 * ���ݳ�Ա: m_strName
 * ��Ա����: work()
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
 * �����ͯ��: Children
 * ���ݳ�Ա: m_iAge
 * ��Ա����: play()
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
 * ����ͯ����: ChildLabourer
 * ���м̳й�����Ͷ�ͯ��
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
    // ʹ��new�ؼ��ִ���ͯ�������
	ChildLabourer *m=new ChildLabourer("jin",22);
    // ͨ��ͯ��������ø����work()��play()����
	m->work();
    m->play();
    // �ͷ�
    delete m;
    m=NULL;

	return 0;
}
