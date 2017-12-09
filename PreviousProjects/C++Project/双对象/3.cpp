#include<iostream>
#include"3.h"//千万不要加上#include"2.h";[Error] previous definition of 'class Car' 
using namespace std;
Line::Line()
{
	
}
Line::~Line()
{
	
}
void Line::setcar1(int newx,int newy)
{
	car1.setx(newx);//直接将数值传入 
	car1.sety(newy);
}
void Line::setcar2(int  newx,int newy)
{
	car2.setx(newx);
	car2.sety(newy);
}
void Line::display()
{
	cout<<"point1:"<<"("<<car1.getx()<<","<<car1.gety()<<")"<<"--------"<<"point2:"<<"("<<car2.getx()<<","<<car2.gety()<<")"<<endl; 
}
