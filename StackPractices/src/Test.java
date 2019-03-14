
public class Test {

	public static void main(String[] args)
	{
		
		ClothStack clothStack = new ClothStack();
	
		clothStack.clothes = new Cloth[16];
		
		clothStack.push(new Cloth("Green", "Shirt", true));
		clothStack.push(new Cloth("Yellow", "Jenes", false));
		clothStack.push(new Cloth("Red", "Cot", false));		
		
		//System.out.println("Stack TopIndex " + clothStack.topIndex);
		for(int i = 0; i < clothStack.clothes.length; i ++)
		{
			Cloth cloth = clothStack.pop();
			if(clothStack.clothes[i] != null)
			{			
				System.out.println("Name " + cloth.Name
						+ "\n Color:  " + cloth.color 
						+ "\n Is washed in hight Temp " + cloth.WashInHighTemp + "\n");
			}
			else
			{
				break;
			}
			
		}
		
		
		System.out.println("Stack length " + clothStack.clothes.length);
		
		System.out.println("Stack Empty " + clothStack.IsEmpty());
		System.out.println("Stack Top index " + clothStack.topIndex);
	}

}
