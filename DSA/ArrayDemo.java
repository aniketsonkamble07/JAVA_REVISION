import java.util.*;
public class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		arr[7]=80;
		arr[8]=90;
		arr[9]=100;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		int target=30;
		LinearSearch(arr, target);
		System.out.println("\n Binary Search ");
		BinarySearch(arr,50);
		ZeroShift();
		findMinMAx();
		System.out.println(isSorted());
	}
	
	public static void LinearSearch(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("\n Element found at: "+ (i+1) +" position");
				return ;
			}
		}
		System.out.println("Element "+ target +"  not found !!");
	}
	
	public static void BinarySearch(int[] arr, int target)
	{
		int l=0;
		int r=arr.length-1;
		
		while(l<r)
		{
			int mid=(l+r)/2;
			if(arr[mid]==target)
			{
				System.out.println("\n Element found at: "+ (mid+1) +" position");
				return;
			}
			else if(target<arr[mid])
			{
				r=mid;
			}
			else if(target>arr[mid])
			{
				l=mid+1;
			}
		}
		System.out.println("Element "+ target +"  not found !!");

	}
	
	public static void ZeroShift()
	{
		int[] arr={1,0,0,4,3,8,0};
		int l=0;
		int r=arr.length-1;
		 while(l<r)
		 {
			 
			 if(arr[l]==0 && arr[r]!=0)
			 {
				 arr[l]=arr[r];
				 arr[r]=0;
			 }
			 else if(arr[r]==0)
			 {
				 r--;
			 }
			 else{
				 l++;
			 }
		 }
		 
		 System.out.println("Array Elements after zeros shift");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+ "\t");
		 }
	}
	
	public static void findMinMAx()
	{
		int[] arr={1,0,0,4,3,8,0};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=min)
			{
				min=arr[i];
			}else if(arr[i]>=max)
			{
				max=arr[i];
			}
			sum=sum+arr[i];
		}
		System.out.println("\n Min Value :"+ min);
		System.out.println("\n Max Value :"+ max);
		System.out.println("Sum :"+ sum);
	}
	public static boolean isSorted()
	{
		int[] arr={1,2,3,4,5,8,9};
		for(int i=0;i<arr.length-1;i++)
		{
			if(!(arr[i]<=arr[i+1]))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void findFrequency()
	{
		int[] arr={1,0,0,4,3,8,0,8,4,3};
		Map<Integer, Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i],0)+1));
		}
		
		
    
for(Map.Entry<Integer, Integer> entry:map.entrySet())
{
	System.out.println(entry.getKey()+ " : "+ entry.getValue());
	
}
   for (Integer key : map.keySet()) {
    System.out.println(key + " : " + map.get(key));
}

	}
	
	
	public static void shiftZeroOrder()
	{
		int[] arr={1,0,0,4,3,8,0,8,4,3};
		int l=arr.length-1;
		int r=arr.length-1;
		
		while(l>=0)
		{
		if(arr[l]==0)
		{
			for(int i=l;i<r;i++)
			{
			arr[i]=arr[i+1];
			
			}
			arr[r]=0;
			r--;
		}
		l--;
		}
	}
	// Optimized solution
	public static void shiftZeroOrder1() {
    int[] arr = {1, 0, 0, 4, 3, 8, 0, 8, 4, 3};
    int j = 0; // position to place non-zero

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }

    for (int n : arr)
        System.out.print(n + " ");
}

      public static void findIntersection()
	  {
		  int arr1[]={1,2,3,4,5};
		  int[] arr2={4,5,,7};
		  int index=0;
		  int[] intersect=new int[arr2.length];
		  
		  for(int i=0;i<arr1.length;i++)
		  {
			  for(int j=0;j<arr1.length;j++)
			  {
				  if(arr1[i]==arr2[i])
				  {
					  intersect[index];
					  index++;
				  }
			  }
		  }
		  
		  for(int value : intersect)
		  {
			  System.out.print(value+ " \t");
		  }
	  }
}