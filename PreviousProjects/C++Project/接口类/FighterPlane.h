#ifndef FIGHTERPLANE_H
#define FIGHTERPLANE_H  
#include"Flyable.h"
#include"Plane.h"
class FighterPlane:public Plane,public Flyable
{
	public:
	FighterPlane(int cod);
	void takeoff();
	void land();
};
#endif
