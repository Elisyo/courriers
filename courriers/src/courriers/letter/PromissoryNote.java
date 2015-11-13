package courriers.letter;

import courriers.content.Money;
import courriers.entities.Inhabitant;
import courriers.exceptions.NotEnoughMoneyException;
import courriers.utils.RandomGenerator;

/**
 * Letter with a money content (sender's money. The receiver send a thank-you letter
 * @author Loic
 *
 */
public class PromissoryNote extends Letter<Money>{
	protected int amount;

	public PromissoryNote(Inhabitant sender, Inhabitant receiver,int amount) {
		super(sender, receiver);
		this.amount=amount;
	}
	
	public PromissoryNote(Inhabitant sender, Inhabitant receiver){
		this(sender,receiver,RandomGenerator.generateRandomNumber(1, 1000));
	}

	@Override
	public void doAction() throws NotEnoughMoneyException {
		if(sender.getBankAccount() - this.amount >= 0){
			sender.debit(amount);
			receiver.credit(amount);
			//Text text = new Text("thanks for a promissory note letter whose content is a money content ("+this.amount+")");
			receiver.sendLetter(new SimpleLetter(receiver,sender));
		}
		else
			throw new NotEnoughMoneyException("You don't have enough money");
	}

	@Override
	public double getCost() {
		return 1+(1/100*this.amount);
	}
	
	public double getAmount(){
		return this.amount;
	}

}
