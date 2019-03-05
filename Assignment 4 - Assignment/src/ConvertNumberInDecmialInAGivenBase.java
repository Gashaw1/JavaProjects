
public class ConvertNumberInDecmialInAGivenBase {
	
	String result = "";
	public  String convertBase(int input, int baseNum)
	{
		if(input > 0)
		{
			int remainder = input/baseNum;
			if(remainder >= 10)
			{
				String latters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				result += latters.charAt(remainder);
				input = input / baseNum;			
				convertBase(input, baseNum);
			}
			else
			{
				result += remainder;
				input = input / baseNum;
				convertBase(input, baseNum);
			}
		}
		else
		{
			result = Reverse(result);
		}
		return result;
	}
	private String Reverse(String str) 
	{
		String reverseString = "";
		for(int i = str.length()-1; i == 0; i --)
		{
			reverseString += str.charAt(i);
		}
		return reverseString;
	}

}
