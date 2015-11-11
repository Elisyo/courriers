package tests.letter;

import static org.junit.Assert.*;

import org.junit.Test;

import tests.entities.MockHabitant;
import courriers.entities.City;
import courriers.letter.Letter;

public abstract class LetterTest {

	MockHabitant receiver = new MockHabitant(new City("c1"));
	MockHabitant sender = new MockHabitant(new City("c2"));
	
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