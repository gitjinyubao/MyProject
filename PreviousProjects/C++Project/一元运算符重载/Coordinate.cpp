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
		x=-x;//this->x=-(this->x);���ſ��п��� 
		y=-y;
		return *this;//*this��ʾһ��ֵ=���� 
	}
	//Coordinate & Coordinate::operator ++(int)
	{
		Coordinate old(*this);//���üӼӵĶ��� 
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
