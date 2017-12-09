#include<iostream>
#include"Reclt.h"
#include"Circle.h"
#include"Shape.h"
#include"Coordinate.h"
using namespace std;
int main(void)
{
	Shape *p=new Circle(12);
	Shape *p1=new Reclt(2,4);
	p->getArea();
	p1->getArea();
	delete p;
	p=NULL;
	cout<<"_____"<<endl;
	delete p1;
	p1=NULL;
	
	
	
	
	
}
