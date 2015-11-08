package courriers.entities;

/**
 * Class that represents an usual Habitant
 * @author breuzon
 *
 */
public class Habitant {
	
	/**
	 * Names of the Habitant, and his address
	 */
	private String lastName, firstName, address;
	
	
	/**
	 * The City where the Habitant lives 
	 */
	private City city; //peut etre que c'est pas utile ici
	
	
	/**
	 * The amount of his bank account
	 */
	private double bankAccount;
	
	/**
	 * Create an habitant with a amount bank account equals at 0
	 * 
	 * @param lastName
	 * @param firstName
	 * @param address
	 * @param city
	 */
	public Habitant(String lastName, String firstName, String address, City city){
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.city = city;
	}
	
	/**
	 * Create an habitant with all parameters specified
	 * 
	 * @param lastName
	 * @param firstName
	 * @param address
	 * @param city
	 * @param amountBankAccount
	 */
	public Habitant(String lastName, String firstName, String address, City city, double amountBankAccount){
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.city = city;
		this.bankAccount = amountBankAccount;
	}
}
