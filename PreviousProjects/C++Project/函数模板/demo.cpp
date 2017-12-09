#include<iostream>
using namespace std;
template <typename T>
void display(T a)
{
	cout<<a<<endl;
}
template <typename T,class c>//函数模板 
void display(T s,c a)
{
	cout<<s<<endl;
	cout<<a<<endl;
	
}
template <typename T,int kSize>// T为类型参数， kSize为变量，在被实例化的时候就成为了一个常量 
void display(T a)
{
	for(int i=0;i<kSize;i++)
	{
		cout<<"s"<<endl;
	}
}

int main(void)
{
	display<int>(2);
	display<int,double>(23,99.8);//模板函数 
	display<int,3>(5);//int 对应 T，3对应KSize,5对应a; 
	return 0;
}
