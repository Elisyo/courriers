package tests.letter;

import courriers.content.Content;
import courriers.content.Text;
import courriers.entities.Inhabitant;
import courriers.exceptions.NotEnoughMoneyException;
import courriers.letter.Letter;

public class MockLetter extends Letter<Content>{

	public MockLetter(Inhabitant sender, Inhabitant receiver) {
		super(sender, receiver, new Text("mock"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() throws NotEnoughMoneyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

}
