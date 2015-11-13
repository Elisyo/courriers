package tests.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import courriers.entities.City;

public class InhabitantTest {

	@Test
	public void creditTest(){
		MockInhabitant inhabitant = new MockInhabitant(new City("c"),20);
		assertTrue(inhabitant.getBankAccount()==20);
		
		inhabitant.credit(50);
		assertTrue(inhabitant.getBankAccount()==70);
		return;
	}
	
	@Test
	public void debitTest(){
		MockInhabitant inhabitant = new MockInhabitant(new City("c"),20);
		
		inhabitant.debit(15);
		assertTrue(inhabitant.getBankAccount()==5);
		
		inhabitant.debit(10);
		assertTrue(inhabitant.getBankAccount()==-5);
		return;
	}
	
}
