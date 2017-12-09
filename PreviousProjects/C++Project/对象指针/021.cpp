#include<iostream>
using namespace std;
class Point
{ 
    private:
    	int x;
    	int y;
    public:
    	void setX(int newx)
    	{
    		x=newx;
		}
		int getX()
		{
			return x;
		}
		void setY(int newy)
		{
			y=newy;
		}
		int getY()
		{
			return y; 
		} 
		~Point()
		{
			
		}
} ;
int main(void)
{
	Point s[1];
	s[0].setX(2);
	s[0].setY(2);
	cout<<"Point1:"<<"("<<s[0].getX()<<","<<s[0].getY()<<")"<<endl;
	Point *p=new Point[3];
	p->setX(3);
	p->setY(3);
	cout<<"Point2:"<<"("<<p->getX()<<","<<p->getY()<<")"<<endl;
	(p+1)->setX(4);
	(p+1)->setY(4);//ͬp++ 
	cout<<"Point3:"<<"("<<(p+1)->getX()<<","<<(p+1)->getY()<<")"<<endl;
	p[2].setX(5);
	p[2].setY(5);
	cout<<"Point4:"<<"("<<p[2].getX()<<","<<p[2].getY()<<")"<<endl;
	Point d[5];
	for(int i=0;i<5;++i)
	{
		d[i].setX(6*i);
		cout<<d[i].getX()<<endl; 
	}
}
