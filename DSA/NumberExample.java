import java.util.Arrays;
public class NumberExample
{
	public static void main(String[] args)
	{
		int num1=10;
		int num2=20;
		int[] arr={12,75,85,44,30,2,20};
		
		//findGreater(arr);
		//findSmaller(arr);
		//kthLargest2(arr,3);
		//kthLargest3(arr,4);
	System.out.println(isSorted());
	}
	public static void findGreater(int[] arr)
		{
			int largest=arr[0];
			int secondLargest=0;
			
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]>largest)
				{
					secondLargest=largest;
					largest=arr[i];
				}
				
				if(arr[i]>secondLargest && arr[i]<largest)
				{
					secondLargest=arr[i];
				}
			}
			System.out.println("Largest Number: "+largest);
			System.out.println("Second Largest Number: "+ secondLargest);
		}
		public static void findSmaller(int[] arr)
		{
			int smallest=arr[0];
			int secondSmallest=0;
			for(int i=0;i<arr.length;i++)
			{
			if(arr[i]<smallest)
			{
				secondSmallest=smallest;
				smallest=arr[i];
			}
			if(arr[i]<secondSmallest && arr[i]>smallest)
			{
				secondSmallest=arr[i];
			}
			}
		}
		
		public static void kthLargest(int[] arr, int k)
		{
			Arrays.sort(arr);
			System.out.println(arr[arr.length-1-k]);
			
			
		}
		public static void kthLargest2(int[] arr, int k)
		{
			int[] lar=new int[k];
			int largest=Integer.MIN_VALUE;
			for(int i=0;i<k;i++)
			{
				lar[i]=find(arr);
			}
			System.out.println("kth:"+lar[k-1]);
			
		}
		public static int find(int[] arr)
		{
			int largest=Integer.MIN_VALUE;
			int index=-1;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>largest)
				{
					largest=arr[i];
					index=i;
				}
			}
			arr[index]=Integer.MIN_VALUE;
			return largest;
		}
		public static void kthLargest3(int[] arr, int k)
		{
			int kthLargest = Integer.MIN_VALUE;
			
			for(int i=0;i<k;i++)
			{
				int largest=Integer.MIN_VALUE;
				int index=-1;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[j]>largest)
					{
						index=j;
						largest=arr[j];
					}
				}
				kthLargest=largest;
				arr[index]=Integer.MIN_VALUE;
				
			}
			System.out.println("Kth Largest 4:"+kthLargest);
		}
		
		
		public static boolean isSorted()
		{
			int[] arr={22,25,56};
			
			for(int i=0;i<arr.length-1;i++)
			{
				if(!(arr[i]<arr[i+1]))
				{
					return false;
				}
			}
			return true;
		}
		
		public static void indDuplicate()
		{
		     int[] arr={22,25,56, 66,25};	
			 HashMap<Integer, Integer> map=new HashMap<>();
			 for(int i=0;i<arr.length;i++)
			 {
				 map.put(arr[i], map.getOrDefault(arr[i],0).getKey()+1);
			 }
			 
			 for(var value : map)
			 {
				 if(value.getKey()>0)
				 {
					 System.out.println(value.getKey());
				 }
			 }
			 
		}
		
		public static void indDuplicate2()
		{
			int[] arr={22,25,56, 66,25}; 
			for(int i=0;i<arr.length;i++)
			{
				for(int j=1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						System.out.println(arr[i]);
					}
				}
			}
		}
}