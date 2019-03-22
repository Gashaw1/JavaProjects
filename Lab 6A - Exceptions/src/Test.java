

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;



class TimeFormatException extends Exception
{
	 
	String incorrectInput;
	
	TimeFormatException(String incorrectInput)
	{
		this.incorrectInput = incorrectInput;
	
	}
	@Override
	public String toString()
	{
		return ("Exception Occurred: "+ incorrectInput) ;
	}
	
}


public class Test 
{
	
	public static void main(String[] args) throws ParseException 
	{
		SimpleDateFormat dfInput = new SimpleDateFormat("HH:mm");
		SimpleDateFormat outputformat = new SimpleDateFormat("hh:mm aa");
		
		
		Date date = null;
		String outPut = "";		
		String userInput = "100:10";
		
		try
		{	
			
					
			outPut = outputformat.format(date);			
			System.out.println(outPut);
			throw new TimeFormatException("Error");
		
		}
		 catch(TimeFormatException ex ) 
		{
			
	            System.out.println("My exception " + ex.incorrectInput);	    
	            
		}
		
	}

}
