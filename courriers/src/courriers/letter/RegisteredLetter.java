package courriers.letter;

import courriers.content.Content;

/**
 * Registred Letter
 * @author breuzon
 *
 */
public class RegisteredLetter<L extends Letter<?>> extends SpecialLetter{

	protected double cost = 2.5;
	Letter<Content> letter;
	public RegisteredLetter(Letter<Content> letter) {
		super(letter.getSender(), letter.getReceiver());
		this.letter=letter;
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
