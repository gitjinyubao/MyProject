#include<iostream>
#include"Shape.h"
using namespace std;
		Shape::Shape()
		{
			cout<<"Shape()"<<endl;
		}
	 Shape::~Shape() 
		{
			cout<<"~Shape()";
		}
	    double Shape::getArea()
		{
			cout<<"ShapeArea()"<<endl;
			return 0;
		}	

