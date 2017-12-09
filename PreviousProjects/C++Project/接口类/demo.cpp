#include<iostream>
#include"FighterPlane.h"
#include"Plane.h"
#include"Flyable.h"
using namespace std;
void flyMatch(Flyable *f1,Flyable *f2)//注意传入的是指针 
{
	f1->land();//指针=地址 
	f1->takeoff();
	f2->land();
	f2->takeoff();
}
int main(void)
{
	/*
    Plane p1(1);
	Plane p2(2);
	flyMatch(&p1,&p2);*/ //此时战斗机只是继承了Plane ，使用对象的地址 
	FighterPlane p1(3);
	FighterPlane p2(4);
	flyMatch(&p1,&p2);//此时继承了Plane和接口类Playable 
    cout<<"_______"<<endl; 
    Flyable *a=new FighterPlane(7);
    a->land();
    a->takeoff();//可以使用接口类指针指向其子类对象，并调用子类对象中实现的接口类中纯虚函数 
	return 0; 
}
