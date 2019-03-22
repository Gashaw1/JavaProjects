import java.sql.Date;

public class TimeConverter 
{
	
	
	
	public double ConvertTime(double time)
	{
		double result =0;
		
		while(time > 12)
		{			
	      ConvertTime(time = time-12);
		}
		return time;
	}

}
