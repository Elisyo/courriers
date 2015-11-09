package tests.mock;

import courriers.entities.City;
import courriers.entities.Habitant;

public class MockHabitant extends Habitant{

	public MockHabitant(String name,City city) {
		super(name, city);
	}
	
	public MockHabitant(String name,City city, double bankAccount) {
		super(name, city, bankAccount);

	}


}
