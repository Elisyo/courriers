package courriers.letter;

import courriers.content.Text;
import courriers.entities.Inhabitant;

/**
 * A simple letter in response of a registered letter
 * @author Loïc
 *
 */
public class AknowledgmentOfReceipt extends SimpleLetter{

	/**
	 * @param sender
	 * @param receiver
	 * @param text
	 */
	public AknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver,
			Text text) {
		super(sender, receiver, text);
	}
	
	/**
	 * @param sender
	 * @param receiver
	 */
	public AknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver) {
		this(sender, receiver, new Text("acknowlegdement of receipt for a registered letter"));
	}
	
	/* (non-Javadoc)
	 * @see courriers.letter.SimpleLetter#description()
	 */
	public String description() {
		return "an aknowledgment of receipt which is "+super.description();
	}

}
