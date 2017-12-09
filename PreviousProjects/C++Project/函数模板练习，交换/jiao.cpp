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
 * 定义模板函数swapNum
 * 实现功能：交换两个数的位置
 */
/*template <typename T>
void aswap(T& a, T& b)//注意要用&，取地址 
{
    T temp = a;
    a = b;
    b = temp;
}

int main(void)
{
    int x = 10;
    int y = 20;
    // 调用模板函数
    aswap<int>(x, y);//x,y相当于是一个容器所以要用& 
    cout << "x = " << x << endl;
    cout << "y = " << y << endl;
	return 0;
}
*/ 
