#ifndef COORDINATE_H
#define COORDINATE_H 
#include"You.h"
class Coordinate
{
	friend void You::fu(Coordinate &C); 
	friend void jian(Coordinate &c);
	public:
    Coordinate(int newx,int newy);
	int getX();
	int getY();
	Coordinate &operator-();
	Coordinate &operator ++();
	//Coordinate &operator ++(int);   //∫Û÷√º”º” 
	void display();
	private:
		int x;
		int y;
}; 
#endif
