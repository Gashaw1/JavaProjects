
//Gashawbeza Amalto
public class Palindrome {
	
	
	
	public static boolean IsPalindrome(String str)
	{
		if(Reverse(str).equals(str))
		{
			return true;
		}
		return false;
	}
	
	public static String Reverse(String str)
	{
		if(str.length() ==1)
		{
			return str;
		}
		else
		{
			return Reverse(str.substring(1))+ str.charAt(0);
		}
	}

}
