class DoublyLinkedList
{
	class Node
	{
	   private	Node next;
       private Node prev;
       int data;
       public Node(int data)
	   {
		   this.next=null;
		   this.prev=null;
		   this.data=data;
		   
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
			tail=newNode;
			return ;
		}
		newNode.next=head;
		newNode.prev=head;
		head=newNode;	
	}
	
	public void addLast(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			return ;
		}
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
	}
	
	public void addPosition(int data, int position)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		if(position==1)
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			return;
		}
		Node current=head;
		int count=1;
		while(current.next!=null && count<position-1)
		{
			current=current.next;
			count++;
		}
		// Case 3 — Position is greater than list length → add at end
        if (current == tail || current == null) 
		{
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        return;
        }
		newNode.next=current.next;
		newNode.prev=current;
		
		current.next.prev=newNode;
		current.next=newNode;
	}
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return ;
		}
		if(head.next==null)
		{
			head=null;
			tail=null;
			return ;
		}
		head = head.next;
        head.prev = null;
	}
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return ;
		}
		
		if(head.next==null)
		{
			head=null;
			tail=null;
			return;
		}
		tail.prev.next=null;
		tail=tail.prev;
		
	}
	
	public void deletePosition(int position) 
	{
    if (head == null) 
	{
        System.out.println("List is Empty");
        return;
    }

    // Delete first
    if (position == 1) 
	{
        if (head == tail) 
		{ // only 1 node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return;
    }

    Node current = head;
    int count = 1;

    while (current != null && count < position) 
	{
        current = current.next;
        count++;
    }

    if (current == null) 
	{
        System.out.println("Invalid position");
        return;
    }

    // If last node
    if (current == tail) 
	{
        tail = tail.prev;
        tail.next = null;
        return;
    }

    // Middle node
    current.prev.next = current.next;
    current.next.prev = current.prev;
}

}