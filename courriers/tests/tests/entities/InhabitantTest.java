package tests.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import tests.letter.MockLetter;
import courriers.entities.City;
import courriers.exceptions.NotEnoughMoneyException;

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
	
	@Test
	public void sendLetterTest() throws NotEnoughMoneyException{
		MockInhabitant mock1 = new MockInhabitant(new City("city1"), 1000);
		MockInhabitant mock2 = new MockInhabitant(new City("city2"), 1000);
		MockLetter letter = new MockLetter(mock1, mock2);
		
		assertEquals(mock1.getBankAccount(), 1000, 0.0001);
		
		mock1.sendLetter(letter);
		
		assertEquals(mock1.getBankAccount(), 999, 0.0001);
	}
	
	@Test(expected = NotEnoughMoneyException.class)
	public void cannotSendLetterTest() throws NotEnoughMoneyException{
		MockInhabitant mock1 = new MockInhabitant(new City("city1"), 0);
		MockInhabitant mock2 = new MockInhabitant(new City("city2"), 0);
		MockLetter letter = new MockLetter(mock1, mock2);
		
		mock1.sendLetter(letter);
	}
	
}
