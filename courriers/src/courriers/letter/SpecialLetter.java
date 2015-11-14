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
	public Content getContent() {
		return super.content;
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
