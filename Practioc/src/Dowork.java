
class DontWork{
	
	public static void dontWork() {
		
	}
}
public class Dowork 
{
	public static void DoWork(int i)
	{
		System.out.println("I before : " + i);
		if(i>2)
		{
			DoWork(i -1);
			
			DoWork(i -2);
		}
		
		System.out.println("I after : " + i);
	}

}
