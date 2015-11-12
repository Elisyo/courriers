package courriers.utils;

import java.util.Random;

import courriers.entities.Inhabitant;
import courriers.letter.Letter;
import courriers.letter.PromissoryNote;
import courriers.letter.RegisteredLetter;
import courriers.letter.SimpleLetter;
import courriers.letter.SpecialLetter;


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
		return r.nextInt(max)+min;
	}
	
	
	/**
	 * @return a random letter type
	 */
	public static Letter<?> generateRandomLetter(Inhabitant sender,Inhabitant receiver){
		Letter<?>[] letterTab = new Letter[]{new SimpleLetter(sender,receiver),new PromissoryNote(sender,receiver),new RegisteredLetter(sender,receiver), new SpecialLetter(sender,receiver)};
		return letterTab[generateRandomNumber(0,letterTab.length)];
	}
	
}
