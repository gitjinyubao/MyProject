#ifndef EXCEPTION_H
#define EXCEPTION_H
#include<iostream>
using namespace std;
class Exception
{
	public:
		virtual ~Exception()
		{
			
		}
		virtual void exception()
		{
			cout<<"fu捕获异常"<<endl;
		}
};
#endif
class IndexException:public Exception
{
	public:
		virtual void exception()
		{
			cout<<"zi捕获异常"<<endl;
		}
};
/*void f1()
{
	throw 0.1; 
}*/
void f1()
{
	throw IndexException(); 
}
int main(void)
{
	/*try
	{
		f1(); 
	} 
	catch(double)
	{
		cout<<"exception"<<endl; 
	}*/
	try
	{
		f1(); 
	} 
	/*catch(IndexException &e)
	{
		 e.exception();
	}*/
	/*catch(Exception &e)
	{
		 e.exception();
	}*/
	catch(...)
	{
		 cout<<"yichang"<<endl;
	}
	return 0;
}
