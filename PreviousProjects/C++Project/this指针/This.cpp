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
				this->x=x;//����thisָ����Ա�����������ݳ�Աͬ������ִ�е���� 
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
				this->x=x;//����thisָ����Ա�����������ݳ�Աͬ������ִ�е���� 
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
				this->x=x;//����thisָ����Ա�����������ݳ�Աͬ������ִ�е���� 
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
		    ����һ������//
 } ;
 int main(void)
 {
 	Point p(4);
	//p.m().setx(7);
	//cout<<p.getx()<<endl;//ֵ��û�иı� ����Ϊ��80�г���֮�󣬷��ص��������һ����ʱ�Ķ��󣬶�������ԭ����p����������÷���������Ȼ���ĵ����ã���ô����ֵӦ����ΪPoint& 
	p.m().setx(5).set(7);//ֵ�ı� 
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
				this->x=x;//����thisָ����Ա�����������ݳ�Աͬ������ִ�е���� 
     		}
     		int getx()
     		{
     			return this->x;
			}
			Point* m()
			{
				cout<<x<<endl;
				cout<<this<<endl;
				return this;//�����ַ�Ƿ���ͬ 
		    }
		    
 } ;
 int main(void)
 {
 	Point p(4);
 	p.m();//������ͬ�ĵ�ַ 
	//p.m().setx(7);
	//cout<<p.getx()<<endl;//ֵ��û�иı� ����Ϊ��80�г���֮�󣬷��ص��������һ����ʱ�Ķ��󣬶�������ԭ����p����������÷���������Ȼ���ĵ����ã���ô����ֵӦ����ΪPoint& 

	cout<<&p<<endl;
	return 0;	
 }
