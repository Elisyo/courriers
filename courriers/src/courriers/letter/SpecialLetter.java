package courriers.letter;

import courriers.content.Content;
import courriers.exceptions.NotEnoughMoneyException;

/**
 * A decorator for letter which are specials
 * @author loic
 *
 * @param <L>
 */
public class SpecialLetter<L extends Letter<?>> extends Letter<Content>{

	protected double cost = 2;
	protected Letter<?> letterType;
	
	/**
	 * @param letter
	 */
	public SpecialLetter(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver());
	}

	@Override
	public void doAction() throws NotEnoughMoneyException {
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
