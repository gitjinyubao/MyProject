package simpleFactory;

public class RedTea extends Drink {

	public RedTea(int price, String name) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPrice() {
		return this.price;
	}
}
