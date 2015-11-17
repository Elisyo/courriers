package tests.letter;

import courriers.content.Content;
import courriers.letter.AknowledgmentOfReceipt;
import courriers.letter.Letter;

//There's nothing that we can really test in this class
public class AknowledgmentOfReceiptTest extends LetterTest<Content>{

	@Override
	protected Letter<?> createLetter() {
		// TODO Auto-generated method stub
		return new AknowledgmentOfReceipt(sender, receiver);
	}

}
