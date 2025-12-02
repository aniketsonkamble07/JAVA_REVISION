import java.util.*;
public class FactorialNumer
{
	public static void main(String[] args)
	{
		System.out.println(fact(5));
		System.out.println(sum(12345));   
		System.out.println(digitProduct(12045));
		System.out.println(reverseNumber(12345));
		static int sum=0;
		
	}
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n * fact(n-1);
	}
	
	public static int sum(int num)
	{
		if(num%num==num)
		{
			return num;
		}
		
		return (num%10)+ sum(num/10);
	}
	
	public static int digitProduct(int num)
	{
		if(num==0)
		{
			return 1;
		}
		
		return (num%10)* digitProduct(num/10);
	}
	
	public static int reverseNumber(int num)
	{
		if(num<10)
		{
			return num;
		}
	sum=sum*10+(num%10);
		return  reverseNumber(num/10);
	}
}
