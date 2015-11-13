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
	
	public Text(){
		this("bla bla");
	}

	@Override
	public String description() {
		return "text content ("+this.description+")";
	}

}
