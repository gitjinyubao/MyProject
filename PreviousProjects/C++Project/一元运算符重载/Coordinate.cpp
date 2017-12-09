#include"Coordinate.h"
#include<iostream>
using namespace std;
Coordinate::Coordinate(int newx,int newy)
{
	x=newx;
	y=newy;
}
	int Coordinate:: getX()
	{
		return x;
	}
	int Coordinate:: getY()
	{
		return y;
	}
	Coordinate & Coordinate::  operator -()
	{
		x=-x;//this->x=-(this->x);括号可有可无 
		y=-y;
		return *this;//*this表示一个值=引用 
	}
	//Coordinate & Coordinate::operator ++(int)
	{
		Coordinate old(*this);//后置加加的定义 
		this->x++;
		this->y++;
		return old;
	}
	Coordinate & Coordinate::operator ++()
	{
		x++;
		y++;
		return *this;
	}
	void Coordinate::display()
	{
	      cout<<Coordinate::getX()<<" "<<Coordinate::getY()<<endl;	
	}	
