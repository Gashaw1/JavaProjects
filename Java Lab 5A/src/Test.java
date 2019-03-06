import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		Scanner scanner;
		int insertCount = 0;
		
		while(insertCount != 10)
		{
			if(insertCount == 0)
			{
				System.out.println("Enter first numbers");
			}			
			scanner = new Scanner(System.in);			
		    System.out.print(ArrayListandLinkedList.InsertElementArrayList(scanner.nextInt()) + "\n");			
			insertCount += 1;
			
			System.out.println("Enter " + insertCount + " number!");
		}
		
	
		ArrayList<Integer> myList =  ArrayListandLinkedList.InsertElementArrayList(2);
		
	 System.out.println("sum of arrayList " + ArrayListandLinkedList.sumElementOfArrayList(myList));
	}

}
