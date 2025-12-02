public class ArrayReturn
{
	public static void main(String[] args)
	{
		int[] arr={10,5,7,18,19,20};
	    int[] ans=new int[arr.length];
		EvenIndex(arr, 0, ans);
		for(int val : ans)
		{
			System.out.println(val);
		}
	}
	public static int[] EvenIndex(int[] arr, int index , int[] ans)
	{
		if(index==arr.length)
		{
			return ans;
		}
		
		if(arr[index] %2==0)
		{
			ans[index]=index;
		}
		
		EvenIndex(arr, index+1, ans);
	}
	
	public static int[] EvennIndex2(int[] arr, int index)
	{
		if(arr.length==index)
		{
			return new int[arr.length];
		}
		int[] ans=EvennIndex2(arr, index+1);
		if(arr[index]%2==0)
		{
			
			ans[index]=index;
		}
		return ans;
	}
	
	
	public String removeA(String str)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a')
			{
				break;
			}
			sb.append(ch);
		}
		return sb.toString();
	}
	
	public String removeARecursion(String str,int  index, String ans)
	{
		if(str.length()==index)
		{
			return "";
		}
		char ch=str.charAt(index);
		ans=removeARecursion(str, index+1, ans);
		if(!(ch=='a'))
		{
			ans=ans+ch;
		}
		return ans;
	}
	
	public String removeARecursionPreOrder(String str, int index , String ans)
	{
		if(str.length()==index)
		{
			return ans;
		}
		char ch=str.charAt(index);
		if(!(ch=='a'))
		{
			ans+=ch;
		}
		return removeARecursionPreOrder(str, index+1, ans);
	}
	
	public String removeARecursionPreOrder2(String str, int index)
	{
		if(str.length()==index)
		{
			return "";
		}
		char ch=str.charAt(index);
		
		if((ch=='a'))
		{
			return ""+removeARecursionPreOrder2(str, index+1);
		}
		return ch+removeARecursionPreOrder2(str, index+1);
	}
}