#include<iostream>
using namespace std;
template<typename T>
void swap(T a,T b)
{
	int s=0;
	s=a;
	a=b;
	b=s;
	cout<<a<<" "<<b<<endl; 
}
int main(void)
{
	swap<int>(3,4);
	return 0;
}
/*
#include <iostream>
using namespace std;

/**
 * ����ģ�庯��swapNum
 * ʵ�ֹ��ܣ�������������λ��
 */
/*template <typename T>
void aswap(T& a, T& b)//ע��Ҫ��&��ȡ��ַ 
{
    T temp = a;
    a = b;
    b = temp;
}

int main(void)
{
    int x = 10;
    int y = 20;
    // ����ģ�庯��
    aswap<int>(x, y);//x,y�൱����һ����������Ҫ��& 
    cout << "x = " << x << endl;
    cout << "y = " << y << endl;
	return 0;
}
*/ 
