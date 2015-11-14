package courriers.entities;

import java.util.ArrayList;
import java.util.List;

import courriers.exceptions.NotEnoughMoneyException;
import courriers.letter.Letter;

/**
 * This entity contains the list of the letters of all the habitants in the city and distributes the letters all the days
 * @author Loic
 *
 */
public class City {

	/**
	 * Name of the city 
	 */
	protected String name;


	/**
	 * Letter's list of the habitants in the city
	 */
	protected List<Letter<?>> postBox;

	/**
	 * Create a city
	 * @param name of the city
	 */
	public City(String name) {
		this.name=name;
		this.postBox=new ArrayList<Letter<?>>();
	}
	
	/**
	 * Add a letter to the post box
	 * @param letter
	 */
	public void sendLetter(Letter<?> letter){
		this.postBox.add(letter);
	}
	
	/**
	 * Distribute all the letters to their receiver every day
	 * @throws NotEnoughMoneyException 
	 */
	public void distributeLetters(){
		while(!this.postBox.isEmpty()){
			this.postBox.get(0).getReceiver().receiveLetter((this.postBox.get(0)));
			this.postBox.remove(0);
		}
	}

	
	
	/**
	 * @return the city's name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @return the postBox
	 */
	public List<Letter<?>> getPostBox() {
		return postBox;
	}

}
