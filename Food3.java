//Arsh Abhinkar
//10/23/2024
//Food3.java

public class Food3 //Class header
{
	protected String str; //Declaring string for printing below
	protected double moneyMade; //Declaring double for calculating the money made
	
	public Food3()
	{
		str = new String(""); //D + I str for printing
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int cost, int amount) //Taking in parameters for printing
	{	
		double moneyMade = (cost*amount)/100; //finding the amount of money made
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient + " will be sold for " + cost + " cents each. With " 
				+ amount + " " + name + ", $" + String.format("%.2f", moneyMade) + " can be made."; //Printing the lines with variables
	}

	public void printForSale()
	{
		System.out.println(str); //Printing the initialized string above
	}
	
	public void printLines() //method for printing out the 3 blank lines
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
