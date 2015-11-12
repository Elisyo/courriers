package tests.entities;

import courriers.entities.City;
import courriers.entities.Inhabitant;

public class MockHabitant extends Inhabitant{

	public MockHabitant(City city) {
		super("Mock habitant", city);
	}

}
