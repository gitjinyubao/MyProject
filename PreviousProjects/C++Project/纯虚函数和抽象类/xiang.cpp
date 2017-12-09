#include <iostream>
#include <stdlib.h>
#include <string>
using namespace std;

/**
 * ���嶯���ࣺAnimal
 * �麯����eat()
 * ���麯����move()
 * ���ݳ�Ա��m_strName
 */
class Animal
{
public:
    // Ĭ�Ϲ��캯��
    Animal( ){cout << "Animal" << endl;};//ע�����ȵ��õ���Ĭ�Ϲ��캯���������Ĭ�ϵĹ��캯������ô�������ľͲ��ᱻ���ã������������Ǻ��εģ�Ҳ�����ȵ��ø���Ĭ�Ϲ��캯�� 
    // ���ι��캯��
    Animal(string name)
	{
	    m_strName = name; cout << "Animal" << endl;
    }
    // ����������
	virtual ~Animal(){cout << "~Animal" << endl;}
    // ���Ա����
	virtual void eat(){cout << "Animal--" << m_strName << "-- eat" << endl;}
    // ���麯��
	virtual void move()=0;
public:
    // ���ݳ�Ա
	string m_strName;
};

/**
 * ���幷�ࣺDog
 * ���м̳ж�����
 * ���Ա������eat()��move()
 */
class Dog : public Animal{
public:
    // Ĭ�Ϲ��캯��
    Dog(){};
    // ���ι��캯��
	Dog(string name){m_strName = name; cout << "Dog" << endl;}
    // ����������
	virtual ~Dog(){cout << "~Dog" << endl;}
    // ���Ա����eat()
	virtual void eat(){cout << "Dog--" << m_strName << " -- eat" << endl;}
    // ���Ա����move()
	virtual void move(){cout << "Dog--" << m_strName << " -- move" << endl;}
public:
    // ���ݳ�Ա
	string m_strName;
};

int main(void)
{
    // ͨ��������ʵ��������
    Animal *p=new Dog("����");
    // ���ó�Ա����
	p->eat();
    p->move();
    // �ͷ��ڴ�
	delete p;
    p=NULL;
    
	return 0;
}
