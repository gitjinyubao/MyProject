#include <iostream>
using namespace std;
class Coordinate
{    
public:
	Coordinate(int x, int y)
	{
		// ����X,Y������
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
		cout<<"����"<<endl; 
	}
public:
	int m_iX;
	int m_iY;
};

int main(void)
{
    // �ڶ��ϴ�������ָ��
	Coordinate *p=new Coordinate(3,5);
    
    // ��ӡ����
	cout <<(*p).m_iX<<(*p).m_iY<<endl;
    // ���ٶ���ָ��
	delete p;
    p=NULL;
    Coordinate c(3,4);
    Coordinate d(c); 
    cout <<d.m_iX<<d.m_iY<<endl;
	 return 0;
}
