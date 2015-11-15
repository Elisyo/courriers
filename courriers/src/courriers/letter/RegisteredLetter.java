package courriers.letter;

import courriers.content.Text;
import courriers.exceptions.NotEnoughMoneyException;

/**
 * Registred Letter can contains all others letters
 * @author Loic
 *
 */
public class RegisteredLetter<L extends Letter<?>> extends SpecialLetter<L>{	

	/**
	 * @param letter
	 */
	public RegisteredLetter(L letter) {
		super(letter);
	}

	
	@Override
	public void doAction() throws NotEnoughMoneyException {
		receiver.sendLetter(new AknowledgmentOfReceipt(receiver,sender,new Text("(aknowledgment of receipt for a registered letter whose content is a "+ this.letterType.getContent().toString()+" whose "+this.letterType.getContent().description())));		
	}

	@Override
	public int getCost() {
		return 15+this.letterType.getCost();
	}

	@Override
	public L getContent() {
		return this.letterType;
	}


	@Override
	public String description() {
		return "a registered letter whose content is "+this.letterType.description();
	}

}
