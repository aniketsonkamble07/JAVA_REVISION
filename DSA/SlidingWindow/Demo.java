import java.util.*;
public class Demo
{
    public static void main(String[] args)
	{
		int[] arr={1,4,5,2,3,6,1,5};
		int k=3;
		System.out.println(maxSum(arr, k));
	}
	public static int maxSum(int[] arr, int k)
	{
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n-k;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum=sum+arr[j];
			}
             if(sum>max)
             {
				 max=sum;
			 }				 
		}
		return max;
	}
}