#include<iostream>
using namespace std;
class Point
{
	private:
		int x;
		int y;
		public:
			void setx(int newx)
			{
				//x=newx;
			}
			void sety(int newy)
			{
				//y=newy;
			}
			Point(int newx,int newy) 
			{
				x=newx;
				y=newy;
			}
			int getx() const
			{
				return x;
			}
			int gety() const
			{
				return y;
			}
};
class Line
{
	private:
		const Point p1;
		      Point p2;
	public:
			Line(int newx1,int newy1,int newx2,int newy2):p1( newx1, newy1),p2( newx2, newy2)  
			{
				//ʹ�ó�ʼ���б���г�ʼ�� 
			}
			void setP1(int newx1,int newy1)
			{
				//p1.setx(newx1);
				//p1.sety(newy1);
			}
			void setP2(int newx2,int newy2)
			{
				p2.setx(newx2);
				p2.sety(newy2);
			}
			void display() const
			{
				cout<<p1.getx()<<","<<p1.gety()<<endl;
				cout<<p2.getx()<<","<<p2.gety()<<endl;
				cout<<"chang"<<endl;
			}	
			void display() 
			{
				cout<<p1.getx()<<","<<p1.gety()<<endl;
				cout<<p2.getx()<<","<<p2.gety()<<endl;
				cout<<"putong"<<endl;
			}		 
};
int main(void)
{
    const Line l(1,2,3,4);//������ſ��Ե��ó���Ա���� 
    l.display(); 
    Line t1(3,4,5,6);
    t1.display();
    Point g1(4,3);
    Point *q=&g1;//����ָ�룺����ĸ�ֵ��ȡ��ַ 
    Point &q1=g1;//��������ã�����Ķ�����ȡ��ַ 
	 //const Point *q=&g1;   ����*q����˳�ָ�룬ֻ�ܵ��ó������������ݳ�Ա����ʱ��g1������ͨ���� 
	 //Point &q1=g1;   ����&q1����˳����� 
	 system("pause"); 
	return 0;
}

