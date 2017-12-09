#include <iostream>
#include <stdlib.h>
#include <string>
using namespace std;
class Person
{
		public:	
		Person()
		{
			
		}
		int m;
	void eat()
	{
		 name="bao";
		cout << "eat()" <<name<< endl;
	}
	protected:
		string name;
		int n;
};
class Soldier :public Person
{
	public:
		Soldier()
		{
			
		}
		void eat()
		{
			age=10;
			name="jin";//保护基类的所有成员在派生类中都被保护起来，类外不能访问，其公用成员和保护成 员可以被其派生类的成员函数访问。
			cout<<name<<endl;
			cout<<"meat"<<age<<endl;
		}
		protected:
			int age;
};
int main(void)
{
	Soldier soldier;
	soldier.eat();//保护基类的所有成员在派生类中都被保护起来，类外不能访问，其公用成员和保护成 员可以被其派生类的成员函数访问。
	soldier.Person::eat();
	soldier.m=3;//公有继承的时候，子类外部可以访问基类的公有数据成员，而保护继承时在子类外部只能通过子类的成员函数访问基类的成员 
	return 0;//如果以公用继承方式派生出一个新派生类，原来私有基类中的成员在新派生类中都成为不可访问的成员，无论在派生类内或外都不能访问，而原来保护基类中的公用成员和保护成员在新派生类中为保护成员，可以被新派生类的成员函数访问。
}
