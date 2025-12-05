public class InsertionSort
{
	
	public static void main(String[] args)
	{
	int[] arr={4,3,2,1,7};
	System.out.println("Before Sorting");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " \t");
	}
	
	for(int i=1;i<arr.length;i++)
	{
		int key=arr[i];
		int  index=i-1;
		while(index>=0 && key<arr[index] )
		{
			arr[index+1]=arr[index];
			index--;
		}
		
		/*
		// reverse for-loop (works like while loop)
           for (j = i - 1; j >= 0 && arr[j] > key; j--)
		   {
              arr[j + 1] = arr[j];
           }
		   arr[j + 1] = arr[j];
	    */
		arr[index+1]=key;
	}
	
	System.out.println("After Sorting");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " \t");
	}
	}
	
}