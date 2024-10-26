//Arsh Abhinkar
//10-23-24
//Pizza.java

public class Pizza extends Food //Class header
{
	public Pizza (String ingredientIn)
	{
		super("baked", ingredientIn, "pizza"); //Sending in parameters for super class to print
	}
	
	public Pizza (String ingredientIn, String nameIn) //Declaring parameters
	{
		super("baked", ingredientIn, nameIn); //Sending in parameters to super class for Food class to print
	} 
}
