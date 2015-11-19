package tests.letter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import courriers.content.Text;
import courriers.letter.Letter;
import courriers.letter.SimpleLetter;


public class SimpleLetterTest extends LetterTest {

	public Letter<Text> createLetter(){
		return new SimpleLetter(receiver,sender);
	}
	
	@Test
	public void contentInSimpleLetter(){

		@SuppressWarnings("unused")
		Text text = new SimpleLetter(sender, receiver).getContent();
	}
	
	@Override
	public void getDescriptionTest(){
		Letter<?> simpleLetter=createLetter();
		assertEquals(simpleLetter.description(),"a simple letter whose content is "+new Text().description());
				
	}

}
