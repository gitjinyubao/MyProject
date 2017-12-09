#include <iostream>
using namespace std;
class Coordinate
{    
public:
	Coordinate(int x, int y)
	{
		// 设置X,Y的坐标
		m_iX=x;
        m_iY=y;        
	}
	void setX(int newx)
	{
		m_iX=newx;
	}
	void setY(int newy)
	{
		m_iY=newy;
	}
	int getX()
	{
		return m_iX;
	}
	int getY()
	{
		return m_iY;
	}
	Coordinate(const Coordinate& at)
	{
		m_iX=at.m_iX;
		m_iY=at.m_iY;
		cout<<"拷贝"<<endl; 
	}
public:
	int m_iX;
	int m_iY;
};

int main(void)
{
    // 在堆上创建对象指针
	Coordinate *p=new Coordinate(3,5);
    
    // 打印坐标
	cout <<(*p).m_iX<<(*p).m_iY<<endl;
    // 销毁对象指针
	delete p;
    p=NULL;
    Coordinate c(3,4);
    Coordinate d(c); 
    cout <<d.m_iX<<d.m_iY<<endl;
	 return 0;
}
