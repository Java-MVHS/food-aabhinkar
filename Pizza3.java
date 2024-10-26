//Arsh Abhinkar
//10-23-24
//Pizza3.java

public class Pizza3 extends Food3 //Class header
{
	public Pizza3 (String ingredientIn, int cost, int amount) //Main header
	{
		super("baked", ingredientIn, "pizza", 250, 8); //putting in parameters for super class (Food3)
	}
	
	public Pizza3 (String ingredientIn, String nameIn, int cost, int amount) //takes in a string, string, string, int, int for finding the cost
	{
		super("baked", ingredientIn, nameIn, 250, 8); //putting in parameters for super class (Food3)
	} 
}
