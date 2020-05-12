package drinks.model;

import java.lang.String;

public class Drink {

	private String name;
	private String glass;
	private double price;
	
	public Drink() { }
	
	
	// Getters / Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGlass() {
		return glass;
	}

	public void setGlass(String glass) {
		this.glass = glass;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * toString Method
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" Drink {");
		sb.append(" name :" + this.name);
		sb.append(", glass :" + this.glass);
		sb.append(", price : " + this.price);
		sb.append(" }");
		return sb.toString();
	}
}
