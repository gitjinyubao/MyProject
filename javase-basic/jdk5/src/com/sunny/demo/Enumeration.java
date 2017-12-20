package com.sunny.demo;

/*
 * ö��Ҳ�ǿ����й��췽�����ֶη���
 */
public class Enumeration {
	public static void main(String[] args) {
		System.out.println(Grade.A);
		System.out.println(Grade.A.getValue());
		// ö�ٵĳ��÷���
		System.out.println(Grade.A.name()); // ���ش�ö�ٳ��������ƣ�����ö�������ж������������
		System.out.println(Grade.A.ordinal()); // ����ö�ٳ���������������ö�������е�λ�ã����г�ʼ��������Ϊ�㣩��
		// ����ö�ٳ��������ƣ���������������
		System.out.println(Grade.A.toString());
		// ���ش�ָ�����Ƶ�ָ��ö�����͵�ö�ٳ��� valueOf(Class<T> enumType, String name) 
		Grade g =  Grade.valueOf(Grade.class, "A"); // == Grade g =  Grade.valueOf("A"); //�ַ���ֻ�ܶ�����ö�����е�
		System.out.println(g); // ����Ӧ�� :�ͻ����ύһ���ַ������Ա𣬼���ǲ���ö���е�ֵ��������ǽ����쳣
		
		System.out.println("=================");
		System.out.println(Grades.A.getValue());
		System.out.println(Grades.B.getValue());
		
		// ����ö����������
		Grade[] grades = Grade.values();
		for(Grade e : grades) {
			System.out.println(e);
		}
	}
}

enum Grade { // class
	A("100"), B("90"), C("80"), D("80"); // object

	private String value; // ��װÿ�������Ӧ�ķ���

	private Grade(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}

// ���г��󷽷���ö��
enum Grades{
	A("100")
	{
		public String getLocalValue(){
			return "����";
		}
	},
	
	B("90"){
		public String getLocalValue(){
			return "����";
		}
	},
	
	C("80"){
		public String getLocalValue(){
			return "����";
		}
	},

	D("70"){
		public String getLocalValue(){
			return "������";
		}
	};
	
	private String value;
	
	private Grades(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	// ������󷽷�
	public abstract String getLocalValue();
}

/*
 * ע�����
 * 1.ö�ٵĹ��췽��������˽�е�
 * 2.ö���ǿ���ӵ�г��󷽷���
 * 3.ö���ǿ��Լ̳л���ʵ��������ǽӿڵ�
 * 4.��ö��ֻ��һ��ö��ֵ������Ե�����̬���ģʽʹ��
 */

// �õ�̬���ģʽ�����һ����==��ĵ���ģʽ
enum A {
	A;
}