public class LoopExamples
{
	public static void main(String[] args)
	{
		int[] arr={10,2,4,1,6,52,13,75,3,5,67,33,28};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " \t");
			
		}
		System.out.println("\nOdd Numbers are :");
			oddList(arr);
			
			System.out.println("Even Number are :");
			evenList(arr);
			System.out.println("Min of Array: "+ minValue(arr));
	}
	
	
	public static void oddList(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+ " \t");
			}
		}
		System.out.println();
	}
	public static void evenList(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+ " \t");
			}
		}
		System.out.println();
	}
	public static int minValue(int[] arr)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
}