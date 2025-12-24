public class StringRecursionExmple
{
	public static void main(String[] args)
	{
		String str="abcdaabbdaecaa";
		System.out.println(removeA(str, 0));
	}
	
	public static String removeA(String str, int index)
	{
		if(str.length()==index)
		{
			return "";
		}
		if(str.charAt(index)!='a')
		{
			return str.charAt(index)+ removeA(str, index+1);
		}
	 return	removeA(str, index+1);
	}
	
	public String 
}