
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		int insertCount = 10;

		while (insertCount != 0)
		{
			if (insertCount == 10) 
			{
				System.out.println("Add 10 numbers ArrayList");
			}
			scanner = new Scanner(System.in);
		    ArrayListandLinkedList.InsertElementArrayList(scanner.nextInt());
			insertCount -= 1;			
			System.out.println(" "  + insertCount + " more left ");
		}
				
		System.out.println("\nList of num in ArrayList: " + ArrayListandLinkedList.getArrayListElements()+ "\n");
	  	System.out.println("Sum of numbers in the List " + 	ArrayListandLinkedList.sumOfArrayListElements(ArrayListandLinkedList.getArrayListElements()));
	
	  	System.out.println();
	  	
	  	insertCount = 10;
	  	
	  	while (insertCount != 0)
		{
			if (insertCount == 10) 
			{
				System.out.println("Add 10 numbers LinkedList");
			}
			scanner = new Scanner(System.in);
		    ArrayListandLinkedList.InsertElementLinkedList(scanner.nextInt());
			insertCount -= 1;
			
			System.out.println(" "  + insertCount + " more left ");
		}
				
		System.out.println("\nList of num in LinkedList: " + ArrayListandLinkedList.getLinkedListElements()+ "\n");
	  	System.out.println("Sum of numbers in the List " + 	ArrayListandLinkedList.sumOfLinkedListElement(ArrayListandLinkedList.getLinkedListElements()));
		
	}

}
