package drinks.model;

import java.util.*;

public class Cocktail extends Drink {

	private Map<String, String> ingredients;
	
	public Cocktail() { 
	  super();
	} 


	// Getters / Setters
	public Map<String, String> getIngredients() {
		return ingredients;
	}
	
	
	public void setIngredients(Map<String, String> ingredients) {
		this.ingredients = ingredients;
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" Cocktail {");
		sb.append(super.toString());
		
		sb.append(", Ingredients: ");
		for(Map.Entry<String, String> entry : ingredients.entrySet()) {
			sb.append(" ");
			sb.append(entry.getKey());
			sb.append(":");
			sb.append(entry.getValue());
		}
	
		sb.append(" }");
		return sb.toString();
	}
}
