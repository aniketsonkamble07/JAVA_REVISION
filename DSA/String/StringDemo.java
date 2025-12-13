public class StringDemo
{
	public static void main(String[] args)
	{
		String s="abacsfdsad";
		System.out.println("String is = "+ s);
		System.out.println("String length = "+s.length());
		
		char[] chArray=s.toCharArray();
		System.out.println("Elements of Character Array is ");
		for(char ch : chArray)
		{
			System.out.print(ch +"\t");
		}
		
		
	}
}