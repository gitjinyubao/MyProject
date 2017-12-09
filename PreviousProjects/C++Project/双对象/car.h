#include<iostream>
using namespace std;
class car
{
	private:
		int x;
	public:
			 int getcar()
			{
				return x;
			}
};
int main(void)
{
	Car r;
	r.x=2;
	cout<<r.getcar()<<endl;
}
