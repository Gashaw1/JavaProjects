
import java.util.Random;
//Gashawbeza Amalto
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
	  
	    System.out.println();	    
	    
	    System.out.println("linear Search for num array");
	  
	    int key = 22;
	    int searchNums = LinearSearch(nums, key);	
	   
	    if(searchNums != - 1)
	    {
	    	 System.out.print( key + " foud at index of " +  searchNums );
	    }
	    else
	    {
	    	System.out.print(searchNums);
	    }
	    System.out.println();
	   
	    System.out.println("linear Search for data array");
	   
	    int searchData = LinearSearch(data, key);	
	   
	    if(searchData != - 1)
	    {
	    	 System.out.print( key + " foud at index of " +  searchData );
	    }
	    else
	    {
	    	System.out.print(searchData);
	    }
		
		
	}

}
