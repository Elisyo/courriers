package tests.letter;

import courriers.content.Content;
import courriers.letter.Letter;
import courriers.letter.UrgentLetter;

public class UrgentLetterTest extends LetterTest<Content>{

	@Override
	protected Letter<?> createLetter() {
		// TODO Auto-generated method stub
		MockLetter letter = new MockLetter(sender, receiver);
		return new UrgentLetter<Letter<?>>(letter);
	}

}
