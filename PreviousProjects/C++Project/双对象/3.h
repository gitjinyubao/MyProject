#include<iostream>
#include"2.h"//û��cout,Ҳ�Ͳ���Ҫ��using namespace std�� 
class Line
{
	private:
		Car car1;
		Car car2;
	public:
		Line();
		~Line();
		void setcar1(int newx,int newy);
		void setcar2(int newx,int newy);
		void display();	        
};

