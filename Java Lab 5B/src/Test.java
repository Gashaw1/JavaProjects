
public class Test {

	public static void main(String[] args)
	{
        ClothStack clothStack = new ClothStack();	
		
		clothStack.push(new Cloth("Green", "Shirt", true));
		clothStack.push(new Cloth("Yellow", "Jenes", false));
		clothStack.push(new Cloth("Red", "Cot", true));		
		
		
		
		clothStack.ReuturnAllItem();
		System.out.println();
		clothStack.countWashedAtHighTempItem();
		System.out.println();
		
		Cloth cloth = new Cloth();
		
		cloth = clothStack.pop();
		System.out.println("\nPop operation  " + cloth.Name + "  " + cloth.color + "  " + cloth.WashInHighTemp);
		
		cloth = clothStack.peek();	
		System.out.println("\nPeek operation  " + cloth.Name + "  " + cloth.color + "  " + cloth.WashInHighTemp);
		
		
		
		

	}

}
