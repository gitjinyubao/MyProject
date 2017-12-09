#include <iostream>
using namespace std;

/**
 * ����Coordinate��
 * ���ݳ�Ա��m_iX��m_iY
 * ��Ա���������캯��
 * ����--�����������+�����
 */
class Coordinate
{
public:
    Coordinate(int x, int y)
	{
		m_iX = x;
		m_iY = y;
	}
    // ǰ��--���������
	Coordinate & operator--()
	{
		--m_iX;
		--m_iY;
	}
    
    // ����--���������
    Coordinate operator--(int)
	{
		Coordinate old(*this);
		this->m_iX--;
		this->m_iY--;
		return old;
	 } 
    // +�����������
	Coordinate &operator+(Coordinate &c2)
	{
		Coordinate temp(0,0);
		temp.m_iX=this->m_iX+c2.m_iX;
		temp.m_iY=this->m_iY+c2.m_iY;
		return temp;
	}
    

public:
	int m_iX;
	int m_iY;
};

int main(void)
{
	Coordinate coor1(1, 3);
	Coordinate coor2(2, 4);
	Coordinate coor3(0, 0);

    coor1--;
    --coor2;
	coor3 = coor1 + coor2;

	cout << coor3.m_iX << endl;
	cout << coor3.m_iY << endl;

	return 0;
}
