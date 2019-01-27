import java.util.Random;

//Gashawbeza Amalto
public class Lab2BBinary {

	static int[] SortArray(int[] array) 
	{
		int i, j, tmp;
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}	

	// binary search
	static String BinarySearch(int[] sortedList, int key) {
		String searchResult = "";

		int middleValue = 0;
		int minValue = 0;
		int lenngth = sortedList.length - 1;

		while (minValue <= lenngth) 
		{
			
			middleValue = (lenngth + minValue) / 2;

			
			if (sortedList[middleValue] < key) 
			{				
				minValue = middleValue + 1;
				
			} else if (sortedList[middleValue] > key)
			{
				lenngth = middleValue - 1;
			}
			else 
			{
				
				searchResult = " " + key + " at index of " + middleValue;
				minValue = lenngth + 1;				
			}			
		}
		if(searchResult == "")
		{
			int inss =  middleValue + 1;
			searchResult = " " + inss;
		}
		return searchResult;
	}

	static void FillArrayRandomNumber(int[] array) {
		int[] myArray;
		int min = -100;
		int max = 100;

		myArray = array;
		Random rand = new Random();

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rand.nextInt(max + 1 - min) + min;
		}
	}

	static void PrintArrayValues(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" | " + array[i]);
		}
	}

	public static void main(String[] args) {

		int[] nums = { 1, 4, 4, 22, -5, 10, 21, -47, 23 };
		int[] data = new int[20];
		FillArrayRandomNumber(data);

		System.out.print("unsorted num array: ");
		PrintArrayValues(nums);
		System.out.println();
		System.out.print("unsorted data array: ");
		PrintArrayValues(data);
		System.out.println();
		System.out.println();
		System.out.print("Sorted num array: ");
		PrintArrayValues(SortArray(nums));

		System.out.println();
		System.out.print("Sorted data array: ");
		PrintArrayValues(SortArray(data));
		System.out.println();
		System.out.println();
		System.out.println("search result num array: " + BinarySearch(SortArray(nums), 5));
		System.out.println("search result data array: " + BinarySearch(SortArray(data), 21));

	}

}
