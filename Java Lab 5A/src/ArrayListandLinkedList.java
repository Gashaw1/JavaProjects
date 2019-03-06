
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListandLinkedList
{
	private static ArrayList<Integer> arrayListIntegers = new ArrayList<Integer>();
	private static LinkedList<Integer> linkedListInteger = new LinkedList<Integer>();
	public static ArrayList<Integer> InsertElementArrayList(int nums)
	{
		arrayListIntegers.add(nums);
		return arrayListIntegers;
	}	
	public static LinkedList<Integer> InsertElementLinkedList(int num)
	{
		linkedListInteger.add(num);
		return linkedListInteger;
	}
	
	
	public static int sumElementOfArrayList(ArrayList<Integer> lists)
	{
	    int sumResult = 0;
		
		for(int i =0; i < lists.size()-1; i ++)
		{
		  sumResult = sumResult + lists.get(i);			
		}
		return sumResult;
	}
	
	public static int sumOfLinkedListElement(LinkedList<Integer> linkedList)
	{
		int sumResult = 0;
		
		for(int i =0; i < linkedList.size()-1; i ++)
		{
			sumResult = sumResult + (int)linkedList.get(i);			
		}
		return sumResult;
	}

}
