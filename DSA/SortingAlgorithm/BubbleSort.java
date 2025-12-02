public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] arr={10,8,7,12,1};
		System.out.println("Before Sorting array Elements Are: ");
		display(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			System.out.println("\nAfter pass " + (i+1) + ": ");
            display(arr);
		}
	}
	
	
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" \t");
		}
	}
	
	public static void InsertionSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>0 && arr[j+1]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	
}