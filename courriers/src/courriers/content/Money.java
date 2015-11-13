package courriers.content;

import courriers.utils.RandomGenerator;

/**
 * Money content
 * @author Loic
 *
 */
public class Money implements Content{

	/**
	 * amount of the letter
	 */
	private int amount;
	
	/**
	 * @param amount
	 */
	public Money(int amount){
		this.amount=amount;
	}
	
	/**
	 * initialize with a random amount (1~1000)
	 */
	public Money(){
		this.amount=RandomGenerator.generateRandomNumber(1, 1000);
	}
	
	@Override
	public String description() {
		return "money content ("+this.amount+")";
	}

}
