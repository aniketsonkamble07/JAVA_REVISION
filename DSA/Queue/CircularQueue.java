public class CircularQueue
{
	static int size;
	static int[] arr;
	static int front;
	static int rear;
	
	public CircularQueue(int size)
	{
		this.size=size;
		arr=new int[size];
		front=-1;
		rear=-1;
		
	}
	
	public static void main(String[] args)
	{
		
	}
	public static void endueue(int data)
	{
		if((rear+1)%size==front)
		{
			System.out.println("Queue is full");
			return;
		}
		if(front==-1)
		{
			front=0;
		}
		rear=(rear+1)%size;
		arr[rear]=data;
		
	}
	
	public static int dequeue()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");	
		 return -1;
		}
		int value=arr[front];
		if(front==rear)
		{
			front=rear=-1;
		}
		else
		{
			front=(front+1)%size;
		}
		return value;
	}
	
	public static int peak()
	{
		
	}
}