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
		for(int i=3;i<=100;i++)
		{
		for(int j=2;j<=i;j++)
		{
			if(i %j!=0)
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
	
	public static int[] subArray()
	{
		int[] arr={1,2,4,6,5,4,8,7,2};
		int target=16;
		int start=0;
		int sum=0;
		for(int end=0;end<arr.length;end++)
		{
			while(sum>target && start<=end)
			{
				sum-=arr[start];
				start++;
			}
			if(target==sum)
			{
				int[] result=new int[end-start+1];
				for(int i=0;i<result.length;i++)
				{
					result[i]=arr[start+i];
				}
				return result;
			}
		}
		return new int[]{};
	}
	
	public static void subArray2(int target)
	{
		int[] arr={1,2,4,6,5,4,8,7,2};
		
      for(int i=0;i<arr.length;i++)
	  {
		  int sum=0;
		  for(int j=i;j<arr.length;j++)
		  {
			  sum=arr[j];
			  if(sum==target)
			  {
				  System.out.println("Length="+j-i+1);
				  return;
			  }
			  else if( sum>target)
			  {
				  target;
			  }
		  }
	  }
	}
}