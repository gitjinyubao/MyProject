#include"You.h"
#include"Coordinate.h"//�мǣ���Ԫ��Ա����Ҫ���ͷ�ļ�������1.[Error] forward declaration of 'class Coordinate'       2.[Error] invalid use of incomplete type 'class Coordinate'
void You::fu(Coordinate &C)
{
	C.operator -();
	C.display();
	C.operator ++();
	C.display();
}
