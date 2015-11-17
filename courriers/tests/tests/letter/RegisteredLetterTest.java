package tests.letter;


import org.junit.Test;

import courriers.entities.Inhabitant;
import courriers.exceptions.NotEnoughMoneyException;
import courriers.letter.AknowledgmentOfReceipt;
import courriers.letter.Letter;
import courriers.letter.RegisteredLetter;
import static org.junit.Assert.*;

public class RegisteredLetterTest<L extends Letter<?>> extends
		DecoratingLetterTest<L> {

	@Override
	protected RegisteredLetter<MockLetter> createLetter(Inhabitant sender,
			Inhabitant receiver) {
		// TODO Auto-generated method stub
		return new RegisteredLetter<MockLetter>(mockletter);
	}

	@Test
	public void doActionTest() throws NotEnoughMoneyException {
		RegisteredLetter<Letter<?>> letter = new RegisteredLetter<Letter<?>>(mockletter);

		letter.doAction();
		
		Letter<?> l = receiver.getCity().getPostBox().get(0);
		assertTrue(l instanceof AknowledgmentOfReceipt);
		//we verify that he received an AknowledgmentOfReceipt
		//may be not very good...

		

	}

}
