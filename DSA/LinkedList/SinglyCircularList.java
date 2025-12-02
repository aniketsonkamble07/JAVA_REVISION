public class SinglyCircularList
{
   class Node
   {
	   Node next;
	   int data;
	   
	   public Node(int data)
	   {
		   this.next=null;
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
		   tail.next=head;
		   return ;
	   }
	   newNode.next=head;
	   head=newNode;
	   tail.next=head;
   }
   
   public void display()
   {
	   if(head==null)
	   {
		   System.out.println("List is Empty");
		   return ;
	   }
	  Node current = head;
	  // while(current.next != head) Skips the last node (tail)
		  
     do 
	 {
        System.out.println(current.data + " -> ");
        current = current.next;
     } while(current != head);

	  /*
	   while (true) {
        System.out.print(current.data + " -> ");
        current = current.next;

        if (current == head) break;
    }
    System.out.println("HEAD");
      */	  
   }
   
   public void addLast(int data)
   {
	   Node newNode=new Node(data);
	   if(head==null)
	   {
		   head=newNode;
		   tail=newNode;
		   tail.next=head;
		   return ;
	   }
	    newNode.next=head;
		tail.next=newNode;
		tail=newNode;
   }
}