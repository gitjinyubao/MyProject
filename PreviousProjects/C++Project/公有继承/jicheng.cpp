#include<iostream>
#include<string.h>
using namespace std;
class Person
{
	protected:
		string name;
	public:
		int age;
		Person()
		{
			cout<<"Person()"<<endl;
		}
		~Person()
		{
			cout<<name<<endl;
			cout<<"~Person()"<<endl;
		}
		void setAge(int newage)
		{
			age=newage;
		}
		void eat()
		{
			cout<<"eat()"<<endl;
		}
		int getAge()
		{
			return age;
		}
		void setName(string newname)
		{
			name=newname;
		}
		string getName()
		{
			return name;
		}
};
class Worker:public Person
{
	public:
		int salary;
		Worker()
		{
			cout<<"Worker()"<<endl;
		}
		~Worker()
		{
			cout<<"~Worker()"<<endl;
		}
};
int main(void)
{
	Worker w1;
	w1.setAge(22);
	w1.setName("yu");//ע�⣺���м̳��б���Ȩ�޵����ݳ�ԱҲ�ǿ����������õ� 
	w1.eat();
	return 0;
}
