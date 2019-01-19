

import java.util.Random;
public class ArrayOperations 
{
	
	static int FindLargest(int[] num)
	{
		int largestValue = 0;
		
		for(int i = 0; i < num.length; i ++)
		{
			if(num[i] > largestValue)
			{
				largestValue = num[i];
			}
		}
		return largestValue;
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
  		//return myArray;		
               
	}
   
	static int FindLengthOflongestContinuousSeriesPositiveNumberInArray(int[] array)
	{		
		int longestCounterValue = 0;
		int counter = 0;	
		for(int i =0; i < array.length; i ++)
		{
			if(array[i]>  0)
			{
				counter = counter + 1;
				if(counter > longestCounterValue)
				{
					longestCounterValue = counter;
				}
			}
			else 
			{
				counter = 0;
			}
		}
		return longestCounterValue;
	}
	public static void PrintArrayValues(int[] array)
	{
		for(int i =0; i < array.length; i ++)
		{
			System.out.print(" | " + array[i] );
		}		
	}

	public static void main(String[] args)
	{
		int[] nums = {1, 4, 13, 43, -25, 17, 22, -37, 29};
		int[] data = new int[20];		
        
		FillArrayRandomNumber(data);
    
        System.out.print("Nums array values: ");
        PrintArrayValues(nums);      
        System.out.println();
        System.out.print("Data array alues: ");
        PrintArrayValues(data);
    
        
		int largestValFromNumArray = FindLargest(nums);
		int largestValFromDataArray =FindLargest(data);		
		int sum = largestValFromNumArray  + largestValFromDataArray;
		int longestCounter = FindLengthOflongestContinuousSeriesPositiveNumberInArray(data);
		
		
		
		System.out.println("\nLargest value in nums array: " + largestValFromNumArray
				+ "\nLargest value in data array: " + largestValFromDataArray
				+ "\nSum of the largest values from nums and data array: "+ sum);
		
		System.out.print("\nLongest searious positive number in data array: " + longestCounter);
	}

}
