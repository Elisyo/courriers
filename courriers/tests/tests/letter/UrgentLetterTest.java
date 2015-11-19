package tests.letter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import courriers.exceptions.NotEnoughMoneyException;
import courriers.letter.Letter;
import courriers.letter.UrgentLetter;

public class UrgentLetterTest extends DecoratingLetterTest{

	@Override
	public UrgentLetter<Letter<?>> createLetter() {
		return new UrgentLetter<Letter<?>>(this.mockLetter);
	}

	
	@Test
	public void letterTypeContentTest(){
		@SuppressWarnings("unused")
		Letter<?> l = new UrgentLetter<Letter<?>>(mockLetter).getContent();
	}
	
	@Test
	public void doActionTest() throws NotEnoughMoneyException {
		Letter<?> letter = createLetter();
		letter.doAction();
	}
	
	@Test
	public void getDescriptionTest(){
		UrgentLetter<Letter<?>> urgentLetter =createLetter();
		assertEquals(urgentLetter.description(),"an urgent letter whose content is "+this.mockLetter.description());		
	}
}
