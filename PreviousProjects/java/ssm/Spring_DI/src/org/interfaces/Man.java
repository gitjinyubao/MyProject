package org.interfaces;

public class Man implements Person {
private Food food;
//����Food�ӿ�˽�����ԣ�����Food�ӿڱ��
//����Set�����������ע����Ҫset����;��������ע�������setter��������ͽ�����Ϊʲô������setter����
public void setFood(Food food) {
	this.food = food;
}
	@Override
	public void eatFood() {
		// TODO Auto-generated method stub
        System.out.println(food.eat());		
	}
}
