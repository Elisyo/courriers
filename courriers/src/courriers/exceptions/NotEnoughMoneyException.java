package courriers.exceptions;

/**
 * This exception is raised when an habitant tries to spend some money while he has no it any more
 * @author Loic
 *
 */
public class NotEnoughMoneyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * display the error message
	 * @param error
	 */
	public NotEnoughMoneyException(String error){
		super(error);
	}
	
}
