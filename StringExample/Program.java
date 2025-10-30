public class Program
{
	public static void main(String[] args)
	{
		String s1=new String("Aniket");
		String s2= new String("Aniket");
		boolean result=s1==s2;
		
		System.out.println("s1==s2 :"+result);
		System.out.println("s1.equals(s2) :"+ s1.equals(s2));
		
		String s3="Aniket";
		String s4="Aniket";
		boolean result2=s3==s4;
		System.out.println("s3==s4 :"+result2);
		System.out.println("s3.equals(s4) :"+ s3.equals(s4));
		
		char ch=s3.charAt(2);
		System.out.println(ch);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		 int l=0;
		 String input="abcdabcde";
		 int maxLength=0;
		 
		for(int i=0;i<input.length();i++)
		{
			String subStr="";
			for(int j=i;j<input.length();j++)
			{
				char ch1=input.charAt(j);
				if(subStr.indexOf(ch1)!=-1)
				{
					break;
				}
				subStr=subStr+ch1;
				if(subStr.length()>maxLength)
				{
					maxLength=subStr.length();
				}
			}
		}
		System.out.println("MaxLength:"+maxLength);
		
		
	}
}