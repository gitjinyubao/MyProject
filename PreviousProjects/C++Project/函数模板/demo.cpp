#include<iostream>
using namespace std;
template <typename T>
void display(T a)
{
	cout<<a<<endl;
}
template <typename T,class c>//����ģ�� 
void display(T s,c a)
{
	cout<<s<<endl;
	cout<<a<<endl;
	
}
template <typename T,int kSize>// TΪ���Ͳ����� kSizeΪ�������ڱ�ʵ������ʱ��ͳ�Ϊ��һ������ 
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
	display<int,double>(23,99.8);//ģ�庯�� 
	display<int,3>(5);//int ��Ӧ T��3��ӦKSize,5��Ӧa; 
	return 0;
}
