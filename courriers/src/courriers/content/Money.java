package courriers.content;

/**
 * Money content
 * @author Loic
 *
 */
public class Money implements Content{

	/**
	 * amount of the letter
	 */
	private double amount;
	
	/**
	 * Empty constructor, initialize with a 0 amount 
	 */
	public Money(){
		this(0);
	}
	
	@Override
	public String description() {
		return "Money " + amount + "€.";
	}
	
	/**
	 * @param amount
	 */
	public Money(int amount){
		this.amount=amount;
	}

	
	/**
	 * @return the amount
	 */
	public double getAmount(){		
		return amount;
	}

}
