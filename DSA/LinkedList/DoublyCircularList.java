public class DoublyCircularList
{
	class Node 
	{
		Node next;
		Node prev;
		int data;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		
	}
	Node head;
	Node tail;
	
	public void addFirst(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			head.next=newNode;
			tail=newNode;
			tail.prev=newNode;
			tail.next=head;
			return ;
			
		}
		newNode.next=head;
		newNode.prev=tail;
		head.prev=newNode;
		
		tail.next=newNode;
		head=newNode;
		
	}
	
	public void addLast(int data)
	{
		Node newNode =new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			head.next=head;
			head.prev=head;
			tail.next=head;
			
			return;
		}
		
		newNode.prev=tail;
		newNode.next=head;
		tail.next=newNode;
		head.prev=newNode;
		tail=newNode;
		
	}

	public void display()
	{
		Node current=head;
		do
	{
		System.out.println(current.data+ " -> ");
		current=current.next;
	} while(current!=head);
	}
}