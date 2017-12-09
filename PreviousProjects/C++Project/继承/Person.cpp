#include<iostream>
#include<string.h>
using namespace std;
class Person
{
	public:
		int age;
		string name;
		Person()
		{
			cout<<"Person()"<<endl;
		}
		~Person()
		{
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
	Worker *w=new Worker();
	w->setAge(22);
	w->setName("jin");
	w->eat();
	w->salary=1000;
	delete w;
	w=NULL;
	cout<<"______"<<endl;
	Worker w1;
	w1.setAge(22);
	w1.setName("yu");
	w1.eat();
	return 0;
}
