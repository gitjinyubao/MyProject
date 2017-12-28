package simpleFactory;

public interface DrinkFactory {
	
	public Drink createDrink(int price, String name);
}
