#include <iostream>
using namespace std;
class Coordinate
{
    
public:
	Coordinate()
	{
	}
	// ��ӡ����ĺ���
	void printInfo()  
	{
	    cout<<"("<<m_iX<<","<<m_iY<<")"<<endl;
	}
	~Coordinate()
	{
	}
public:
	int m_iX;
	int m_iY;
};
int main(void)
{
	//�����������
    

    Coordinate coorArr[2];//ջ��ʵ�������� 
    coorArr[0].m_iX=1;
    coorArr[0].m_iY=2;
    coorArr[1].m_iX=3;
    coorArr[1].m_iY=4;
    

	//�������飬��ӡ������Ϣ
	for(int i = 0; i < 2; i++)
	{
        
		coorArr[i].printInfo();
	}	
    /*Coordinate *p=new Coordinate[2] ;//����ʵ������������ 
    for(int i = 0; i < 2; i++)
	{
		
			p[i].m_iX=1;//p->m_iX=1; 
            p[i].m_iX=2;
			p[i].m_iX=3;
            p[i].m_iX=4;
		for(int i = 0; i < 2; i++)
	{
		p[i].printInfo();
	}
		delete [] p;
		p=NULL;
	*/ 
	return 0;
}
