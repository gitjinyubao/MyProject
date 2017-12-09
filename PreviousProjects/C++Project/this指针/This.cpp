/*#include<iostream>
using namespace std;
class Point
{
	private:
		int x;
		public:
			Point(int x)
			{
				 this->x=x;
			}
			void setx(int x)
			{
				this->x=x;//利用this指针可以避免参数和数据成员同名不可执行的情况 
     		}
     		int getx()
     		{
     			return this->x;
			}
 } ;
 int main(void)
 {
 	Point p(5);
 	cout<<p.getx()<<endl;
 	p.setx(4);
 	cout<<p.getx()<<endl;	
 }*/ 
/*#include<iostream>
using namespace std;
class Point
{
	private:
		int x;
		public:
			Point(int x)
			{
				 this->x=x;
			}
			void setx(int x)
			{
				this->x=x;//利用this指针可以避免参数和数据成员同名不可执行的情况 
     		}
     		int getx()
     		{
     			return this->x;
			}
			Point m()
			{
				cout<<x<<endl;
				return *this;
				
		    }
 } ;
 int main(void)
 {
 	Point p(4);
	p.m();
	
	return 0;	
 }*/
/* #include<iostream>
using namespace std;
class Point
{
	private:
		int x;
		public:
			Point(int x)
			{
				 this->x=x;
			}
			Point& setx(int x)
			{
				this->x=x;//利用this指针可以避免参数和数据成员同名不可执行的情况 
     		}
     		int getx()
     		{
     			return this->x;
			}
			Point& m()
			{
				cout<<x<<endl;
				return *this;
		    }
		    //
		    Point m()
			{
				cout<<x<<endl;
				return *this;
				
		    }
		    产生一个对象//
 } ;
 int main(void)
 {
 	Point p(4);
	//p.m().setx(7);
	//cout<<p.getx()<<endl;//值并没有改变 ，因为第80行出来之后，返回的是另外的一个临时的对象，而并不是原来的p对象，如果想让返回来的仍然是拍的引用，那么返回值应该设为Point& 
	p.m().setx(5).set(7);//值改变 
	cout<<p.getx()<<endl;
	cout<<&p<<endl;
	return 0;	
 }*/
 
 
 
 #include<iostream>
using namespace std;
class Point
{
	private:
		int x;
		public:
			Point(int x)
			{
				 this->x=x;
			}
			void setx(int x)
			{
				this->x=x;//利用this指针可以避免参数和数据成员同名不可执行的情况 
     		}
     		int getx()
     		{
     			return this->x;
			}
			Point* m()
			{
				cout<<x<<endl;
				cout<<this<<endl;
				return this;//检验地址是否相同 
		    }
		    
 } ;
 int main(void)
 {
 	Point p(4);
 	p.m();//两个相同的地址 
	//p.m().setx(7);
	//cout<<p.getx()<<endl;//值并没有改变 ，因为第80行出来之后，返回的是另外的一个临时的对象，而并不是原来的p对象，如果想让返回来的仍然是拍的引用，那么返回值应该设为Point& 

	cout<<&p<<endl;
	return 0;	
 }
