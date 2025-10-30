public class Demo
{
	public static void main(String[] args)
	{
		Child c=new Child();
		
		if(isPrime(19))
		{
			System.out.println("Number is prime");
		}
		else
		{
		  System.out.println("Number is not prime");
		}
		
		factorialNummer(5);
		factorialNummer(5);
	}
	public static void ReverseNumber()
	{
		int number=1234;
		int temp=0;
		int sum=0;
		while(number!=0)
		{
		 temp=number%10;
		sum=sum*10+temp;
		number=number/10;
		}
		System.out.println("Reversed number="+ sum);
	}
	public static boolean isPrime(int num)
	{
		boolean flage=true;
		for(int i=2;i<num;i++)
		{
			if(num % i==0)
			{
				return false;
				
			}
		}
		return true;
	}
	public static void factorialNummer(int num)
	{
		int sum=1;
		for(int i=1;i<=num;i++)
		{
			sum=sum* i;
		}
		System.out.println("Factorial of "+ num + " is :"+ sum);
	}
	
	public static void findPrime(int target)
	{
		boolean flage=true;
		int count=0;
		for(int i=0;i<=100;i++)
		{
			if(num %i!=0)
			{
				count++;
			}
			if(count==target)
			{
				System.out.println(target +"th Prime number : "+ i);
				return;
			}
		}
	}
}