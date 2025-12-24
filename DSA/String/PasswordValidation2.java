public class PasswordValidation2
{
	public static void main(String[] args)
	{
		String s="abcAbC9d";
		System.out.println(validation(s));
		System.out.println(replace(s));
	}
	public static int validation(String str)
	{
		int[] arr={1,2,3,4,4};
		int r=4;
		int u=2;
		int req=u*r;
		if(arr==null)
			return 0;
		char start=str.charAt(0);
		if(start>='0' && start<='9')
		{
			System.out.println("String start with digit");
			return 0;
		}
		if(str.length()<4)
 		{
			System.out.println("Length is less than 4");
			return 0;
		}
		int digitCount=0;
		int capCount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
				capCount++;
			if(ch>='0' && ch<='9')
				digitCount++;
		}
		if(digitCount==0 || capCount==0)
		{
			System.out.println("String contains digit= "+ digitCount+ " Capital Letters= "+ capCount);
				return 0;
		}
		return 1;
		
	}
	
	public static String replace(String str)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				sb.append((char)(ch+32));
			}else if(ch>='a' && ch<='z')
			{
				sb.append((char)(ch-32));
			}
			else
			{
			  sb.append(ch);
			}
		}
		return sb.toString();
	}
}