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
	
	public static void rotateArrayList(ArrayList<Integer> arr, int k)
	{
		k=k%arr.size();
		
		ArrayList<Integer> temp=new ArrayList<Integer>();
		for(int i=0;i<k;i++)
		{
			temp.add(arr.get(i));
		}
		
		for(int i=k;i<arr.size();i++)
		{
			arr.set(i-k,arr.get(i));
		}
		
		for(int i=0;i<k;i++)
		{
			arr.set(arr.size()-k+i, temp.get(i));
			
		}
	}
}