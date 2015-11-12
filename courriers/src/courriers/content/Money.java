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
	private double amount=RandomGenerator.generateRandomNumber(1, 1000);
	
	@Override
	public String description() {
		return "Money " + amount + "€.";
	}

}
