class Node 
{
	int data;
	Node next;
	public Node(int data)
	{
		this.next=null;
		this.data=data;
	}
}

public class SinglyLinkedListExample
{
    private Node head;
    private Node tail;	
	Node temp=head;
	while(temp.next!=null)
	{
		System.out.println(temp.data+" ->");
		temp=temp.next;
	}
	System.out.println("null");
	
	public void addFirst(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node tail=head;   // it will take O(n) time to reach end decalare tail in Node class  
		while(tail.next!=null)
		{
			tail=tail.next;
		}
		tail.next=newNode;
		
	}
	
	public void addPosition(int data, int position)
	{
		Node newNode=new Node(data);
		private Node current=head;
		if (position == 1 || head == null)
		{
        newNode.next = head;
        head = newNode;
        return;
        }
	    int count=0;
		while(current!=null && count<position-1)
		{
			current=tail.next;
			count++;
		}
		if (current == null) 
		{
        System.out.println("Position is greater than list size! Inserting at end.");
        return;
    }
	
		newNode.next=current.next;
		current.next=newNode;
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		head=head.next;
		if(head==null)
		{
			tail=null;
		}		
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		if(head.next=null)
		{
			head=null;
			tail=null;
			return;
		}
		private Node current=head;
		
		while(current.next!=tail)
		{
			current=current.next;
		}
		current.next=null;
		tail=current;
	}
	
	public void deletePosition(int position)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return ;
		}
		if(head.next==null && position==1)
		{
			head=null;
			tail=null;
			return ;
		}
		
		 Node current=head;
		 int count=1;
		while(current.next!=null && count<position-1)
		{
			current=current.next;
			count++;
		}
		
		if(current.next==null)
		{
			System.out.println("Invalid position");
			return ;
		}
		if(current.next==tail)
		{
			current.next=null;
			tail=current;
		}
		current.next=current.next;
		
	}
}