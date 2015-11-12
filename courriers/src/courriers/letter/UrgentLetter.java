package courriers.letter;

import courriers.content.Content;
import courriers.exceptions.NotEnoughMoneyException;

public class UrgentLetter<L extends Letter<? extends Content>> extends Letter<Content>{
	
	Letter<?> letter;

	
	public UrgentLetter(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver());
		this.letter=letter;
	}

	@Override
	public void doAction() throws NotEnoughMoneyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
