import java.util.*;
class Demo
{
public static void main(String[] args)
{
	System.out.println("This is trial ");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ");
	int a= sc.nextInt();
	System.out.println("Value: "+a);
	
	System.out.println("for loop");
	for(int i=0;i<5;i++)
	{
		
		System.out.println("Loop :"+i);
	}
	
	int[] arr={10,30,20,40,50,60,89};
	System.out.println("foeach loop");
	for(int value : arr)
	{
		System.out.println("foreach loop :"+value);
	}
	for(int val : arr)
	{
		System.out.println("Loop");
	}
	
	int num=0;
	while(num!=10)
	{	
		System.out.println("while loop"+num);
		num++;
	}
}
}