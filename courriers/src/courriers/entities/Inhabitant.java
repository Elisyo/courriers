package courriers.entities;

import courriers.exceptions.NotEnoughMoneyException;
import courriers.letter.Letter;
import courriers.utils.Constants;

/**
 * Class that represents an usual Habitant
 * @author breuzon
 *
 */
public class Inhabitant {
	
	/**
	 * Names of the Habitant, and his address
	 */
	private String name;
	
	
	/**
	 * The City where the Habitant lives 
	 */
	private City city; 
	
	
	/**
	 * The amount of his bank account
	 */
	private double bankAccount;
	
	/**
	 * Create an habitant with a amount bank account 100
	 * 
	 * @param name
	 * @param city
	 */
	public Inhabitant(String name, City city){
		this(name,city,Constants.initialBankAccount);
	}
	
	/**
	 * Create an habitant with all parameters specified
	 * 
	 * @param name
	 * @param city
	 * @param amountBankAccount
	 */
	public Inhabitant(String name, City city, double amountBankAccount){
		this.name=name;
		this.city = city;
		this.bankAccount = amountBankAccount;
	}
	
	/**
	 * add the amount in param to the bank account of the habitant
	 * @param amount
	 */
	public void credit(double amount){
		this.bankAccount+=amount;
	}
	
	/**
	 * soustract the amount in param to the bank account of the habitant
	 * @param amount
	 */
	public void debit(double amount){
		this.bankAccount-=amount;
	}
	
	/**
	 * Send a letter to the city's post box
	 * @param letter
	 * @throws NotEnoughMoneyException 
	 */
	public void sendLetter(Letter<?> letter) throws NotEnoughMoneyException{
		if(this.bankAccount - letter.getCost() >= 0){
			this.debit(letter.getCost());
			this.city.sendLetter(letter);
		}
		else
			throw new NotEnoughMoneyException("You don't have enough money");
	}
	
	
	/**
	 * Receive a letter from another habitant 
	 * @param letter
	 * @throws NotEnoughMoneyException 
	 */
	public void receiveLetter(Letter<?> letter) throws NotEnoughMoneyException{
		letter.doAction();
	}
	

	
	/*
	 * =============================== Getters & setters ================================
	 */
	

	/**
	 * @return the amount of the bank account oh the habitant
	 */
	public double getBankAccount() {
		return bankAccount;
	}

	/**
	 * @param bankAccount
	 */
	public void setBankAccount(double bankAccount) {
		this.bankAccount = bankAccount;
	}

	/**
	 * @return habitant's name
	 */
	public String getName() {
		return name;
	}

	/** 
	 * @return habitant's city
	 */
	public City getCity() {
		return city;
	}
	
	
}
