package tests.letter;

import org.junit.Test;

import courriers.letter.Letter;
import courriers.letter.SpecialLetter;

public abstract class DecoratingLetterTest extends LetterTest{
	
	protected MockLetter mockLetter = new MockLetter(sender, receiver);
	
	public abstract SpecialLetter<Letter<?>> createLetter();
	
	@Test
	public abstract void getDescriptionTest();

}
