package courriers.letter;



import courriers.exceptions.NotEnoughMoneyException;

/**
 * A special letter which can contains all letters instead of itself
 * @author Loic
 *
 * @param <L>
 */
public class UrgentLetter<L extends Letter<?>> extends SpecialLetter<Letter<?>>{


	
	/**
	 * @param letter
	 */
	public UrgentLetter(Letter<?> letter) {
		super(letter);
	}

	@Override
	public void doAction() throws NotEnoughMoneyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getCost() {
		return 0;
	}

	@Override
	public String description() {
		return "Urgent Letter";
	}

}
