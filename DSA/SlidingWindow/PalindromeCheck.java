import java.util.*;
public class PalindromeCheck
{
	public static void main(String[] args)
	{
		String str="madam";
		System.out.println(str+" is palindrome? "+ isPalindromme(str));
	}
	public static boolean isPalindromme(String str)
	{
		int l=0;
		int r=str.length()-1;
		while(l<r)
		{
			if(str.charAt(l)!=(str.charAt(r)))
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}