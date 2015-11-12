package courriers.letter;

import courriers.content.Text;
import courriers.entities.Inhabitant;

/**
 * 
 * SimpleLetter is a letter with a text content and a fixed cost
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
	public SimpleLetter(Inhabitant sender, Inhabitant receiver) {
		super(sender, receiver);
	}

	@Override
	public void doAction() {
		System.out.println(getContent().description());
	}

	@Override
	public double getCost() {
		return this.cost;
	}



}
