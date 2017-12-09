#ifndef SHAPE_H//解决顶层重定义 
#define SHAPE_H//解决顶层重定义 
class Shape
{
	public:
		Shape();
	  virtual ~Shape();
		virtual double getArea();
	protected: 
};
#endif
