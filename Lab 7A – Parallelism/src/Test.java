import java.util.Random;


public class Test {

	public static void main(String[] args)
	{
		int[]nums = new int[100000];		
		
		Random rand = new Random();
		for(int i = 0; i < 100000; i ++)
		{
			nums[i]= rand.nextInt(100);
		}	
		
		TaskSumNums task1 = new TaskSumNums(nums,0,50000);
		TaskSumNums task2 = new TaskSumNums(nums,50000,100000);
		
		Thread tr = new Thread(task1);
		Thread tr2 = new Thread(task2);
		
		tr.start();
		tr2.start();
		
		//
		while(tr.isAlive() || tr2.isAlive()){};
		
		System.out.println("Thread 1 " + task1.getSum());
		System.out.println("Thread 2 " + task2.getSum());
		
		System.out.println("Thread sum  " + (task2.getSum() + task1.getSum()));
		
		
				
	}

}
