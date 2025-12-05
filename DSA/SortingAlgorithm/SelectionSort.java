public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] arr={4,3,2,1,8,10,7};
		int min;
		for(int i=0;i<arr.length;i++)
		{
			min=arr[i];
			
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<=min)
				{
					int temp=min;
					min=arr[j];
					arr[j]=temp;
				}
			}
			arr[i]=min;
		}
		
	System.out.println("After Sorting");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " \t");
	}
	}
}