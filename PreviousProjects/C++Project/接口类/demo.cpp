#include<iostream>
#include"FighterPlane.h"
#include"Plane.h"
#include"Flyable.h"
using namespace std;
void flyMatch(Flyable *f1,Flyable *f2)//ע�⴫�����ָ�� 
{
	f1->land();//ָ��=��ַ 
	f1->takeoff();
	f2->land();
	f2->takeoff();
}
int main(void)
{
	/*
    Plane p1(1);
	Plane p2(2);
	flyMatch(&p1,&p2);*/ //��ʱս����ֻ�Ǽ̳���Plane ��ʹ�ö���ĵ�ַ 
	FighterPlane p1(3);
	FighterPlane p2(4);
	flyMatch(&p1,&p2);//��ʱ�̳���Plane�ͽӿ���Playable 
    cout<<"_______"<<endl; 
    Flyable *a=new FighterPlane(7);
    a->land();
    a->takeoff();//����ʹ�ýӿ���ָ��ָ����������󣬲��������������ʵ�ֵĽӿ����д��麯�� 
	return 0; 
}
