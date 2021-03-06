package courriers.utils;

import java.util.Random;

import courriers.entities.Inhabitant;
import courriers.letter.Letter;
import courriers.letter.PromissoryNote;
import courriers.letter.RegisteredLetter;
import courriers.letter.SimpleLetter;
import courriers.letter.UrgentLetter;


/**
 * @author Loic
 * Generate randomly all the entity which are needed in the project
 */
public class RandomGenerator {
	

	/**
	 * @param min
	 * @param max
	 * @return a random number between 
	 */
	public static int generateRandomNumber(int min,int max){
		Random r = new Random();
		return r.nextInt(max-min)+min;
	}
	
	
	/**
	 * @return a random letter type
	 */
	public static Letter<?> generateRandomLetter(Inhabitant sender,Inhabitant receiver){
		Letter<?>[] letterTab = new Letter<?>[]{new SimpleLetter(sender,receiver),new PromissoryNote(sender,receiver),new RegisteredLetter<Letter<?>>(generateRandomSimpleLetter(sender,receiver)),new UrgentLetter<Letter<?>>(generateRandomSimpleLetter(sender,receiver))};
		return letterTab[generateRandomNumber(0,letterTab.length)];
	}
	
	
	/**
	 * @return a random content
	 */
	public static Letter<?> generateRandomSimpleLetter(Inhabitant sender,Inhabitant receiver){
		Letter<?>[] letterTab = new Letter<?>[]{new SimpleLetter(sender,receiver),new PromissoryNote(sender,receiver)};
		return letterTab[generateRandomNumber(0,letterTab.length)];
	}

	
	
}
