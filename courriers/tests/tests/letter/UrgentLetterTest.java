package tests.letter;

import org.junit.Test;

import courriers.entities.Inhabitant;
import courriers.letter.Letter;
import courriers.letter.SpecialLetter;
import courriers.letter.UrgentLetter;

public class UrgentLetterTest extends DecoratingLetterTest<Letter<?>>{

	@Override
	protected SpecialLetter<MockLetter> createLetter(Inhabitant sender,
			Inhabitant receiver) {
		// TODO Auto-generated method stub
		return new UrgentLetter<MockLetter>(mockletter);
	}
	
	@Test
	public void letterTypeContentTest(){
		@SuppressWarnings("unused")
		Letter<?> l = new UrgentLetter<Letter<?>>(mockletter).getContent();
	}

}
