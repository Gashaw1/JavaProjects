import java.text.SimpleDateFormat;


public class TimeClass {

	public static boolean IsNumber(String val)
	{
		try 
		{
			Integer.parseInt(val);
			return true;
		} 
		catch (NumberFormatException e)
		{
			return false;
		}

	}

	public static String TimeConvert(String userInput) throws TimeFormatException 
	{
		if (userInput.length() == 5 && userInput.charAt(2)==':') 
		{
			String hours = userInput.substring(0, 2);
			String minutes = userInput.substring(3, 5);
		
			if (IsNumber(hours) && IsNumber(minutes))
			{
				int h = Integer.parseInt(hours);
				int m = Integer.parseInt(minutes);
				
				if(!((h >= 0) && (h<= 24) &&((m >= 0) && (m <= 59))))
				{
					throw new TimeFormatException("There is no such time as " + userInput);
				}
			}
			else
			{
				throw new TimeFormatException("There is no such time as " + userInput);
			}	
		}
		else
		{
			throw new TimeFormatException("There is no such time as " + userInput);
		}

		try 
		{
			SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
			timeFormat.setLenient(false);
			return (new SimpleDateFormat("hh:mm aa")).format(timeFormat.parse(userInput));

		} catch (Exception e)
		{
			throw new TimeFormatException("parsing error " + e.getMessage());
		}
	}
}
