#include"You.h"
#include"Coordinate.h"//切记：友元成员数需要这个头文件，否则：1.[Error] forward declaration of 'class Coordinate'       2.[Error] invalid use of incomplete type 'class Coordinate'
void You::fu(Coordinate &C)
{
	C.operator -();
	C.display();
	C.operator ++();
	C.display();
}
