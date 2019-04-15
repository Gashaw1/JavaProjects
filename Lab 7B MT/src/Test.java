import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;


public class Test {

	public static void parallelMergeSort(int[] list)
	{
		RecursiveAction mainTask = new Tasks(list);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(mainTask);
	}
	
	public static void main(String[] arg) throws InterruptedException 
	{
		
		
		int[] nums = new int[10000];

		Random rand = new Random();
		for (int i = 0; i < nums.length - 1; i++) 
		{
			nums[i] = rand.nextInt(100);
		}
		
		int[]nums1 = new int[100];
		nums1 = nums;
		int[]nums2 = new int[100];
		nums2 = nums;

		long startTime = System.currentTimeMillis();
		parallelMergeSort(nums1); 
		long endTime = System.currentTimeMillis();	
		long timeConsumed = endTime - startTime;
		System.out.println("\nTime consumed  using parallelism to sort :  " + timeConsumed + " milliseconds");
		
		
		BubbleSortClass bubble = new BubbleSortClass(nums2);		
		long startTime2 = System.currentTimeMillis();
		bubble.sort();
		long endTime2 = System.currentTimeMillis();		
		long timeConsumed2 =  endTime2- startTime2;
		System.out.println("Time consumed using bubble sorting traditional way :  " + timeConsumed2 +  " milliseconds");

	}

}
