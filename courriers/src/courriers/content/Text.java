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
	protected String description="bla bla";
	

	@Override
	public String description() {
		return this.description;
	}

}
