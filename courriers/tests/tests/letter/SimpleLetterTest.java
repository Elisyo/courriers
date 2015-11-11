package tests.letter;

import org.junit.Test;

import courriers.content.Text;
import courriers.letter.Letter;
import courriers.letter.SimpleLetter;


public class SimpleLetterTest extends LetterTest {

	public Letter<?> createLetter(){
		return new SimpleLetter(receiver,sender);
	}
	
	@Test
	public void contentInSimpleLetter(){

		@SuppressWarnings("unused")
		Text text = new SimpleLetter(sender, receiver).getContent();
	}

}
