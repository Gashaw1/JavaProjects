

public class TaskSumNums implements Runnable
{

	long sum = 0;
	int start = 0;
	int end = 0;
	int[]nums;
	
	public TaskSumNums(int[]nums,int start, int end)
	{
		this.start = start;
		this.end = end;
		this.nums = nums;
	}
	
	public long getSum()
	{
		return sum;
	}
	
	@Override
	public void run() 
	{
		for(int i = start; i <end; i ++ )
		{
			sum += nums[i];
			
			//System.out.println(sum);
		}		
	}	

}
