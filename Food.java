/*Arsh Abhinkar
 * 10/23/2024
  Food.java
*/


public class Food
{
	protected String str; //Declaring string for printing dishes
	
	public Food ()
	{
		str = new String(""); //Initializing str
	}
	
	public Food (String prepMethod, String ingredient, String name) //Construcor header with parameters
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient; //Printing out the line with taken in parameters
	}

	public void printForSale()
	{
		System.out.println(str); //Printing the str method
	}
	
	public void printLines() //Printing 3 blank lines method
	{
		System.out.println("\n\n\n");
	}
}

/*
In FoodTester's main method
		Food food1 = new Food ("baked", "banana", "muffins");
		food1.printForSale();
		Food food2 = new Food ("fried", "yam", "fritters");
		food2.printForSale();
		Pizza pizza = new Pizza ("pepperoni");
		pizza.printForSale();
*/
