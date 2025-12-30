public class StackImpl 
{

    private int[] stack;
    private int top;

    public StackImpl(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int data) 
	{
        if (top == stack.length - 1) 
		{
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    public int pop() 
	{
        if (top == -1) 
		{
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() 
	{
        if (top == -1) 
		{
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
}
