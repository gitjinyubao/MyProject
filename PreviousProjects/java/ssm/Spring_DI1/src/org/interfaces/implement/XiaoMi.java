package org.interfaces.implement;

import org.interfaces.MobilePhone;
import org.interfaces.Source;

public class XiaoMi implements MobilePhone {
private  Source   source;
//采用构造方法的方式实现依赖注入
	public XiaoMi(Source source) {
	super();
	this.source = source;
}

	@Override
	public void getKindSource() {
		// TODO Auto-generated method stub
		System.out.println(source.getSource());

	}

}
