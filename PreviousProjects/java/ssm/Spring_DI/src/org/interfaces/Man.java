package org.interfaces;

public class Man implements Person {
private Food food;
//定义Food接口私有属性，面向Food接口编程
//设置Set方法，后面的注入需要set方法;设置依赖注入所需的setter方法，这就解释了为什么必须有setter方法
public void setFood(Food food) {
	this.food = food;
}
	@Override
	public void eatFood() {
		// TODO Auto-generated method stub
        System.out.println(food.eat());		
	}
}
