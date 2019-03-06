
public class ConvertNumberInDecmialInAGivenBase {
	
	static String result = "";
	public static  String convertBase(int input, int baseNum)
	{
		if(input > 0)
		{
			int remainder = input % baseNum;
			
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
			//System.out.println("Before reverse:  " + result);
			result = Reverse(result);
			//toString();
			//System.out.println("After reverse:  " + result);
		}
		return result;
	}
	
	private static String Reverse(String str) 
	{
		String reverseString = "";
		for(int i = str.length()-1; i >= 0; i --)
		{
			reverseString += str.charAt(i);
		}
		return reverseString;
	}

}
