#include<iostream>
#include"Shape.h"
#include"Coordinate.h"
class Circle :public Shape
{
	public:
		Circle(int readius);
		~Circle();
		 double getArea(int readius);
		protected:
			int radius;	
			Coordinate *c;	
};

