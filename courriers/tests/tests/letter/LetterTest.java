package tests.letter;

import static org.junit.Assert.*;

import org.junit.Test;
import tests.entities.MockInhabitant;
import courriers.entities.City;
import courriers.letter.Letter;

public abstract class LetterTest{
	
	protected City city= new City("c1");

	protected MockInhabitant receiver = new MockInhabitant(city);
	protected MockInhabitant sender = new MockInhabitant(city);
	
	protected abstract Letter<?> createLetter();
	
	@Test
	public abstract void getDescriptionTest();
	/**
	 * Test if the cost of the letter is positive
	 */
	@Test
	public void costInLetterTest(){
		Letter<?> letter = createLetter();
		assertTrue(letter.getCost()>0);
	}
	
}