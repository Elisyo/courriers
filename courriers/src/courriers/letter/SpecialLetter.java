package courriers.letter;

import courriers.content.Content;
import courriers.entities.Inhabitant;

public class SpecialLetter extends Letter<Content>{

	protected double cost = 2;
	
	public SpecialLetter(Inhabitant sender, Inhabitant receiver) {
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
