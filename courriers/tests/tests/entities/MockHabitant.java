package tests.entities;

import courriers.entities.City;
import courriers.entities.Habitant;

public class MockHabitant extends Habitant{

	public MockHabitant(City city) {
		super("Mock habitant", city);
	}

}
