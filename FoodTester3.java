//Arsh Abhinkar
//10/25/24
//FoodTester3.java

public class FoodTester3 //class header
{
	public static void main(String[] args) //main header
	{
		int cost = 50; //D + I for putting as parameter
		int amount = 12; //D + I for putting as parameter
		
		Food3 food1 = new Food3 ("baked", "banana", "muffins", cost, amount); //Putting in parameters for printing lines in other class
		food1.printLines(); //Calling 3 blank lines method
		food1.printForSale(); //Printing the line
		
		cost = 100; //Initialize for putting as parameter
		amount = 3; //Initialize for putting as parameter
		
		Food3 food2 = new Food3 ("fried", "yams", "fritters", cost, amount); //Putting in parameters for printing lines in other class
		food2.printForSale(); //Printing the line
		
		cost = 250; //Initialize for putting as parameter
		amount = 8; //Initialize for putting as parameter
		
		Pizza3 pizza2 = new Pizza3("anchovies", cost, amount); //Putting in parameters for printing lines in other class
		pizza2.printForSale(); //Printing the line
		
		DeepDishPizza3 pizza = new DeepDishPizza3("anchovies", cost, amount); //Putting in parameters for printing lines in other class
		pizza.printForSale(); //Printing the line
		food1.printLines(); //Calling 3 blank lines
	}
}
