package courriers.letter;

import courriers.entities.Habitant;

public abstract class Letter<C extends Content> {
	
	/**
	 *sender and receiver of the letter 
	 */
	protected Habitant sender, receiver;
	
	/**
	 * content of the letter
	 */
	protected C content;
	
	public abstract void doAction();
	
	
	/**
	 * abstract method which returns the letter's cost
	 * depends of the letter's type
	 * @return cost
	 */
	public abstract double getCost();
	
	
	
	/**
	 * Create a letter with a sender and a receiver
	 * @param sender
	 * @param receiver
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
