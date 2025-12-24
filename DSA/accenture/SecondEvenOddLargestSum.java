import java.util.*;
public class SecondEvenOddLargestSum
{
	public static void main(String[] args)
	{
		int[] arr={3 ,2 ,1 ,7 ,5 ,4};
		System.out.println(LargeSmallSum(arr));
	}

   public static int LargeSmallSum(int[] arr)
   {
	   ArrayList<Integer> evenList=new ArrayList<>();
	   ArrayList<Integer> oddList=new ArrayList<>();
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   if(i%2==0)
		   {
			   evenList.add(arr[i]);
		   }
		   else
		   {
			   oddList.add(arr[i]);
		   }
	   }
	   
	   return findSecondLargest(evenList)+ findSecondSmallest(oddList);
   }
   
   public static int findSecondLargest(ArrayList<Integer> list)
   {
	   int largest=Integer.MIN_VALUE;
	   int secondLargest=Integer.MIN_VALUE;
	   for(int n : list)
	   {
		   if(n>=largest)
		   {
			   secondLargest=largest;
			   largest=n;
		   }
		   else if(n>secondLargest && n<largest)
		   {
			   secondLargest=n;
		   }   
	   }
	   return secondLargest;
   }
	
	
	public static int findSecondSmallest(ArrayList<Integer> list)
	{
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for( int n : list)
		{
			if(n<smallest)
			{
				secondSmallest=smallest;
				smallest=n;
			}
			else if(n <secondSmallest && n>smallest)
			{
				secondSmallest=n;
			}
		}
		return secondSmallest;
	}
}