import java.util.*;

import java.util.Collections;
public class ReverseArray
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40};
		Method1(arr);
		Method2(arr);
	}
	public static void Method1(int[] arr)
	{
		
		Stack s=new Stack();
		
		for(int i=0;i<arr.length;i++)
		{
			s.push(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)s.pop();
		}
		System.out.println("After reversal");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void Method2(int[] arr)
	{
		List<Integer> list=new ArrayList<>(arr.length);
		Collections.reverse(list);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=list.get(i);
		}
		System.out.println("After reversal");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}