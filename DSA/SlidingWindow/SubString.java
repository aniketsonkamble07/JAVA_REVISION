import java.util.*;
public class SubString
{
	public static void main(String[] args)
	{
		String str="abcdabc";
	}
	public String nonRepeatingString(String str)
	{
		
		StringBuffer sb=new StringBuffer();
		int start =0;
		int end=0;
		int max=0;
		for(int i=0;i<str.length();i++)
		{
			int[] hash=new int[256];
			
			for(int j=0;j<str.length();j++)
			{
				
				char ch=str.charAt(j);
				if(hash[ch]==1)
				{
					break;
				}
				if(max<j-i+1))
				{
					start=i;
					end=j;
				}
			}
			
			}
			
			for(int i=start;i<=end;i++)
			{
				sb.append(str.charAt(i));
			}
		return sb.toString();
	}
	
	
	public static int findMaxLength(String str)
	{
		int max=0;
		int r=0;
		int l=0;
		for(int r=0;r<str.length();r++)
		{
			char c=str.charAt(r)
			hash[c]++;
			while(hash[c]>1)
			{
				hash[c]--;
				l++;
			}
			if(max<r-l+1)
			{
				max=r-l+1;
			}			
		}
		return max;
	}
}