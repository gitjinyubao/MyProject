package SimpleFactoryDemo;

public class CatFactory implements Factory{
	
	public String a;
	
	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}
