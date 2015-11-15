package courriers.letter;

import courriers.exceptions.NotEnoughMoneyException;
/**
 * A decorator for letter which are specials
 * @author loic
 *
 * @param <L>
 */
public abstract class SpecialLetter<L extends Letter<?>> extends Letter<L>{
	
	protected L letterType;
	
	/**
	 * @param letter
	 */
	public SpecialLetter(L letter) {
		super(letter.getSender(), letter.getReceiver(),letter);
		this.letterType=letter;
	}


	/* (non-Javadoc)
	 * @see courriers.letter.Letter#getCost()
	 */
	public abstract int getCost();
	
	/* (non-Javadoc)
	 * @see courriers.content.Content#description()
	 */
	public abstract String description();
	
	/* (non-Javadoc)
	 * @see courriers.letter.Letter#doAction()
	 */
	public abstract void doAction() throws NotEnoughMoneyException;

}
