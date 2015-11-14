package tests.letter;

import static org.junit.Assert.*;

import org.junit.Test;

import courriers.content.Content;
import courriers.content.Money;
import courriers.letter.Letter;
import courriers.letter.PromissoryNote;
import courriers.utils.Constants;

public class PromissoryNoteTest extends LetterTest<Content>{

	@Override
	protected Letter<?> createLetter() {
		// TODO Auto-generated method stub
		return new PromissoryNote(sender, receiver, 5);
	}
	
	@Test
	public void moneyContentInLetter(){
		@SuppressWarnings("unused")
		Money money = new PromissoryNote(sender, receiver).getContent();
	}
	
	@Test
	public void amountPositiveTest(){
		assertTrue(new PromissoryNote(sender, receiver).getAmount() > 0);
	}
	
	@Test
	public void maxAmountTest(){
		assertTrue(new PromissoryNote(sender, receiver).getAmount() < Constants.MAX_PROMISSORY_NOTE_AMOUNT);
	}

	
	
}
