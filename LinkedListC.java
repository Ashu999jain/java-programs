class Node
{
int data;
Node next;
Node(int data)
{
	this.data = data;
	next = null;
}
}
class LinkedListC
{
	public  static Node insert(int data, Node head)
	{
		Node k = new Node(data);
		if(head == null)
			head = k;
		 else
		 {			 
			 Node c = head;
		     while(c.next!= null)
				 c = c.next;
			 c.next = k;
		 }
		 Node start = head;
		 return(start);
	}
	
	public static void show(Node k)
	{
		while(k!=null)
		{
			System.out.println(k.data);
			k= k.next;
		}
		
	}
	
	
	public static void main(String []args)
	{Node head = null;
		for (int i=0;i<4;i++)
		{
			
		head =	insert(i,head);
		System.out.println("after  loop");
		show(head);
		}
	}
}