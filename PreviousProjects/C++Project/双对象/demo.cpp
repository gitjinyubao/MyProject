#include<iostream>
#include"3.h"//������ϣ�#include"2.h";[Error] redefinition of 'class Car'
using namespace std;
int main()
{
	Line t;
	t.setcar1(1,1);
	t.setcar2(4,4);
	t.display();
	Line *n=new Line();
	delete n;
	n=NULL;//�����delete t;t=NULL;�����ʾ������Ϊt����ջ��ʵ�����Ķ���ϵͳ���Զ����٣��ͷ��ڴ� 
	return 0; //[Error] no match for 'operator=' (operand types are 'Line' and 'long long int') 
}


