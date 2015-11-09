package courriers.letter;

import courriers.entities.Habitant;

/**
 * 
 * SimpleLetter is a Letter with a Text Content
 * @author breuzon
 *
 */
public class SimpleLetter extends Letter<Text>{

	/**
	 * cost of the letter
	 */
	protected double cost = 1;
	
	/**
	 * Create a SimpleLetter whith a sender and a receiver
	 * @param sender
	 * @param receiver
	 */
	public SimpleLetter(Habitant sender, Habitant receiver) {
		super(sender, receiver);
	}

	@Override
	public void doAction() {
		
	}

	@Override
	public double getCost() {
		return this.cost;
	}



}
