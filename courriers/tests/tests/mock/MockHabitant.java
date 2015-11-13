package tests.mock;

import courriers.entities.City;
import courriers.entities.Inhabitant;

public class MockHabitant extends Inhabitant{

	public MockHabitant(String name,City city) {
		super(name, city);
	}
	
	public MockHabitant(String name,City city, int bankAccount) {
		super(name, city, bankAccount);

	}


}
