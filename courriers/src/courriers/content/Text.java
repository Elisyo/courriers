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
	 * @param description
	 */
	public Text(String description){
		this.description=description;
	}

	@Override
	public String description() {
		return this.description;
	}

}
