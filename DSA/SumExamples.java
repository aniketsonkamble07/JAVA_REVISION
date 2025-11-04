public class SumExamples
{
	public static void main(String[] args)
	{
		int[] arr={1,5,7,8,3};
		int target=10;
		
		methodOne(arr, target);
	}
	public static void methodOne(int[] arr, int target)
	{
		
		
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
	
	
	public static void methodTwo(int[] arr, int target)
	{
		
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
	
	public static boolean methodThree(int[] arr, int target)
	{
	Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
         while(l<r)
		 {
			 int sum=l+r;
			 if(sum==target)
			 {
				 return true;
			 }
			 else if( sum > target)
			 {
				 r--;
			 }
			 else{
				 l++;
			 }
		 }	
return false;		 
	}
	public static void Sum3(int[] arr, int target)
	{
		for(int i=0;i<arr.length-3;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length-3;j++)
			{
				sum=arr[i]+arr[i+1]+arr[i+2];
				if(sum==target)
				{
					System.out.println("Value 1 : "+ arr[i]+ " Value 2 : "+ arr[i+1]+ "Value 3: "+ arr[i+2]);
					break;
				}
			}
		}
		
	}
	
	
}
