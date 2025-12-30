import java.util.*;
public class FabnacciSeries
{
	public static int N;
	public static int[] dpArray;
	public static int EMPTY=-1;
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		N=sc.nextInt();
		dpArray=new int[N+1];
		
		Arrays.fill(dpArray, EMPTY);
		for(int i=0;i<=5;i++)
		{
		  System.out.println(FabnacciFun(i));
		}
	}
	public static int FabnacciFun(int n)
	{
		if(dpArray[n]!=EMPTY)
		{
			return dpArray[n];
		}
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return dpArray[n]= FabnacciFun(n-1)+FabnacciFun(n-2);
		
	}
}