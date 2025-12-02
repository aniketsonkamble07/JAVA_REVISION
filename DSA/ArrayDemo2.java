public class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[] arr={1,3,5,8};
		int target =4;
		int  ans=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<= target && arr[i]>=ans)
			{
				ans=arr[i];
				
			}
		}
		
		System.out.println(ans);
	}
}