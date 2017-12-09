#ifndef COORDINATE_H
#define COORDINATE_H 
#include<iostream>
class Coordinate
{
	public:
		Coordinate(int newx,int newy);
		~Coordinate();
		void setx(int newx);
		int gety();
		void sety(int newy);
		int getx();
		
			int x;
			int y;
};
#endif
