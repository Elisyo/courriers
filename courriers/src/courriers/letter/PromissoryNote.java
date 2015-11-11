package courriers.letter;

import courriers.content.Money;
import courriers.content.Text;
import courriers.entities.Habitant;
import courriers.exceptions.NotEnoughMoneyException;

/**
 * Letter with a money content (sender's money. The receiver send a thank-you letter
 * @author Loic
 *
 */
public class PromissoryNote extends Letter<Money>{
	protected int amount;

	public PromissoryNote(Habitant sender, Habitant receiver,int amount) {
		super(sender, receiver);
		this.amount=amount;
	}

	@Override
	public void doAction() throws NotEnoughMoneyException {
		if(sender.getBankAccount() - this.amount >= 0){
			sender.debit(amount);
			receiver.credit(amount);
			Text text = new Text("thanks for a promissory note letter whose content is a money content ("+this.amount+")");
			receiver.sendLetter(new SimpleLetter(receiver,sender));
		}
		else
			throw new NotEnoughMoneyException("You don't have enough money");
	}

	@Override
	public double getCost() {
		return 1+(1/100*this.amount);
	}

}
