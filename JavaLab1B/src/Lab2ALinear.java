
import java.util.Random;
public class Lab2ALinear 
{

	static int LinearSearch(int[]array, int key)
	{			
		int index = -1;
	
		for(int i =0;i < array.length; i ++)
		{
			if(array[i] == key) 
			{
				index = i;			
			}			
		}		
		return index;
	}
	static void FillArrayRandomNumber(int[] array)
	{
		int[] myArray;
		int min = -100;
		int max = 100;
		
		myArray = array;  
		Random rand = new Random();
		
  		for(int i=0;i<myArray.length;i++)
  		{  			
  			myArray[i]= rand.nextInt(max + 1 -min) + min;
   		}
		
	}
	
	static void PrintArrayValues(int[] array)
	{
		for(int i =0; i < array.length; i ++)
		{
			System.out.print(" | " + array[i] );
		}		
	}
	

	public static void main(String[] args) 
	{
		int[]nums = {1, 4, 4, 22, -5, 10, 21, -47, 23};
		int[]data = new int[20];
		FillArrayRandomNumber(data);
		
		System.out.print("Nums array values: ");
	    PrintArrayValues(nums);      
	    System.out.println();
	    System.out.print("Data array alues: ");
	    PrintArrayValues(data);
	  
	    int result = LinearSearch(nums, -4);
		
		
		LinearSearch(data, -12);
	}

}
