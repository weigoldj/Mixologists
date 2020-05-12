/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package drinks;

import drinks.model.Beer;
import drinks.model.Wine;
import drinks.model.Cocktail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public String getGreeting() {
        return "Hello world.";
    }
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        ApplicationContext context = new FileSystemXmlApplicationContext("AppContext.xml");
        
        Beer beer = context.getBean("DraftBeer", Beer.class);
        System.out.println(beer.toString());
        
        Wine gw = context.getBean("GoodWine", Wine.class);
        System.out.println(gw.toString());
        
        Cocktail hurricane = context.getBean("Hurricane", Cocktail.class);
        System.out.println(hurricane.toString());
    }
}