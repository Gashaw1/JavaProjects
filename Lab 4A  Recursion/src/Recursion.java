
public class Recursion {
	
	private static int count = 0;	
	public static int countVowels(String str, int index)
	{
		str.toLowerCase();
		if(index <= str.length()-1)
		{
			if(str.charAt(index)=='a' 
					|| str.charAt(index)=='e'
					|| str.charAt(index)=='i'
					|| str.charAt(index)=='o'
					|| str.charAt(index)=='u')
			{
				count += 1;
			}
			countVowels(str, index + 1);
			
		}
		return count;
	}

}
