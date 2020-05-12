package drinks.model;

public class Beer extends Drink {

	public Beer() {
	  super();
	  this.setGlass("MUG");
	  this.setName("Draft Beer");
	  this.setPrice(1.00);

	}
	
	/**
	 * toString method
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" Beer {");
		sb.append(super.toString());
		sb.append(" }");
		return sb.toString();
	}
}
