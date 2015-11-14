package courriers.letter;

import courriers.content.Text;
import courriers.entities.Inhabitant;

/**
 * Simple in response of a promissory note letter
 * @author Loïc
 *
 */
public class ThanksLetter extends SimpleLetter{

	/**
	 * @param sender
	 * @param receiver
	 * @param text
	 */
	public ThanksLetter(Inhabitant sender, Inhabitant receiver, Text text) {
		super(sender, receiver, text);
	}

	/**
	 * @param sender
	 * @param receiver
	 */
	public ThanksLetter(Inhabitant sender, Inhabitant receiver) {
		this(sender, receiver, new Text("thanks for a promissory note letter"));
	}
	
	
	/* (non-Javadoc)
	 * @see courriers.letter.SimpleLetter#description()
	 */
	public String description() {
		return "a thanks letter which is "+super.description();
	}
}
