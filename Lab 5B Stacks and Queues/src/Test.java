
public abstract class Test {

	public static void main(String[] args)
	{
		
		StacksCloth cloth = new StacksCloth();
		
		cloth.push(new StacksCloth("cloth A", "color A", false));
		cloth.push(new StacksCloth("cloth B", "color B", true));
		cloth.push(new StacksCloth("cloth c", "color c", false));
		
		//System.out.print("Index "  + cloth.index);
	
		
		//System.out.println(cloth.clothes[0].color);
		//System.out.println(cloth.clothes[1].color);
		
		for(int i = cloth.clothes.length -1; ; i-- )
		{
			System.out.println(cloth.pop().color);
		}
		
		
		//System.out.println("Pick " + cloth.pick());
	}

}
