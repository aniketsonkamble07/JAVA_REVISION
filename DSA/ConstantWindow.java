public class ConstantWindow
{
	public static void main(String[] args)
	{
		int[] arr={1,2,-1,8,4,6,9,4,1,2};
		method1(arr);
		method2(arr);
		subArray(arr);
	}
	public static void method1(int[] arr)
	{
	    int maxSum=0;
		int start=0;
		int end=0;
		int k=4;
		
		for(int i=0;i<=arr.length-k;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum+=arr[j];
				
			}	
			if(sum>maxSum)
				{
					maxSum=sum;
					start=i;
					end=i+k-1;
				}
		}
		System.out.println("Max Sum= "+ maxSum);
		for(int i=start;i<=end;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}	
	
	public static void method2(int[] arr)
	{
		int k=4;
		int maxSum=0;
		int start=0;
		int end=k-1;
		int maxStart=0;
		int maxEnd=0;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
		}
		maxSum=Math.max(maxSum,sum);
		
		while(end<arr.length-1)
		{
			sum-=arr[start];
			start++;
			sum+=arr[end];
			end++;
			if(sum>maxSum)
			{
				maxStart=start;
				maxEnd=end;
			}
		}
		for(int i=maxStart;i<=maxEnd;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		
	}
	
	public static void subArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("[");
			for(int j=i;j<arr.length;j++)
			{
				System.out.print(arr[j]+"\t");
			}
			System.out.println("]");
		}
	}
}