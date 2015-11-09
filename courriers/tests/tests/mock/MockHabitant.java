package tests.mock;

import courriers.entities.City;
import courriers.entities.Habitant;

public class MockHabitant extends Habitant{

	public MockHabitant(String lastName, String firstName, String address,
			City city) {
		super(lastName, firstName, address, city);
		// TODO Auto-generated constructor stub
	}
	
	public MockHabitant(String lastName, String firstName, String address,
			City city, double bankAccount) {
		super(lastName, firstName, address, city, bankAccount);
		// TODO Auto-generated constructor stub
	}
	
	public MockHabitant(City city){
		super("mockLastName","mockFirstName","mockAdress", city);
	}

}
