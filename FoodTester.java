//Arsh Abhinkar
//10/25/24
//FoodTester.java

public class FoodTester //Class header
{
	public static void main(String[] args) //Main header
	{
		
		Food food1 = new Food ("baked", "banana", "muffins");//Putting in parameters for printing on Food class
		food1.printLines(); //Calling printing 3 blank lines method
		food1.printForSale(); //Calling printing method for the inputted parameters
		Food food2 = new Food ("fried", "yams", "fritters"); //Putting in parameters for printing on Food class
		food2.printForSale(); //Calling printing method for the inputted parameters
		Pizza pizza = new Pizza ("pepperoni");//Putting in parameters for printing on Food class
		pizza.printForSale(); //Calling printing method for the inputted parameters
		food1.printLines(); //Calling printing 3 blank lines method
	}
}
