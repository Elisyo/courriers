package tests.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import tests.letter.MockLetter;
import courriers.entities.City;

public class CityTest {

	City city1 = new City("city1");
	City city2 = new City("city2");
	
	MockInhabitant mock1;
	MockInhabitant mock2;
	
	private void addSomeEntities(){
		mock1 = new MockInhabitant(city1);
		mock2 = new MockInhabitant(city2);
		city1.sendLetter(new MockLetter(mock1, mock2));
		city2.sendLetter(new MockLetter(mock2, mock1));
	}
	
	@Test
	public void sendLetter(){
		assertTrue(city1.getPostBox().isEmpty());
		city1.sendLetter(new MockLetter(mock1, mock2));
		assertFalse(city1.getPostBox().isEmpty());
	}
	
	@Test
	public void distributeLettersTest(){
		addSomeEntities();
		assertFalse(city1.getPostBox().isEmpty());
		city1.distributeLetters();
		assertTrue(city1.getPostBox().isEmpty());
	}
}
