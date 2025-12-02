public class StackExample
{
	static int size=10;
	static int top=-1;
	public static int[] arr=new int[size];
	
	public static void main(String[] args)
	{

		System.out.println("Peek Elements: "+ peek());
		
		
	}
	public static int peek()
	{
		if(arr.length==0)
		{
			return 0;
		}
		
		return arr[arr.length-1];
	}
	public static int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
			return -1;
		}
		int popped= arr[top];
		top--;
		return popped;
		
	}
	
	public static void push(int data)
	{
		if(top==size-1)
		{
			System.out.println("Stack is overflow");
			return;
		}
		top++;
		arr[top]=data;
	}
}