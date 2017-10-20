package factoryMethodDemo;

public class AnimalFactory {
	
	public static Animal createAnimal(String animalName) {
		if ("dog".equals(animalName)) {
			return new Dog();
		} else if ("cat".equals(animalName)) {
			return new Cat();
		}
	    
	    return null;
	}
}
