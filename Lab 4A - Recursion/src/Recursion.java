
public class Recursion {

    static int count = 0;
	public static int getNumberOfVowels(String str, int index)
	{
		
		
		if(str.length()!= index)
		{
			if(str.charAt(index)== 'a'
					|| str.charAt(index)=='e'
					|| str.charAt(index)=='i'
					|| str.charAt(index)=='0'
					|| str.charAt(index)=='u')
			{
			    count ++;				
				System.out.println(count);					
			}		
			getNumberOfVowels(str, index + 1);
		}		
		return count;
	}
}
