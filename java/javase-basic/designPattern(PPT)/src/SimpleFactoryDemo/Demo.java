package SimpleFactoryDemo;

/*
 * �ŵ㣺�ͻ��˲���Ҫ�ٸ������Ĵ������Ӷ���ȷ�˸������ְ��������µ������ӣ�
 *     ֻ��Ҫ����һ���������;���Ĺ����༴�ɡ���Ӱ�����еĴ��룬����ά�����ף���ǿ��ϵͳ����չ�ԡ�
 * ȱ�㣺��Ҫ����ı�д���룬�����˱�д�Ĵ�������
 */
public class Demo {
	
	public static void main(String[] args) {
		// ���һֻ��
		DogFactory df = new DogFactory();
		df.createAnimal().eat();;
		
		CatFactory cf = new CatFactory();
		cf.createAnimal().eat();
	}
}
