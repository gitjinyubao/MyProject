#include<iostream>
class Car//没用cout,也就不需要“using namespace std”
{
	private:
		int x;
		int y;
	public:
			Car();
			void setx(int newy);
			void sety(int newy);
			int getx();
			int gety();
};
