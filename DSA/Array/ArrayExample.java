public class ArrayExample
{
	public static void main(String[] args)
	{
		int[] arr={1,4,5,7,3,5,8,2,4,1};
		int[] arr2={0,4,0,5,71, 0, 78,0,0};
		int key=12;
		subArray(arr, key);
		shiftZero(arr2);
	}
	
	public static void subArray(int[] arr , int key)
	{
		int i=0;
		int j=0;
		int sum=0;
		int max=0;
		int start=0;
		int end=0;
		
		while(i<arr.length)
		{
			
				sum=sum+arr[i];
				
			
			while(sum>key && j<i)
			{
				sum=sum-arr[j];
				j++;
			}
           if(sum>max && sum<key)
		   {
			   max=sum;
			   start=j;
			   end=i;
		   }
          i++;		   
		}
		
		
		for(int k=start;k<end;k++)
		{
			System.out.print(arr[k] + "\t");
			
		}
		
	}
	
	public static void shiftZero(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		
		while(i<j)
		{
			if(arr[i]==0 && arr[j]!=0)
			{
				arr[i]=arr[j];
				arr[j]=0;
				i++;
				j--;
			}
			else if(arr[j]==0)
			{
				j--;
			}
			else
			{
				i++;
			}
			
		}
		
		System.out.println("\n After shifting Zero ");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+ "\t");
		}
	}
	
	public static void findDuplicate(int[] arr)
	{
		int j;
		int k=0;
		for(int i=0;i<arr.length-1;i++)
		{
			j=i+1;
			if(arr[i]==arr[j])
			{
				while(j<arr.length-1-k)
				{
					arr[j]=arr[j+1];
					j++;
				}
				k++;
			}
		}
	}
}