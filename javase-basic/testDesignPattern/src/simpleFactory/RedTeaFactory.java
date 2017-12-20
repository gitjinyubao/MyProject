package simpleFactory;

public class RedTeaFactory implements DrinkFactory {

	@Override
	public Drink createDrink(int price, String name) {
		return new RedTea(price, name);
	}

}
