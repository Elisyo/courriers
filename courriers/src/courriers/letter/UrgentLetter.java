package courriers.letter;



import courriers.exceptions.NotEnoughMoneyException;

/**
 * A special letter which can contains all letters instead of itself
 * @author Loic
 *
 * @param <L>
 */
public class UrgentLetter<L extends Letter<?>> extends SpecialLetter<L>{

	/**
	 * @param letter
	 */
	public UrgentLetter(L letter) {
		super(letter);
	}

	@Override
	public void doAction() throws NotEnoughMoneyException {
		this.letterType.doAction();	
	}

	@Override
	public int getCost() {
		return this.letterType.getCost()*2;
	}

	@Override
	public String description() {
		return "an urgent letter whose content is "+this.letterType.description();
	}
	
	@Override
	public L getContent() {
		return this.letterType;
	}

}
