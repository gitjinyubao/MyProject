#include<iostream>
#include"Person.h"
#include"Member.h" 
#include<string>
using namespace std;
int main(void)
{
	Person p("jin","man",22);
	Member m;
	m.printMessage(p);//ͨ����Ա�������Է�����һ�����˽�����ݳ�Ա 
	//p.m_iAge;�ᱨ�� 
	return 0;
}
 
