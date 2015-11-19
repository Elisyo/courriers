package tests.entities;

import courriers.entities.City;
import courriers.entities.Inhabitant;
import courriers.exceptions.NotEnoughMoneyException;
import courriers.letter.Letter;

public class MockInhabitant extends Inhabitant{

	private int numberOfLetterSent = 0;
	private int numberOfLetterReceived = 0;


	public MockInhabitant(City city) {
		super("Mock habitant", city);
	}

	public MockInhabitant(City city, int amountBankAccount) {
		super("Mock habitant", city, amountBankAccount);
	}

	@Override
	public void sendLetter(Letter<?> letter) throws NotEnoughMoneyException{
		super.sendLetter(letter);
		this.numberOfLetterSent++;
	}
	
	@Override
	public void receiveLetter(Letter<?> letter){
		super.receiveLetter(letter);
		this.numberOfLetterReceived ++;
	}
	
	public int getNumberOfLetterSent() {
		return numberOfLetterSent;
	}

	public int getNumberOfLetterReceived() {
		return numberOfLetterReceived;
	}
}
