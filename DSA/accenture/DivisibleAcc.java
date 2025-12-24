public class DivisibleAcc
{
	public static void main(String[] args)
	{
		System.out.println(diff(20,4));
	}
	public static int diff(int m, int n)
	{
		int divSum=0;
		int notDivSum=0;
		
		for(int i=1;i<=m;i++)
		{
			if(i%n==0)
			{
				divSum=divSum+i;
			}
			else
			{
				notDivSum=notDivSum+i;
			}
		}
		return notDivSum-divSum;
	}
}