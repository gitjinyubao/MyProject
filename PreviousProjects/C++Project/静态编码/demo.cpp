#include"Tank.h"
#include<iostream>
using namespace std;
int main(void)
{
	cout<<Tank::getCount()<<endl;//���ֵ��ú����ķ��� 
	Tank t(1);
	cout<<t.getCount()<<endl;//���ֵ��ú����ķ�����count��˽�е����ݳ�Ա��ֻ��ͨ������������з��� 
	cout<<Tank::getCount()<<endl;
}
