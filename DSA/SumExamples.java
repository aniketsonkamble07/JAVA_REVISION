public class SumExamples
{
	public static void main(String[] args)
	{
		
		methodOne();
	}
	public static void methodOne()
	{
		int[] arr={1,5,7,8,3};
		int target=10;
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i+1;j<arr.length;j++)
			{
				int a=arr[i];
				int b=arr[j];
				sum=a+b;
				if(sum==target)
				{
				System.out.println("value 1: "+ a + " Value 2: "+ b);
break;				
				}
			}
		}
	}
	
	
	public static void methodTwo()
	{
		int[] arr={1,5,7,8,3};
		int target=10;
		HashMap<Integer, Integer> m1=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			m1.put(arr[i], arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int value=target-arr[i];
			if(m1.containsKey(value))
			{
				System.out.println("Value 1 : "+ arr[i]+ " Value 2 : "+ value);
				break;
			}
			
		}
	}
}