#include<iostream>
using namespace std;
#ifndef 
#define 
class Shape
{
	public:
		Shape()
		{
			cout<<"Shape()"<<endl;
		}
		~Shape()
		{
			cout<<"~Shape()";
		}
		virtual double  getArea()
		{
			cout<<"ShapeArea()"<<endl;
			return 0;
		}	
};
#endif

#ifndef
#define
class Circle :public Shape
{
	public:
		Circle(int readius)
		{
			cout<<"Circle()"<<endl;
			radius=readius;
		}
		~Circle()
		{
			cout<<"~Circle()"<<endl;
		}
		virtual double getArea(int readius)
		{
			cout<<"CircleArea()"<<endl;
			return 3.14*radius*radius; 
		}
		protected:
			int radius;
		
};
#endif

#ifndef
#define
class Reclt :public Shape 
{
	public:
		Reclt(int height,int weidth)
		{
			this->height=height;
			this->weidth=weidth;
			cout<<"Reclt()"<<endl;
		}
		~Reclt()
		{
			cout<<"~Reclt()"<<endl; 
		} 
		virtual double getArea(int height,int weidth)
		{
			cout<<"RecltArea()"<<endl;
			return height*weidth;
		}
		protected:
			int weidth;
			int height;
}; 
#endif
int main(void)
{
	Shape *p=new Circle(12);
	Shape *p1=new Reclt(2,4);
	p->getArea();
	p1->getArea();
	delete p;
	p=NULL;
	delete p1;
	p1=NULL;
}
