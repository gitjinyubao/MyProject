package data;

public class Man {
	private Food food;
	public void setFood(Food food) {
		this.food = food;
	}
	public void eatFood()
	{
		if(food.getFood()==null)
		{
			System.out.println("ЮЊПе");
		}
		else
		{
			System.out.println(food.getFood());	
		}
		
	}

}
