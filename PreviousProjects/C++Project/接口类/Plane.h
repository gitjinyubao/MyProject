#ifndef PLANE_H
#define PLANE_H
#include"Flyable.h"
using namespace std;
class Plane//:public Flyable
{
	public:
		Plane(int cod);
		//virtual void takeoff();
		//virtual void land();
		void printCode();
	private:
		int m_icod;
} ;
#endif
