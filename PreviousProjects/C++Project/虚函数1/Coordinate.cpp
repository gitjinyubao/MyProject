#include"Coordinate.h"
#include<iostream>
using namespace std;
	Coordinate::Coordinate (int newx,int newy)
	{
		x=newx;
		y=newy;
		cout<<"Coordinate()"<<endl;
	}
	Coordinate::~Coordinate()
	{
		cout<<"~Coordinate()"<<endl;
	}
	void Coordinate:: setx(int newx)
	{
		x=newx;
	}
		int Coordinate:: gety()
		{
			return y;
		}
		void Coordinate:: sety(int newy)
		{
		    y=newy;
		}
		int Coordinate:: getx()
		{
			return x;
		}
		
