package org.interfaces.implement;

public class HelloWord {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void  init()
	{
		this.setMessage("jinyubao");
	}
	public  void  close()
	{
		System.out.println("chengfang");
		System.out.println("Bean销毁之前调用此方法");
	}

}
