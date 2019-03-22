
public class BirdLinkedList 
{
	Bird head;	

	BirdLinkedList()
	{
		head = null;
	}
	public void add(String  bird)
	{
		if(head == null)
		{
			head = new Bird(bird);
			head.next = head;
		
			System.out.println(head.next);
		}
		
		Bird currentNodeBird = head;
		
		while(currentNodeBird != null)
		{
			currentNodeBird = currentNodeBird.next;
		}
		System.out.println(currentNodeBird.next);	
		currentNodeBird.next = new Bird(bird);
	
		System.out.println(currentNodeBird.next);	
		
	}
}
