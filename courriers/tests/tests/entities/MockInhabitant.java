package tests.entities;

import courriers.entities.City;
import courriers.entities.Inhabitant;

public class MockInhabitant extends Inhabitant{

	public MockInhabitant(City city) {
		super("Mock habitant", city);
	}

}
