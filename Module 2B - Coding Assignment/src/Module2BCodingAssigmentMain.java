import java.util.Scanner;
abstract class Vacation {
	public double budget;
	String destination;
	abstract double CalcBudget(double budget);
}

class All_InclusiveVacation extends Vacation {
	String brand;
	String rate;
	double price;

	public All_InclusiveVacation(String brand, String rate, double price, String destination, double budget) {
		this.brand = brand;
		this.rate = rate;
		this.price = price;
		this.destination = destination;		
		this.budget = CalcBudget(budget);
	}

	@Override
	double CalcBudget(double budget) {
		double result = budget - price;
		return result;
	}

	@Override
	public String toString() {

		return 
				"\n	Destination: " + this.destination +
				"\n	Brand: " + this.brand +
				"\n	Rate: " + this.rate +
				"\n	Price: " + this.price +
				"\n	Compart Budget: $"+ this.budget;

	};
}

class PiecemealVacation  extends Vacation
{
	String hotel;
	String meal;
	String airfare;
	
	double hotelCost;
	double mealCost;
	double airfareCost;
	
	public PiecemealVacation(String hotel,double hotelCost,
			String meal,double mealCost,
			String airfare, double airfreCost,
			String destination, double budget)
	{
	   this.hotel = hotel;
	   this.hotelCost = hotelCost;
	   this.meal = meal;
	   this.mealCost = mealCost;
	   this.airfare = airfare;
	   this.airfareCost = airfareCost;
	   this.destination = destination;
	   this.budget = CalcBudget(budget);
	}
			
	@Override
	double CalcBudget(double budget)
	{
		double totalCost = this.airfareCost + this.mealCost + this.hotelCost;
		double result = budget - totalCost;
		return result;
	}

	@Override
	public String toString() 
	{
		return 
				"\n	Destination: " + this.destination +
				"\n	Hotel: " + this.hotel + ": $" + this.hotelCost +
				"\n	Meal: " + this.meal +": $" + this.mealCost +
				"\n	Airfare: " + this.airfare + ": $" + this.airfareCost +
				"\n	Compart Budget: $"+ this.budget;
	}
}

public class Module2BCodingAssigmentMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Whats is budget? ");
	    double userInput = scanner.nextDouble();
	    
	    System.out.println("Budget: " + userInput);
	    
		All_InclusiveVacation allInclusive = new All_InclusiveVacation("Hotel", "***", 447.5, "atlant", userInput);
		System.out.println(allInclusive);

		//System.out.println();
		All_InclusiveVacation person = new All_InclusiveVacation("Hotel", "*****", 44.5, "atlant", userInput);
		System.out.println(person);
		
		
		
		PiecemealVacation piecemealVacation = new PiecemealVacation("Hilto",345,"food",33,"airport",99,"atlant",userInput);
		System.out.println(piecemealVacation);
		
		PiecemealVacation piecemealVacation2 = new PiecemealVacation("Hyte",907,"food",88,"airport",99,"atlant",userInput);
		System.out.println(piecemealVacation2);
		
	}

}
