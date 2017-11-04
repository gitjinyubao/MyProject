package simpleFactory;

public class GreenTea extends Drink {
	
	public GreenTea(int price, String name) {
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
