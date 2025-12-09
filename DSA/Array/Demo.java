import java.util.*;

public class Demo
{
	public static void main(String[] args)
	{
		int[] arr={1,0,4,2,7,5,6,8};
		int value=1;
		subArray(arr, value);
	}
	public static void subArray(int[] arr, int value)
	{
		int sum;
		int start=0;
		int end=0;
		int j;
		int maxLen=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum>=value)
				{
					if(j-i+1>maxLen)
					{
						start=i;
						end=j;
					}
					
				}
			}			
		}
		
		System.out.println("arra elements are");
		sum=0;
		for(int i=start;i<end;i++)
		{
			System.out.print(arr[i]+"\t");
			sum+=arr[i];
		}
		System.out.println("\n Sum= "+sum);
	}
}