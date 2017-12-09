#include<iostream>
#include<string>
using namespace std;
class Person
{
	protected:
		string m_strName;
	public:
		Person(string name)
		{
			m_strName=name;
		}
		virtual ~Person()
		{
			
		}
		virtual void work()=0; 
	
};
class Worker:public Person
{
	public:
		Worker(string name,int age):Person(name)
		{
			m_iAge=age;
		}
		virtual void work()=0;
		protected:
			int m_iAge;
};
class Dustman:public Worker 
{
	public:
		Dustman(string name,int age ):Worker(name,age)
		{
			
		}
		void work()
		{
			cout<<"ɨ��"<<endl;
		}
};
int main(void)
{
	Dustman d("zhang",22);
	d.work();
	Person *p=new Dustman("qi",23);
	p->work();
	delete p;
	p=NULL;
	return 0;//��ס�������ǲ�����ʵ������ֻ�н��������д��麯��ʵ�ֵ�����ſ���ʵ���� 
}
