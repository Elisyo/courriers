package courriers.utils;

/**
 * Just a simple class with useful statics methods 
 * @author Loic
 *
 */
public class Utils {

	
	/**
	 * if amount > 1 add a 's' to euro 
	 * @param amount
	 * @return the correct string
	 */
	public static String amountToString(int amount){
		String eur=" euro";
		if(amount>1)
			eur=" euros";
		return amount+eur;
	}
}
