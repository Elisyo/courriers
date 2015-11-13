package courriers.letter;

import courriers.content.Content;

/**
 * Registred Letter can contains all others letters
 * @author Loic
 *
 */
public class RegisteredLetter<L extends Letter<?>> extends SpecialLetter< Letter<?>>{

	protected double cost = 2.5;

	public RegisteredLetter(Letter<?> letter) {
		super(letter);

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
