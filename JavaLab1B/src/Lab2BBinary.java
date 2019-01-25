import java.util.Random;
//Gashawbeza Amalto
public class Lab2BBinary {

	
	//sorting ascending order
	static int[]SortArray(int[] array, int arraySize)
	{			
		int tempValue = 0;		
		for (int b = 0; b < array.length - 1; b++)
		{
             if (array[b] > array[b + 1])
             {
            	 tempValue = array[b];
                 array[b] = array[b + 1];
             }
         }		
		return array;		
	}
	//binary search
	static String binarySearch(int[]sortedArray, int key)
	{		
		String searchResult = "";
		
		int middleValue = 0;
        int minValue = 0;
        int maxValue = sortedArray.length - 1;

        while (minValue <= maxValue) 
        {
            middleValue = (maxValue + minValue) / 2;

            if (sortedArray[middleValue] < key)
            {
                minValue = middleValue + 1;
            } 
            else if (sortedArray[middleValue] > key)
            {
                maxValue = middleValue - 1;
            } 
            
            else 
            {
            	searchResult = " " + key + " at index of " + middleValue;              
                minValue = maxValue + 1;
                break;
            }
        }
        return searchResult;
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
		int[]sortedArrayResult;
		
		int[]nums = {1,-47,-5,1,4,4,1};
		int[]data = new int[20];	
				
		FillArrayRandomNumber(data);
		
		System.out.print("Nums array values: ");
	    PrintArrayValues(nums);      
	    System.out.println();
	    System.out.print("Data array alues: ");
	    PrintArrayValues(data);
	  
	    System.out.println();	    
	    
	    System.out.println("Binary Search for num array");	  
	  
	    int size = 5;
	    int key = -47;	
	    
        sortedArrayResult = SortArray(nums,size);		
	    System.out.print( binarySearch(sortedArrayResult, key ));
	   
	}

}
