#include"Plane.h"
#include<iostream>
using namespace std;
		Plane::Plane(int cod)
		{
			m_icod=cod;
			cout<<"Plane()"<<endl;
		}
	   /*void Plane:: takeoff()
		{
			cout<<"takeoff()"<<endl; 
		}
		void Plane:: land()
		{
			cout<<"land()"<<endl;
		}*/
		void Plane:: printCode()
		{
			cout<<m_icod<<endl;
		}
