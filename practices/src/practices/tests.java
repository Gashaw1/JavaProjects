package practices;

class NumberExpection extends Exception {
	String exMessage;

	public NumberExpection(String exMessage) {
		this.exMessage = exMessage;
	}

	@Override
	public String toString() {

		return exMessage;
	}
}

class Calcualte {
	public static int add(int a, int b) {
		int result = 0;

		result = a + b;

		return result;
	}

	public static void test()
	{
		
	}
}

public class tests {

	public static void main(String[] args) 
	{

		Calcualte.test();
		
		int a = 3;
		int b = '9';
	
			try
			{
				while (b <10)
				{
					if (b != 0)
					{
						System.out.println(Calcualte.add(a, b));	
						b --;						
					} 
					else 
					{
						throw new NumberExpection("Error occured number divided by zero!");
					}
				}
				
			}
			catch (NumberExpection ex) 
			{		
				System.out.println(	ex.exMessage);

			}
		}
		

	}


