#include <iostream>
using namespace std;
class Point
{    
public:
	Point(int newx, int newy)
	{
		// ����X,Y������
		x=newx;
		y=newy;
		cout<<"Point�Ĺ��캯��������"<<endl;
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
		cout<<"Point����������������"<<endl;
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
			point1=new Point(newx1,newy1);//�ڶ���ʵ������������������ô��Ӧ��������������ɾ������������ 
			point2=new Point(newx2,newy2);
			cout<<"Line�Ĺ��캯��������"<<endl; 
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
			cout<<"Line����������������"<<endl;	
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


