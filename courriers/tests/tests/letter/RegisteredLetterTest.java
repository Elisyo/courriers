package tests.letter;

import org.junit.Test;

import courriers.exceptions.NotEnoughMoneyException;
import courriers.letter.AknowledgmentOfReceipt;
import courriers.letter.Letter;
import courriers.letter.RegisteredLetter;
import static org.junit.Assert.*;

public class RegisteredLetterTest extends DecoratingLetterTest {

	@Override
	public RegisteredLetter<Letter<?>> createLetter() {
		return new RegisteredLetter<Letter<?>>(this.mockLetter);
	}
	
	@Test
	public void letterTypeContentTest(){
		@SuppressWarnings("unused")
		Letter<?> l = new RegisteredLetter<Letter<?>>(mockLetter).getContent();
	}
	
	@Test
	public void doActionTest() throws NotEnoughMoneyException {
		RegisteredLetter<Letter<?>> letter = createLetter();

		letter.doAction();
		
		Letter<?> letterReceived = this.city.getPostBox().get(0);
		
		assertEquals(letterReceived.getReceiver(),this.sender); //receiver become the sender
		assertEquals(letterReceived.getSender(),this.receiver); //sender become the receiver
		assertEquals(AknowledgmentOfReceipt.class,letterReceived.getClass()); //better than instance of HEIN CAMILLE bon ça reste pas fou
	}

	@Override
	public void getDescriptionTest() {
		RegisteredLetter<Letter<?>> urgentLetter = createLetter();
		assertEquals(urgentLetter.description(),"a registered letter whose content is "+this.mockLetter.description());		
	}

	
}
