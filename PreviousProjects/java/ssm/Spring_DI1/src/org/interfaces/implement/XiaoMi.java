package org.interfaces.implement;

import org.interfaces.MobilePhone;
import org.interfaces.Source;

public class XiaoMi implements MobilePhone {
private  Source   source;
//���ù��췽���ķ�ʽʵ������ע��
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
