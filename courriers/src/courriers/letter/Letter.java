package courriers.letter;

import courriers.content.Content;
import courriers.entities.Inhabitant;
import courriers.exceptions.NotEnoughMoneyException;

public abstract class Letter<C extends Content> implements Content{
	
	/**
	 *sender and receiver of the letter 
	 */
	protected Inhabitant sender, receiver;
	
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
	public abstract int getCost();
	
	
	

	/**
	 * Create a letter with a sender, a receiver
	 * @param sender
	 * @param receiver
	 * @param content
	 */
	public Letter(Inhabitant sender, Inhabitant receiver){
		this.sender = sender;
		this.receiver = receiver;
	}

	/**
	 * @param sender
	 * @param receiver
	 * @param content
	 */
	public Letter(Inhabitant sender, Inhabitant receiver, C content){
		this.sender = sender;
		this.receiver = receiver;
		this.content=content;
	}
	
	
	/*
	 * =============================== Getters & setters ================================
	 */
	
	/**
	 * @return the sender
	 */
	public Inhabitant getSender() {
		return sender;
	}


	/**
	 * @return the receiver
	 */
	public Inhabitant getReceiver() {
		return receiver;
	}
	
	
	/**
	 * @return the content of the letter
	 */
	public C getContent() {
		return content;
	}

}
