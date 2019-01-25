import java.util.*;
//Gashawbea Amalto
public class Lab1AConsole 
{

	public static void main(String[] args)
	{		
		
		String name = "";
		int age = 0;
		
		Scanner scaner = new Scanner(System.in);
		
		System.out.print("What is your name ?. ");
		name = scaner.next();
		  
		System.out.print("How old are you ?. ");
		age = scaner.nextInt();
		
		System.out.println("\nName: " + name + "\n" + "Age :" + age);		
	       
	  
	}

}
