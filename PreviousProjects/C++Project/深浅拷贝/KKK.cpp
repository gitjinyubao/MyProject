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
public:
	int m_iX;
	int m_iY;
};

int main(void)
{
    // �ڶ��ϴ�������ָ��
	Coordinate *p=new Coordinate(3,3);//��Ϊ���ι��캯�������븳ֵ������ 
    // ��ӡ����
	cout <<(*p).m_iX<< (*p).m_iY<<endl;
	cout<<"________"<<endl;
    // ���ٶ���ָ��
	delete p;
    p=NULL;
	return 0;
}
