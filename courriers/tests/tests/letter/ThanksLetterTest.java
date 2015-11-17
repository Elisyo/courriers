package tests.letter;

import courriers.content.Content;
import courriers.letter.Letter;
import courriers.letter.ThanksLetter;

//There's nothing that we can really test in this class
public class ThanksLetterTest extends LetterTest<Content>{

	@Override
	protected Letter<?> createLetter() {
		// TODO Auto-generated method stub
		return new ThanksLetter(receiver,sender);
	}
	

	
}
