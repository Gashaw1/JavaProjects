

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner scanner;
		boolean y = true;
		String userInput = "";
		
		System.out.println();
		
		do {
			System.out.println("Enter time in 24-hour notation: ");
			scanner = new Scanner(System.in);
			userInput = scanner.nextLine();

			try {
				String convertedResult = TimeClass.TimeConvert(userInput);
				System.out.println("That is the same as: " + convertedResult);
				System.out.println("Again? (y/n):");

				userInput = scanner.nextLine().toLowerCase();

				if (userInput.equals("y")) {
					y = true;
				} 
				else if (userInput.equals("n"))
				{
					y = false;
					System.out.print("Thank you – end of program.");
				}

			} 
			catch (TimeFormatException ex) 
			{
				System.out.println(ex.message);
				System.out.println("Try Again ");
				
			}

		} while (y);
	}

}
