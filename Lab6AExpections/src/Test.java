
public class Test {

	public static void main(String[] args)	
	{
		
		
		double userInput = 13.62;
		
		//Create instanc  for TimeConverter  class inorder to call its method
		// cretae instance to access the method in our class
		TimeConverter timeCon = new TimeConverter();
	
		 //use dot opret to call the method.
	   double result =   timeCon.ConvertTime(userInput);
	   
	  System.out.print("  "  + result);
       
	}

}
