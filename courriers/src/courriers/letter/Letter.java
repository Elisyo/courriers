package courriers.letter;

import courriers.content.Content;
import courriers.content.Text;
import courriers.entities.Habitant;
import courriers.exceptions.NotEnoughMoneyException;

public abstract class Letter<C extends Content> {
	
	/**
	 *sender and receiver of the letter 
	 */
	protected Habitant sender, receiver;
	
	/**
	 * content of the letter
	 */
	protected C content;
	
	/**
	 * Action when the receiver receive his letter
	 * @throws NotEnoughMoneyException 
	 */
	public abstract void doAction() throws NotEnoughMoneyException;
	
	
	/**
	 * abstract method which returns the letter's cost
	 * depends of the letter's type
	 * @return cost
	 */
	public abstract double getCost();
	
	
	

	/**
	 * Create a letter with a sender, a receiver and a content
	 * @param sender
	 * @param receiver
	 * @param content
	 */
	public Letter(Habitant sender, Habitant receiver){
		this.sender = sender;
		this.receiver = receiver;
	}


	
	
	/*
	 * =============================== Getters & setters ================================
	 */
	
	/**
	 * @return the sender
	 */
	public Habitant getSender() {
		return sender;
	}


	/**
	 * @return the receiver
	 */
	public Habitant getReceiver() {
		return receiver;
	}
	
	
	/**
	 * @return the content of the letter
	 */
	public C getContent() {
		return content;
	}

}
