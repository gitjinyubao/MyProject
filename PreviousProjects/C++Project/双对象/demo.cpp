#include<iostream>
#include"3.h"//如果加上：#include"2.h";[Error] redefinition of 'class Car'
using namespace std;
int main()
{
	Line t;
	t.setcar1(1,1);
	t.setcar2(4,4);
	t.display();
	Line *n=new Line();
	delete n;
	n=NULL;//如果是delete t;t=NULL;则会显示错误，因为t是在栈中实例化的对象，系统会自动销毁，释放内存 
	return 0; //[Error] no match for 'operator=' (operand types are 'Line' and 'long long int') 
}


