package courriers.content;

/**
 * Text Content
 * @author breuzon
 *
 */
public class Text implements Content{

	
	/**
	 * Description of the letter
	 */
	protected String description;
	
	/**
	 * @param description of the letter
	 */
	public Text(String description){
		this.description=description;
	}
	
	/**
	 * Empty constructor, initialize with an empty message
	 */
	public Text(){
		this("Empty message");
	}

	@Override
	public String description() {
		return this.description;
	}

}
