#include"FighterPlane.h"  
#include<iostream>
using namespace std;  	
	FighterPlane::FighterPlane(int cod):Plane(cod)  
	{
	                //注重参数列表的使用 
	}
	void FighterPlane:: takeoff()
	{
		cout<<"FighterPlane~takeoff()"<<endl;
	}
	void FighterPlane:: land()
	{
		cout<<"FighterPlane~land()"<<endl; 
	}
