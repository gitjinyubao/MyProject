package factoryMethodDemo;

/*
 * ȱ�㣺ÿ�������µ��࣬��Ҫ�ڹ������иı䣬����һ��if�ж�
 */
public class Demo {
	public static void main(String[] args) {
		AnimalFactory.createAnimal("dog").eat();;
	}
}
