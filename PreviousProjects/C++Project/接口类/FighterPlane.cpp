#include"FighterPlane.h"  
#include<iostream>
using namespace std;  	
	FighterPlane::FighterPlane(int cod):Plane(cod)  
	{
	                //ע�ز����б��ʹ�� 
	}
	void FighterPlane:: takeoff()
	{
		cout<<"FighterPlane~takeoff()"<<endl;
	}
	void FighterPlane:: land()
	{
		cout<<"FighterPlane~land()"<<endl; 
	}
