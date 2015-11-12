package courriers.letter;

import courriers.content.Content;
import courriers.entities.Inhabitant;

/**
 * Registred Letter
 * @author breuzon
 *
 */
public class RegisteredLetter extends Letter<Content>{

	protected double cost = 2.5;
	
	public RegisteredLetter(Inhabitant sender, Inhabitant receiver) {
		super(sender, receiver);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

	@Override
	public Content getContent() {
		// TODO Auto-generated method stub
		return super.content;
	}

}
