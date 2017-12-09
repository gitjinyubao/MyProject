package people;

import org.springframework.beans.factory.annotation.Autowired;


public class People {

	private People1  people1;
	
	public void setPeople1(People1 people1) {
		this.people1 = people1;
	}



	public void pring()
	{
		System.out.println(people1.hashCode());
	}
}
