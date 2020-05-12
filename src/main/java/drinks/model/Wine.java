package drinks.model;

public class Wine extends Drink {

	public Wine() {
	  super();
	  this.setGlass("Wine Glass");
	  this.setName("House Wine");
	  this.setPrice(2.00);		
	}
	
	/**
	 * toString Method
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" Wine { ");
		sb.append(super.toString());
		sb.append(" }");
		return sb.toString();
	}
}
