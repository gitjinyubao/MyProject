#ifndef CIRCLE_H
#define CIRCLE_H
#include<iostream>
#include"Circle.h"
using namespace std;
		Circle::Circle(int readius)
		{
			cout<<"Circle()"<<endl;
			radius=readius;
			c=new Coordinate(2,2);
				
		}
		Circle::~Circle()
		{
			cout<<"~Circle()"<<endl;
			delete c;
			c=NULL;
		}
		double Circle:: getArea(int readius)
		{
			cout<<"CircleArea()"<<endl;
			return 3.14*radius*radius; 
		}
#endif			

