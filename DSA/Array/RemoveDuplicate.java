public class RemoveDuplicate
{
	public static void main(String[] args)
	{
		int[] arr={1,1,1,2,2,2,3,3};
		sortedArrayRemoval(arr);
		int[] arr2={4,2,7,6,4,7,6,2,4,8};
		//unSortedArrayRemoval(arr2);
		leftRotate(arr2);
	}
	
	public static void sortedArrayRemoval(int[] arr)
	{
		int i=0;
		int j=1;
		while(i<j && j<arr.length)
		{
			if(arr[j]!=arr[i])
			{
				arr[i+1]=arr[j];
				i++;
			}
			j++;
		}
		
		
		for(int k=0;k<=i;k++)
		{
			System.out.print(arr[k]+ "\t");
			
		}
	}
	
	public static void unSortedArrayRemoval(int[] arr) 
	{
    int n = arr.length;

    for (int i = 0; i < n; i++) 
	{
        for (int j = i + 1; j < n; j++) 
		{
            if (arr[i] == arr[j]) 
			{
                // shift left
                for (int k = j; k < n - 1; k++) 
				{
                    arr[k] = arr[k + 1];
                }
                n--;   // reduce size
                j--;   // recheck current index
            }
        }
    }

    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + "\t");
    }
}

	public static void unSortedArrayRemoval2(int[] arr) 
	{
    int n = arr.length;

    for (int i = 0; i < n; i++) 
	{
        for (int j = i + 1; j < n; j++) 
		{
            if (arr[i] == arr[j]) 
			{
                // shift left
                for (int k = j; k < n - 1; k++) 
				{
                    arr[k] = arr[k + 1];
                }
                n--;   // reduce size
                j--;   // recheck current index
            }
        }
    }

    for (int i = 0; i < n; i++) 
	{
        System.out.print(arr[i] + "\t");
    }
}

public static void leftRotate(int[] arr)
{
	System.out.println("\n Before rotate Array Elements are: \n");
	for (int i = 0; i < arr.length; i++) 
	{
        System.out.print(arr[i] + "\t");
    }
	int temp=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		arr[i-1]=arr[i];
	}
	arr[arr.length-1]=temp;
	
	System.out.println("\n After Left Rotate Array Elements Are: \n");
	for (int i = 0; i < arr.length; i++) 
	{
        System.out.print(arr[i] + "\t");
    }
}
public static void leftRotateK(int[] arr, int k)
{
	System.ou.println();
	System.out.println("\n Before rotate Array Elements are: \n");
	for (int i = 0; i < arr.length; i++) 
	{
        System.out.print(arr[i] + "\t");
    }
	k=k%arr.length;
	int[] temp=new int[k];
	
	for(int i=0;i<k;i++)
	{
		temp[i]=arr[i];
	}
	for(int i=k;i<arr.length;i++)
	{
		arr[i-k]=arr[i-k+1];
		
	}
	for(int i=arr.length-1;i>arr.length-k;i--)
	{
		arr[i]=temp[index];
		index++;
	}	
	
}

}