 public class NumberExample
 {
	 public static void main(String[] args)
	 {
		 int[] arr={41,8,78,53,4,2,89};
		 
	 }
	 
	 public static int secondSmallest(int[] arr)
	 {
		 int smallest=Integer.MAX_VALUE;
		 int second=Integer.MAX_VALUE;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]<smallest)
			 {
				 second=smallest;
				 smallest=arr[i];
			 }
			else if(arr[i]>smallest && arr[i]<second )
			 {
				 second=arr[i];
			 }
		 }
	 }
 }