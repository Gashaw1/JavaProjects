
public class ClothStack {

	int topIndex = -1;
	
	Cloth[] clothes;

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
		if(IsEmpty() == false)
		{
			return clothes[topIndex --];
		}
		else
		{
			System.out.println("stack underflow!");
			return new Cloth();
		}
	}
	public Cloth pick()
	{
		if(IsEmpty() == false)
		{
			return clothes[topIndex];
		}
		else
		{
			System.out.println("stack underflow!");
			return new Cloth();
		}
		
	}
}
