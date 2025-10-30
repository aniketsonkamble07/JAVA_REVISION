import java.util.*;
import java.lang.Math;
public class SubArrayExample
{
	public static void main(String[] args)
	{
		int[] arr={1,2,5,4,3,2,6,5,78,12};
		int target=9;
		System.out.println("Printing sub array");
		method1(arr);
		method2(arr,target);
		method3(arr, target);
		int k=4;
		method4(arr,k);
	}
	public static void method1(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("\n[");
			for(int j=i;j<arr.length;j++)
			{
				System.out.print(arr[j]+",");
			}
			System.out.println("]");
		}
	}
	
	public static void method2(int[] arr, int target)
	{
		int maxLength=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				if(sum==target)
				{
					maxLength=Math.max(maxLength, j-i+1);
					break;
				}
			}
		}
		System.out.println("\n Max Length= "+maxLength);
		
	}
	
	public static void method3(int[] arr, int target)
{
    int i = 0, j = 0;
    int sum = 0;
    int maxLength = 0;

    while (j < arr.length)
    {
        sum += arr[j];

        // Shrink the window if sum exceeds the target
        while (sum > target && i <= j)
        {
            sum -= arr[i];
            i++;
        }

        // Check if current window equals the target
        if (sum == target)
        {
            maxLength = Math.max(maxLength, j - i + 1);
        }

        j++;
    }

    System.out.println("Max Length = " + maxLength);
}

public static void method4(int[] arr,int k)
{
	int l=k;
	int r=arr.length;
	
	while(l>=0)
	{
		for(int i=0;i<4;i++)
		{
			System.out.print(arr[l]);
			
			System.out.print(arr[r]);
			l--;
			r--;
		}
	}
}
}