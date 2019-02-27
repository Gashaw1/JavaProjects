
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "aba";
		boolean result = 	Palindrome.IsPalindrome(myString);
		if(result == true)
		{
			System.out.print(myString + " Is a palindrm");
		}
		else			
		{
			System.out.print(myString + " Is NOT a palindrm");
		}		
		//System.out.println(Palindrome.IsPalindrome("aba"));
	}

}
