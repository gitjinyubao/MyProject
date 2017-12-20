package simpleFactory;

public class GreenDrinkFactory implements DrinkFactory {

	@Override
	public Drink createDrink(int price, String name) {
		return new GreenTea(price, name);
	}

}
