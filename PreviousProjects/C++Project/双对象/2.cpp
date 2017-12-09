#include<iostream>
#include"2.h"//没用cout,也就不需要“using namespace std”
using namespace std;
            Car::Car()
			{
				
			 } 
			 void Car::setx(int newx)
			 {
			 	x=newx;
			 }
			 void Car::sety(int newy)
			 {
			 	y=newy;
			 }
			 int Car::gety()
			 {
			 	return y;
			 }
			int Car:: getx()
			{
				return x;
			}

