package courriers.entities;

import courriers.letter.Letter;

/**
 * Class that represents an usual Habitant
 * @author breuzon
 *
 */
public class Habitant {
	
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
	 * Create an habitant with a amount bank account equals at 0
	 * 
	 * @param name
	 * @param city
	 */
	public Habitant(String name, City city){
		this(name,city,0);
	}
	
	/**
	 * Create an habitant with all parameters specified
	 * 
	 * @param name
	 * @param city
	 * @param amountBankAccount
	 */
	public Habitant(String name, City city, double amountBankAccount){
		this.name=name;
		this.city = city;
		this.bankAccount = amountBankAccount;
	}
	
	/**
	 * add the amount in param to the bank account of the habitant
	 * @param amount
	 */
	public void credit(int amount){
		this.bankAccount+=amount;
	}
	
	/**
	 * soustract the amount in param to the bank account of the habitant
	 * @param amount
	 */
	public void debit(int amount){
		this.bankAccount-=amount;
	}
	
	/**
	 * Send a letter to the city's post box
	 * @param letter
	 */
	public void sendLetter(Letter<?> letter){
		
	}
	
	
	/**
	 * Receive a letter from another habitant 
	 * @param letter
	 */
	public void receiveLetter(Letter<?> letter){
		
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
