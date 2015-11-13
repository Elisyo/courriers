package tests.letter;

import courriers.content.Content;
import courriers.letter.Letter;
import courriers.letter.RegisteredLetter;

public class RegistredLetterTest extends LetterTest{

	protected Letter<Content> letter;
	
	@Override
	protected Letter<?> createLetter() {
		// TODO Auto-generated method stub
		return new RegisteredLetter<Letter<?>>(letter);
	}

}
