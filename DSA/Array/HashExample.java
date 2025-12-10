import java.util.Collections;
import java.util.*;
public class HashExample
{
	public static void main(String[] args)
	{
		int[] arr={1,2,7,5,8,7,2,7,1};
		int[] arr2={1,2,7,5};
		int[] arr3={1,2,7,5,8,7,2,7,1};
		countDuplicate(arr);
		countDuplicateMap(arr);
		System.out.println(arrayCompare(arr, arr2));
		System.out.println(arrayCompare(arr, arr3));
	}
	public static void countDuplicate(int[] arr) 
    {
     int n = arr.length;

    int max = 0;
    for (int x : arr) 
	{
        if (x > max) max = x;
    }

    int[] hash = new int[max + 1];

    // Count frequency
    for (int i = 0; i < n; i++) 
	{
        hash[arr[i]]++;
    }

    // Print duplicates
    for (int i = 0; i <= max; i++) 
	{
        if (hash[i] > 1) 
		{
            System.out.println(i + " Count = " + hash[i]);
        }
    }
}
    public static void countDuplicateMap(int[] arr)
	{
		Map<Integer, Integer> map=new HashMap<>();
         
        for(int x : arr)
		{
			map.put(x, map.getOrDefault(x,0)+1);
			
		}	
       for(Map.Entry<Integer, Integer> e: map.entrySet())
	   {
		   if(e.getValue()>1)
		   {
		      System.out.println(e.getKey()+ "Count = "+ e.getValue());
		   }
	   }		   
	}
	
	public static boolean arrayCompare(int[] arr1, int[] arr2)
	{
		int n1=arr1.length;
		int n2=arr2.length;
		int max1=0;
		int max2=0;
		for(int x : arr1)
		{
			if(x>max1)
				max1=x;
		}
		for(int x: arr2)
		{
			if(x>max2)
				max2=x;
		}
		int[] hash1=new int[max1+1];
		int[] hash2=new int[max2+1];
		
		if(hash1.length!=hash2.length)
			return false;
		for(int i=0;i<=max1;i++)
		{
			if(hash1[i]!=hash2[i])
				return false;
		}
		return true;
	}

}