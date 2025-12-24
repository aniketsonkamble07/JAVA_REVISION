import java.util.*;

public class ArrayListExample
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList(Arrays.asList(14,4,1,2,3));
		reverseArrayList(list);
		System.out.println();

	}
	public static void reverseArrayList(ArrayList<Integer> arr)
	{
		int i=0;
		int j=arr.size()-1;
		
		while(i<j)
		{
			int temp=arr.get(i);
			arr.set(i,arr.get(j));
			arr.set(j,temp);
			i++;
			j--;
		}
		
		System.out.println(arr);
	}
}