#include<iostream>
#include"Reclt.h"
using namespace std;
		Reclt::Reclt(int height,int weidth) 
		{
			this->height=height;
			this->weidth=weidth;
			cout<<"Reclt()"<<endl;
		}
		Reclt::~Reclt()
		{
			cout<<"~Reclt()"<<endl; 
		} 
		double Reclt:: getArea(int height,int weidth)
		{
			cout<<"RecltArea()"<<endl;
			return height*weidth;
		}
