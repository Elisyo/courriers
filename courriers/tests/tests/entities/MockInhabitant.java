package tests.entities;

import courriers.entities.City;
import courriers.entities.Inhabitant;

public class MockInhabitant extends Inhabitant{

	public MockInhabitant(City city) {
		super("Mock habitant", city);
	}

	public MockInhabitant(City city, double amountBankAccount) {
		super("Mock habitant", city, amountBankAccount);
	}
}
