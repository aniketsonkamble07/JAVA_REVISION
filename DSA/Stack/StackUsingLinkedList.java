import java.util.LinkedList;

public class StackUsingLinkedList 
{

    private LinkedList<Integer> list;

    public StackUsingLinkedList() 
	{
        list = new LinkedList<>();
    }

    public void push(int data) {
        list.addFirst(data);   // push
    }

    public int pop() 
	{
        if (list.isEmpty()) 
		{
            System.out.println("Stack Underflow");
            return -1;
        }
        return list.removeFirst();  // pop
    }

    public int peek() 
	{
        if (list.isEmpty()) 
		{
            System.out.println("Stack is Empty");
            return -1;
        }
        return list.getFirst(); // peek
    }

    public boolean isEmpty() 
	{
        return list.isEmpty();
    }
}
