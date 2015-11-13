package tests.letter;

import static org.junit.Assert.*;

import org.junit.Test;

import tests.entities.MockInhabitant;
import courriers.content.Content;
import courriers.entities.City;
import courriers.letter.Letter;

public abstract class LetterTest<C extends Content>{

	MockInhabitant receiver = new MockInhabitant(new City("c1"));
	MockInhabitant sender = new MockInhabitant(new City("c2"));
	
	protected abstract Letter<?> createLetter();
	
	/**
	 * Test if the cost of the letter is positive
	 */
	@Test
	public void costInLetterTest(){
		Letter<?> letter = createLetter();
		assertTrue(letter.getCost()>0);
	}
	
}