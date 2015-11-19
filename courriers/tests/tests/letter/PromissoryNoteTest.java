package tests.letter;

import static org.junit.Assert.*;
import org.junit.Test;
import courriers.content.Money;
import courriers.exceptions.NotEnoughMoneyException;
import courriers.letter.Letter;
import courriers.letter.PromissoryNote;
import courriers.utils.Constants;

public class PromissoryNoteTest extends LetterTest{

	@Override
	protected Letter<Money> createLetter() {
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
	
	@Test
	public void doActionTest() throws NotEnoughMoneyException{
		sender.setBankAccount(2000);
		receiver.setBankAccount(2000);
		PromissoryNote letter = new PromissoryNote(sender, receiver,1000);
		
		assertEquals(2000, sender.getBankAccount(), 0.01);
		assertEquals(2000, receiver.getBankAccount(), 0.01);
		System.out.println("*******************");
		letter.doAction();
		
		assertEquals(1000, sender.getBankAccount(), 0.1);
		assertEquals(3000, receiver.getBankAccount(),1);
		
	}
	
	@Test (expected = NotEnoughMoneyException.class)
	public void doActionExceptiontest() throws NotEnoughMoneyException{
		sender.setBankAccount(20);
		receiver.setBankAccount(20);
		PromissoryNote letter = new PromissoryNote(sender, receiver,1000);
		letter.doAction();
	}

	@Override
	public void getDescriptionTest() {
		Letter<?> promissoryNote=createLetter();
		assertEquals(promissoryNote.description(),"a promissory note letter whose content is "+new Money(5).description());
	}

	
	
}
