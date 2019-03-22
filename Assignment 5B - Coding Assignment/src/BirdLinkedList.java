import java.util.LinkedList;

class Birds
{
	String species ;
	public Birds(String species)
	{
		this.species = species;
	}
}
public class BirdLinkedList
{
	LinkedList<Birds> birdList = new LinkedList<Birds>();
	
	public void add(Birds bird)
	{
		birdList.add(bird);
		
		System.out.println(bird.species + " Add to the list");
	}
	
	public void PrintRport()
	{
		for(int i= 0; i< birdList.size()-1; i ++)
		{
			String name = birdList.get(i).species ;
		    int count =  Count(name);
		    
		    System.out.println(name + "  " + count);
		}
	}
	public int Count(String species )
	{
		LinkedList<Birds> myList = birdList;
		
		int counter = 0;
		for (int i = 0; i <= myList.size()-1; i++) 
		{
			if (myList.get(i).species  == species ) {
				counter += 1;					
			}
		}
		for(int j = 0; j < myList.size()-1; j ++)
		{
			if(myList.get(j).species == species)
			{
				myList.remove(j);
			}
		}
		return counter;
		
	}

	public static void main(String[] args)
	{
			
		BirdLinkedList br = new BirdLinkedList();
		
		br.add(new Birds("Turkey"));
		br.add(new Birds("Turkey"));
		br.add(new Birds("Eagle"));
		br.add(new Birds("Heron"));
	
		br.add(new Birds("Turkey"));
		br.add(new Birds("Eagle"));
		br.add(new Birds("Heron"));
		br.add(new Birds("Owl"));
		br.add(new Birds("Owl"));
		br.add(new Birds("Heron"));
		
		System.out.println();
		System.out.println("Report");
		br.PrintRport();


	}

}
