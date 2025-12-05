public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3};
        int[] arr2 = {2,3,4};
        int[] ans = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        int lastInserted=Integer.MIN_VALUE;
        while (i < arr1.length && j < arr2.length) 
		{
            if (arr1[i] < arr2[j] && (arr1[i]!=lastInserted)) 
			{
                ans[k] = arr1[i];
				lastInserted=arr1[i];
				i++;
				k++;
				
            } else if (arr2[j] < arr1[i] && (arr2[j]!=lastInserted)) 
			{
                ans[k] = arr2[j];
				k++;
				j++;
            } else  
			{ 
		        if(arr1[i]!=lastInserted)
				{
					ans[k] = arr1[i];
				    lastInserted=arr1[i];
					k++;
				}
                
                i++;
                j++;
            }
        }

        while (i < arr1.length) 
		{
            if(arr1[i]!=lastInserted)
				{
					ans[k] = arr1[i];
				    lastInserted=arr1[i];
					k++;
					
				}
				i++;
        }

        while (j < arr2.length) 
		{
            if(arr2[j]!=lastInserted)
				{
					ans[k] = arr2[j];
				    lastInserted=arr2[j];
					k++;
					
				}
				j++;
        }

        // Print only the valid elements
        for (int x = 0; x < k; x++) {
            System.out.print(ans[x] + "\t");
        }
		
		System.out.println("Count: " + countDuplicate(arr1, arr2));
    }
	
	public static int countDuplicate(int[] arr1, int[] arr2)
	{
		int i=0, j=0, k=0;
		int count=0;
		int next;
		int lastInserted=Integer.MIN_VALUE;
		int[] ans = new int[arr1.length+arr2.length];
		while( i<arr1.length && j <arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				next=arr1[i];
				i++;
			}
			else if(arr2[j]<arr1[i])
			{
				next=arr2[j];
				j++;
			}
			else
			{
				next=arr1[i];
				i++;
				j++;
				count++;
				
			}
			if(next != lastInserted)
			{
				ans[k]=next;
				lastInserted=next;
				k++;
			}
		}
		
		while(i<arr1.length)
		{
			if(arr1[i]!=lastInserted)
			{
				ans[k]=arr1[i];
				lastInserted=arr1[i];
				k++;
			}
			if(arr1[i]==lastInserted)
			{
				count++;
			}
			i++;
		}
		while(j<arr2.length)
		{
			if(arr2[j]!=lastInserted)
			{
				ans[k]=arr2[j];
				lastInserted=arr2[j];
				k++;
			}
			if(arr2[j]==lastInserted)
			{
				count++;
			}
			j++;
		}
		return count;
	}
	
}
