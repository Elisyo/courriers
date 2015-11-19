package tests.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tests.letter.MockLetter;
import courriers.entities.City;
import courriers.exceptions.NotEnoughMoneyException;

public class InhabitantTest {
	
	private City city;
	private MockLetter letter;
	private MockInhabitant sender;
	private MockInhabitant receiver;
	
	@Before
	public void inititialize(){
		city=new City("City test");
		sender = new MockInhabitant(city, 1000);
		receiver = new MockInhabitant(city, 1000);
		letter = new MockLetter(sender, receiver);
	}

	@Test
	public void creditTest(){
		sender.setBankAccount(20);
		assertTrue(sender.getBankAccount()==20);
		sender.credit(50);
		assertTrue(sender.getBankAccount()==70);
		return;
	}
	
	@Test
	public void debitTest(){
		sender.setBankAccount(20);
		
		sender.debit(15);
		assertTrue(sender.getBankAccount()==5);
		
		sender.debit(10);
		assertTrue(sender.getBankAccount()==-5);
		return;
	}
	
	@Test
	public void sendLetterTest() throws NotEnoughMoneyException{
		assertEquals(sender.getNumberOfLetterSent(),0);		
		assertEquals(sender.getBankAccount(), 1000, 0.0001);
		
		sender.sendLetter(letter);
		 
		assertEquals(sender.getNumberOfLetterSent(),1);
		assertEquals(sender.getBankAccount(), 999, 0.0001);
	}
	
	@Test
	public void receiveLetterTest() throws NotEnoughMoneyException{
		assertEquals(receiver.getNumberOfLetterReceived(),0);	
		sender.sendLetter(letter);
		city.distributeLetters();
		assertEquals(receiver.getNumberOfLetterReceived(),1);
		
	}
	
	@Test(expected = NotEnoughMoneyException.class)
	public void cannotSendLetterTest() throws NotEnoughMoneyException{
		sender.setBankAccount(0);
		sender.sendLetter(letter);
	}
	
}
