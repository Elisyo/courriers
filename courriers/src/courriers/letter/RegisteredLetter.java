package courriers.letter;

import courriers.content.Content;
import courriers.content.Text;
import courriers.exceptions.NotEnoughMoneyException;

/**
 * Registred Letter can contains all others letters
 * @author Loic
 *
 */
public class RegisteredLetter<L extends Letter<?>> extends SpecialLetter< Letter<?>>{	

	/**
	 * @param letter
	 */
	public RegisteredLetter(Letter<?> letter) {
		super(letter);
	}

	
	@Override
	public void doAction() throws NotEnoughMoneyException {
		receiver.sendLetter(new SimpleLetter(receiver,sender,new Text("(aknowledgment of receipt for a registered letter whose content is a "+ this.letterType.getContent().toString()+" whose "+this.letterType.getContent().description())));		
	}

	@Override
	public int getCost() {
		return 15+this.letterType.getCost();
	}

	@Override
	public Content getContent() {
		return super.content;
	}


	@Override
	public String description() {
		return "a registered letter";
	}

}
