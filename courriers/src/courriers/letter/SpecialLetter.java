package courriers.letter;

import courriers.content.Content;
import courriers.exceptions.NotEnoughMoneyException;

/**
 * A decorator for letter which are specials
 * @author loic
 *
 * @param <L>
 */
public abstract class SpecialLetter<L extends Letter<?>> extends Letter<Content>{
	
	protected Letter<?> letterType;
	
	/**
	 * @param letter
	 */
	public SpecialLetter(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver(),letter.getContent());
		this.letterType=letter;
	}

	@Override
	public void doAction() throws NotEnoughMoneyException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Content getContent() {
		// TODO Auto-generated method stub
		return super.content;
	}

	public abstract int getCost();
	
	public abstract String description();

}
