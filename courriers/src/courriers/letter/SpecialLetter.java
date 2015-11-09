package courriers.letter;

import courriers.entities.Habitant;

public class SpecialLetter extends Letter<Content>{

	protected double cost = 2;
	
	public SpecialLetter(Habitant sender, Habitant receiver) {
		super(sender, receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

	@Override
	public Content getContent() {
		// TODO Auto-generated method stub
		return super.content;
	}

}
