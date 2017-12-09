#include <iostream>
using namespace std;

/**
 * ����һ��������ģ��Rect
 * ��Ա������calcArea()��calePerimeter()
 * ���ݳ�Ա��m_length��m_height
 */
template <typename T>
class Rect
{
public:
   Rect(T length, T height);
   T calcArea();
   T calePerimeter();
public:
	T m_length;
	T m_height;
};

/**
 * �����Ը�ֵ
 */
template <typename T>
Rect<T>::Rect(T length, T height)
{
	m_length = length;
	m_height = height;
}

/**
 * �������ʵ��
 */
template <typename T>
T Rect<T>::calcArea()
{
	return m_length * m_height;
}

/**
 * �ܳ�����ʵ��
 */
template <typename T>
T Rect<T>::calePerimeter()
{
	return ( m_length + m_height) * 2;
}

int main(void)
{
	Rect<int> rect(3, 6);
	cout << rect.calcArea() << endl;
	cout << rect.calePerimeter() << endl;
	return 0;
}
