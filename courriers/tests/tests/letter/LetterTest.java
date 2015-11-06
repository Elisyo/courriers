package tests.letter;

import static org.junit.Assert.*;

import org.junit.Test;

import courriers.letter.Letter;

public abstract class LetterTest {

	abstract Letter<?> createLetter();
	
	@Test
	public void costInLetterTest(){
		Letter<?> letter = createLetter();
		assertTrue(letter.getCost()>0);
	}
	
}
