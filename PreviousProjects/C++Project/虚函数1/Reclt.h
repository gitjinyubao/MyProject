#ifndef RECLT_H
#define RECLT_H
#include<iostream>
#include"Shape.h"
class Reclt :public Shape 
{
	public:
		Reclt(int height,int weidth);
		~Reclt();
	    double getArea(int height,int weidth);
		protected:
			int weidth;
			int height;
}; 
#endif
