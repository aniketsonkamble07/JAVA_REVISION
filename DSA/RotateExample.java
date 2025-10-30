import java.util.*;
import java.util.Collection;
public class RotateExample
{
   static int[] arr={52,85,71,2,65,41,46,1};
	public static void main(String[] args)
	{
		
		RotateArray(4);
	}
	public static void RotateArray(int k)
	{
		int size=arr.length;
		k=k%size;
		List<Integer> l1=new ArrayList<>();
		for(int i=0;i<k;i++)
		{
			l1.add(arr[i]);
			arr[i]=arr[i+k];
		}
		
		for(int i=size-k-1; i<size;i++)
		{
			arr[i]=l1.get(i);
		}
		
		
		for(int element: arr)
		{
			System.out.print(element+"\t");
		}
	}
}