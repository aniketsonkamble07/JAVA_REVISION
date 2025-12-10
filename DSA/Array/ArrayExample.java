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
	// sored array
	public static void findDuplicate(int[] arr)
	{
		int n=arr.length;
		int i=0;
		while(i<n-1)
		{
			if(arr[i]==arr[i+1])
			{
				for(int j=i+1;j<n-1;j++)
				{
					arr[j]=arr[j+1];
					
				}
				n--;
			}
			else
			{
				i++;
			}
		}
	}
	
	public static int removeUnsortedDuplicate(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]==arr[j+1])
				{
				   for (int k = j; k < n - 1; k++) 
				   {
                     arr[k] = arr[k + 1];
                    }
                n--;
                j--;
				}
			}
		}
		return n;
	}
	
	public static void removeDuplicateSet(int[] arr)
	{
		 Set<Integer> set = new HashSet<>();

    for (int i = 0; i < arr.length; i++) 
	{
        set.add(arr[i]);
    }

    // convert Set<Integer> to int[]
    int[] result = new int[set.size()];
    int index = 0;

    for (int value : set) 
	{
        result[index++] = value;
    }

    return result;
		
	}
	
	public static void reverseArray(int[] arr)
	{
		int[] newArr=new int[arr.length];
		int index=0;
		for(int  i=arr.length-1;i>=0;i--)
		{
			newArr[index]=arr[i];
			index++;
		}
	}
	
	public static void reverseArray2(int[] arr)
	{
		int j=arr.length-1;
		int i=0;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	
	public static boolean isSorted(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	public static void abc(int[] arr, int value)
	{
		int sum;
		int start=0;
		int end=0;
		int j;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			
			sum=0;
			j=i;
			while(sum<value && j< arr.length)
			{
				sum=sum+arr[j];
				j++;
			}
			if(max<j-i+1)
			{
				max=j-i+1;
				start=i;
				end=j;
			}
		}
		
		System.out.println("arra elements are");
		sum=0;
		for(int i=start;i<end;i++)
		{
			System.out.print(arr[i]+"\t");
			sum+=arr[i];
		}
		System.out.println("\n Sum= "+sum);
	}
}