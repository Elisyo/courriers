package courriers.letter;

import courriers.content.Text;
import courriers.entities.Inhabitant;
import courriers.utils.Constants;

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
	protected int cost = Constants.COST_OF_SIMPLE_LETTER;
	
	/**
	 * Create a SimpleLetter whith a sender and a receiver
	 * @param sender
	 * @param receiver
	 */
	public SimpleLetter(Inhabitant sender, Inhabitant receiver) {
		this(sender, receiver,new Text("bla bla"));
	}
	
	public SimpleLetter(Inhabitant sender, Inhabitant receiver,Text text) {
		super(sender, receiver,text);
	}
	

	@Override
	public void doAction() {
	}

	@Override
	public int getCost() {
		return this.cost;
	}

	@Override
	public String description() {
		return "a simple letter whose content is "+this.content.description();
	}
}
