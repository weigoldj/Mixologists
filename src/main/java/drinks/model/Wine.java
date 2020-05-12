package drinks.model;

public class Wine extends Drink {

	public Wine() {
	  super();
	  this.setGlass("Wine Glass");
	  this.setName("House Wine");
	  this.setPrice(2.00);		
	}
	
	// init method called after constructor
	public void happyHour() {
		System.out.println("Intialization of Wine");
		this.setPrice(1.50);
	}
	
	public void closingTime() {
	  System.out.println("Wine Bean being destroyed");  
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
