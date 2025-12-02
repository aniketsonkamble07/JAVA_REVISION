import java.util.*;
public class SubArray
{
	public static void main(String[] args)
	{
		int[] arr={1,3,2,5,4,7,8};
		int k=14;
		System.out.println(findMaxLength(arr,k));
		
	}
	public static int findMaxLength(int[] arr, int k)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				if(sum>k)
				{
					break;
				}
				max=Math.max(max, j-i+1);
			}
		}
		
		return max;
	}
}