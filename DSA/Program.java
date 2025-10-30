import java.util.*;
public class Program
{
	public static void main(String[] args)
	{
		int[] arr={10,2,5,3,7,2,5,6,8};
		int sum=0;
		System.out.println("Array elements are:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
			sum+=arr[i];
		}
	
System.out.println("\nSum of Elements: "+sum);	
  findMax(arr);
  shiftZero();
	}
	
	public static void findMax(int[] arr)
	{
		int maxLen = 0, sum = 0, l = 0,r=0;
		int k=17;
		int startindex=0, endIndex=0;
		
		while(r<arr.length)
		{
			sum=sum+arr[r];
			if(sum<=k && (r-l+1)>maxLen)
			{
				maxLen=(r-l+1);
				startindex=l;
				endIndex=r;	
			}
			r++;
			while(sum>k && l<=r)
			{
				sum=sum-arr[l];
				l++;
			}
		}
		
		
		
		System.out.println("Max:"+maxLen);
		System.out.println("Sub Array");
		for(int i=startindex;i<=endIndex;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		
	}
	
	public static void maxSum(int[] arr, int k)
	{
		int l=0;
		int r=arr.length;
		int sum=0;
		int maxSum=0;
		sum=0;
		int leftSum=0;
		int rightSum=0;
		
		for(int i=0;i<k;i++)
		{
			leftSum+=arr[i];
		}
		l=k-1;
		r=arr.length-1;
		maxSum=leftSum;
		
		for(int i=0;i<k;i++)
		{
			leftSum-=arr[l--];
			rightSum=+arr[r++];
			maxSum=Math.max(maxSum, rightSum+leftSum);
		}
		System.out.println(maxSum);
	}	
	
	
	public static void shiftZero()
	{
		int[] arr={0,1,2,3,0,3,0,0,3,4,5,8};
		int l=0;
		int r=arr.length-1;
		int temp=0;
		while(l<r)
		{
			if(arr[l]==0 && arr[r]!=0)
			{
				temp=arr[r];
				arr[r]=0;
				arr[l]=temp;
				r--;
			}
			l++;
			
		}
		
		System.out.println("\nAfter shifting");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}