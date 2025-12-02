import java.util.*;
import java.util.Collections;
public class MapDemo
{
	public static void main(String[] args)
	{
		
		Method1();
		Method2();
		Method3();
		Method4();
		
	}
	
	public static void Method1()
	{
		String str="abkkfbsmf";
		Map<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		Set s=map.keySet();
		System.out.println("List of Keys :");
		for(var value : s)
		{
			//System.out.println(value);
			System.out.println(value +": " + map.getOrDefault(value,0));
		}
		
		System.out.println("List of value");
System.out.println(map.containsKey("s"));
	   
	}
	
	
	public static void Method2()
	{
		String str="dwhwfgwgw";
		Map<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		
		StringBuffer sb=new StringBuffer();
		int maxCount=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.get(ch)>1)
			{
				sb.setLength(0);
				map.put(ch,map.getOrDefault(ch,0)-1);
			}
			sb.append(ch);
			maxCount=Math.max(maxCount,sb.length());
		}
		System.out.println("Max count: " + maxCount);
 	}
	
	public static void Method3()
	{
		String s="madam";
		StringBuffer ans=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--)
		{
			ans.append(s.charAt(i));
		}
		String ans1=ans.toString();
		
		if(s.equals(ans1))
		{
			System.out.println("String "+ s + " is anagram");
		}
		else
		{
			System.out.println("String : "+s+ " is not anagra");
		}
	}
	
	public static void Method4()
	{
		String s="madam";
		int l=0;
		int r=s.length()-1;
		
		while(l<r)
		{
			if(!(s.charAt(l)==s.charAt(r)))
			{
				System.out.println("String : "+s+ " is not anagra");
			}
			l++;
			r--;
		}
		System.out.println("String "+ s + " is anagram");
	}
}