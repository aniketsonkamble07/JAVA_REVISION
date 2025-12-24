public class PasswordValidation
{
	public static void main(String[] args)
	{
		oprations("Abc2D3E1F23af");
		didgitSum("Abc2D3E1F23af");
		numberFormation("Abc2D3E1F23af");
		checkSpecialCharacter("afe21@we #$%&84f3");
	}
	public static void oprations(String str)
	{
		int capt=0;
		int didgit=0;
		
		if(str==null || str.isEmpty())
			System.out.println("String is empty");
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				capt++;
			}
			if(ch>='0' && ch<='9')
				didgit++;
		}
		System.out.println("No of captial letters ="+ capt);
		System.out.println("No of didgit ="+ didgit);
			
	}
	
	public static void didgitSum(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
				sum=sum+(ch-'0');
		}
		System.out.println("Sum = "+sum);
	}
	public static void numberFormation(String str)
	{
		String num="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				num=num+ch;
			}
		}
		System.out.println(Integer.parseInt(num));
	}
     public static void checkSpecialCharacter(String str)
	 {
		 System.out.println("Special characters are :");
		 for(int i=0;i<str.length();i++)
		 {
			 char ch=str.charAt(i);
			 if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')))
			 {
				 System.out.println(ch);
			 }
		 }
		 /* if (!Character.isLetterOrDigit(ch))
             {
              // special character
			  System.out.println(ch);
              }*/
	 }	 
}