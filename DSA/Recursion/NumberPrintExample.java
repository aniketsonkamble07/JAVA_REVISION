public class NumberPrintExample
{
	public static void main(String[] args)
	{
		System.out.println("Descending order");
		printNumderDesc(5);
		System.out.println("Ascending Order");
		printNumder(5);
		
		System.out.println("Factoral of 5 = "+ factorial(5));
		System.out.println("Sum of Digit is = "+ sumOfDigit(1234));
	}
	
	public static void printNumderDesc(int num)
	{
		if(num==0)
		{
			
			return ;
		}
		
		System.out.println(num);
		printNumderDesc(num-1);
	}
	
	public static void printNumder(int num)
	{
		if(num==0)
		{
			return ;
		}
		printNumder(num-1);
		System.out.println(num);
		
	}
	
	public static int factorial(int num)
	{
		if(num==1)
			return 1;
		return num * factorial(num-1);
	}
	
	public static int sumOfDigit(int num)
	{
		if(num<10)
			return num;
		//int r=num%10;
		//return  r+ sumOfDigit(num/10);
		return num%10+ sumOfDigit(num/10);
	}
	
	/*
	Concept printNumder(n--)   infinite loop because n-- assign first and then assign 
	printNumder(--n) substract first and then assign
	*/
	
	public static int reverse(int n)
	{
		int digits=(int)Math.log10(n)+1;
		return helper(n, digits);
	}
	public static int helper(int n, int digits)
	{
		if(n%10 ==n)
		{
			return n;
		}
		int rem=n%10;
		return rem* (int)Math.pow(10, digits-1)+ helper(n/10, digits-1);
	}
	/*
	class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        x = Math.abs(x);

        int digit = (x == 0) ? 1 : (int) Math.log10(x) + 1;

        long ans = helper(x, digit);

        if (negative) ans = -ans;

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;

        return (int) ans;
    }

    public long helper(int x, int digit) {
        if (x == 0)
            return 0;

        int rem = x % 10;
        return rem * (long) Math.pow(10, digit - 1)
                + helper(x / 10, digit - 1);
    }
}
*/
	
	public static int countZero(int n, int c)
	{
		return helperCount(n,0);
	}	
	public static int helperCount(int n, int c)
	{
		if(n==0)
		{
			return c;
		}
		if(n%10==0)
		{
			return helperCount(n/10,c+1);
		}
		
			return helperCount(n/10, c);
		
	}
	
	public static int countStep(int n)
	{
		return helperStepCount(n, 0);
	}
	
	public static int helperStepCount(int n, int steps)
	{
		if(num==0)
		{
			return steps;
		}
		if(n%2==0)
		{
			return helperStepCount(n/2, steps+1);
		}
		return helperStepCount(n-1, steps+1);
	}
}