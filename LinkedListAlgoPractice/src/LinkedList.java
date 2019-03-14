
public class LinkedList {
	
	Node Head;

	public LinkedList()
	{
		Head = null;
	}
	
	public void append(int data)
	{
		if(Head == null)
		{
			
			Head = new Node(data);
			System.out.println("null node checked " + Head.data );
		}
		
		Node currentNode = Head;
		
		System.out.println("currentNode. next " + currentNode.next );

		while(currentNode.next != null) 
		{
			System.out.println("in whilde currentNode. next " + currentNode.next );

			currentNode = currentNode.next;
			
			System.out.println("currentNode " + currentNode );
		}
		currentNode.next = new Node(data);
		
		System.out.println("currentNode.next " + currentNode.next );
		
	}
}
