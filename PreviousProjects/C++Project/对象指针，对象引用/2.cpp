#include <iostream>
using namespace std;
class Coordinate
{   
public:
	Coordinate(int x, int y) 
	{
		// ����X,Y������
		this->m_iX=x;
        m_iY=y;
	}
    // ʵ�ֳ���Ա����
	void printInfo() const
	{
	    cout<<"("<<m_iX<<","<<m_iY<<")"<<endl;
	}
public:
	int m_iX;
	int m_iY;
};
int main(void)
{
	const Coordinate coor(3, 5);

	// ������ָ��p
	const Coordinate *p=&coor;
    // ����������c
    const Coordinate &c=coor;
	
	coor.printInfo();
	p->printInfo();
	c.printInfo();  	
	return 0;
}
