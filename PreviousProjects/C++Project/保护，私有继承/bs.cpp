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
			name="jin";//������������г�Ա���������ж����������������ⲻ�ܷ��ʣ��乫�ó�Ա�ͱ����� Ա���Ա���������ĳ�Ա�������ʡ�
			cout<<name<<endl;
			cout<<"meat"<<age<<endl;
		}
		protected:
			int age;
};
int main(void)
{
	Soldier soldier;
	soldier.eat();//������������г�Ա���������ж����������������ⲻ�ܷ��ʣ��乫�ó�Ա�ͱ����� Ա���Ա���������ĳ�Ա�������ʡ�
	soldier.Person::eat();
	soldier.m=3;//���м̳е�ʱ�������ⲿ���Է��ʻ���Ĺ������ݳ�Ա���������̳�ʱ�������ⲿֻ��ͨ������ĳ�Ա�������ʻ���ĳ�Ա 
	return 0;//����Թ��ü̳з�ʽ������һ���������࣬ԭ��˽�л����еĳ�Ա�����������ж���Ϊ���ɷ��ʵĳ�Ա���������������ڻ��ⶼ���ܷ��ʣ���ԭ�����������еĹ��ó�Ա�ͱ�����Ա������������Ϊ������Ա�����Ա���������ĳ�Ա�������ʡ�
}
