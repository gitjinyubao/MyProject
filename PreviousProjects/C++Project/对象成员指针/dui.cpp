#include <iostream>
using namespace std;
class Point
{    
public:
	Point(int newx, int newy)
	{
		// 设置X,Y的坐标
		x=newx;
		y=newy;
		cout<<"Point的构造函数被调用"<<endl;
	}
	void setx(int newx)
	{
		x=newx;
	}
	int getnewx()
	{
		return x;
	}
	void sety(int newy)
	{
		y=newy;
	}
	int gety()
	{
		return y;
	}
	~Point()
	{
		cout<<"Point的析构函数被调用"<<endl;
	}
public:
	int x;
	int y;
};
class Line
{
	public:
		Point *point1;
		Point *point2;
		Line(int newx1,int newy1,int newx2,int newy2)
		{
			point1=new Point(newx1,newy1);//在堆中实例化的这两个对象，那么就应该在析构函数中删除这两个对象 
			point2=new Point(newx2,newy2);
			cout<<"Line的构造函数被调用"<<endl; 
		}
		void display()
		{
			cout<<"point1:"<<"("<<point1->getnewx()<<","<<point1->gety()<<")"<<endl;
			cout<<"point2:"<<"("<<point2->getnewx()<<","<<point2->gety()<<")"<<endl;
		}
	 ~Line()
		{
			delete point1;
			point1=NULL;
			delete point2;
			point2=NULL; 
			cout<<"Line的析构函数被调用"<<endl;	
		}
};
int main(void)
{
	Line *p=new Line(1,2,3,4);
	p->display(); 
	delete p;
	p=NULL;
	system("pause");
	return 0; 
}


