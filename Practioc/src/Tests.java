
public class Tests
{

static void countvoul(String str, int index)
{      	
	if(index != str.length() )
	{
		if(str.charAt(index) == 'a' || str.charAt(index)=='e')
		{
			char c = str.charAt(index);
			System.out.println(c);			
		}		
		countvoul(str, index + 1);
	}
}

	public static void main(String[] args)
	{
	
		Tests.countvoul("akale", 0);
	}

}
