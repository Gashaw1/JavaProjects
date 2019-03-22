//Gashawbeza Amalto
public class ClothStack {

	int topIndex = -1;
	
	Cloth[] clothes = new Cloth[3];

	boolean IsEmpty() 
	{
		return topIndex < 0;
	}
	int push(Cloth cloth) 
	{
		
		if (topIndex < clothes.length - 1)
		{
			clothes[++topIndex] = cloth;
			return 1;
		}
		else
		{
			System.out.println("stack overflow!");
			return -1;
		}
		
	}
	public Cloth pop()
	{
		if(!IsEmpty())
		{
			return clothes[topIndex --];
		}
		else
		{
			System.out.println("stack underflow!");
			return new Cloth();
		}
	}
	public Cloth peek()
	{
		if(!IsEmpty())
		{
			
			return clothes[topIndex];
		}
		else
		{
			System.out.println("stack underflow!");
			return new Cloth();
		}
		
	}
	
	public int countWashedAtHighTempItem()
	{
		int count = 0;
		for(int i = 0;i < clothes.length-1; i ++)
		{
			if(clothes[i].WashInHighTemp)
			{
				count+=1;
			}
		}
		System.out.print(count +  " clothes can wash at hight temp");
		
		return count;
	}
	public void ReuturnAllItem()
	{
		for(int i = 0;i <= clothes.length-1; i ++)
		{			
			   System.out.println(clothes[i].Name + "  : " + clothes[i].color + "  " + clothes[i].WashInHighTemp);
		}
		
	}
}
