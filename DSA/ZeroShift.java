public class ZeroShift
{
	public static void main(String[] args)
	{
		int[] arr={1,0,3,2,0,0,4,85,7,0,10};
		
	}
	public static void shiftEnd(int[] arr)
	{
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			if(arr[l]==0 && arr[r]  )
			{
				int temp=arr[r];
				arr[r]=0;
				arr[l]=temp;
				r--;
			}
			else if(arr[r]==0)
			{
				r--;
			}
			else
			{
			 l++;
			}
		}
	}
	
	public static void shiftStart(int[] arr)
	{
		int l=0;
		int r=arr.length-1;
		while(r>l)
		{
			if(arr[r]==0 && arr[l]!=0)
			{
				int temp=arr[l];
				arr[l]=0;
				arr[r]=temp;
				l++;
				r--;
			}
			else if(arr[l]==0)
			{
				l++;
			}
			else{
				r--;
			}
		}
	}
	
	public static void union()
	{
		int[] arr1={1,1,2,3,4,5};
		int[] arr2={2,3,4,6};
		Set<Integer> s=new HashSet<>();
		
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]<=arr[j])
			}
		}
	
          	
	}
}