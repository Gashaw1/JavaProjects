import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
        boolean doContinue = true;
        Scanner scanner = new Scanner(System.in);
		while(doContinue)
		{	
			 System.out.println();
			System.out.println("Enter the number in decimal ");
			int numInDecimal = scanner.nextInt();
			System.out.println("Enter the the desired base ");
			int desiredBase = scanner.nextInt();			
			System.out.println(numInDecimal + " is " + ConvertNumberInDecmialInAGivenBase.convertBase(numInDecimal, desiredBase) + " in base " + desiredBase );
			ConvertNumberInDecmialInAGivenBase.result = "";
		    System.out.println();
		    
		    
		}

	}
}
