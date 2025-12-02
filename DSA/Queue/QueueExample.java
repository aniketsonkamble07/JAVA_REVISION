import java.util.*;
class QueueExample
{
	static int size=10;
	static int[] arr=new int[size];
	static int front=0;
	static int rear=-1;
	public static void main(String[] args)
	{
	 	enqueue(10);
		enqueue(20);
		enqueue(30);
		System.out.println(peak());
		System.out.println(dequeue());
		System.out.println(peak());

	}
	
	public static void enqueue(int data)
	{
		if(front==size-1)
		{
			System.out.println("Queue is full");
			return ;
		}
		rear++;
		arr[rear]=data;
		
	}
	public static int dequeue()
    {
		if(front>rear )
		{
			System.out.println("Queue is empty");
			return -1;
		}
		int value= arr[front];
		front++;
		return value;
	}
	public static int peak()
	{
		if(front>rear)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		return arr[front];
	}
}