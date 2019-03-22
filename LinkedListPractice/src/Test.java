

class Node
{
	int id;
	String name;
	Node next;
	
	public Node(int id, String name)
	{
		this.id = id;
		this.name = name;
		next = null;
	}
}

class LinkedList
{
	Node head;
	
	public void append(int id, String name)
	{
		if(head ==null)
		{
			head = new Node(id, name);
		}
		
		Node currentNode = head;
		
		while(currentNode.next != null)
		{
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(id, name);	
		
	}
	
	public void prePand(int id, String name)
	{
		if(head == null)
		{
			head = new Node(id, name);
		}
		Node newNode = new Node(id, name);
		newNode.next = head;
		head = newNode;
		
	}
	
	public void DisplayAll()
	{
	
		while(head.next !=null)
		{
			System.out.println("all "+ head.next.id);
			head = head.next;
		}
	}
	public void currentNode()
	{
		if(head != null)
		{
			System.out.println("currentn ode " + head.id);
			System.out.println("currentn ode " + head.next.id);
		}
	}
	public void GetById(int id)
	{
		if(head != null)
		{
			while(head.id != id)
			{
				head = head.next;
			}	
			
		  System.out.println(id + "  :  "  + head.name);
		}
	}
}
public class Test 
{

	public static void main(String[] args)
	{
		
		
		System.out.println();
		System.out.println();
		
        LinkedList link = new LinkedList();
		
		link.append(1, "A");
		link.append(2, "B");
		link.append(3, "c");
		link.append(4, "D");
		link.prePand(5, "F");
		
		
		
		
		
		link.DisplayAll();		
		System.out.println();
		link.currentNode();
		
		link.GetById(5);
		//System.out.println(link);
		
		//System.out.println(link.head.id);
		//System.out.println(link.head.next.id);
		//System.out.println(link.head.next.next.id);
		//System.out.println(link.head.next.next.next.id);
		//System.out.println(link.head.next.next.next.next.id);
		//System.out.println(link.head.next.next.next.next.id);
		
	}

}
