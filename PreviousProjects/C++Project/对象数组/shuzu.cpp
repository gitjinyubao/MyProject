#include <iostream>
using namespace std;
class Coordinate
{
    
public:
	Coordinate()
	{
	}
	// 打印坐标的函数
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
	//定义对象数组
    

    Coordinate coorArr[2];//栈中实例化数组 
    coorArr[0].m_iX=1;
    coorArr[0].m_iY=2;
    coorArr[1].m_iX=3;
    coorArr[1].m_iY=4;
    

	//遍历数组，打印对象信息
	for(int i = 0; i < 2; i++)
	{
        
		coorArr[i].printInfo();
	}	
    /*Coordinate *p=new Coordinate[2] ;//堆中实例化对象数组 
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
