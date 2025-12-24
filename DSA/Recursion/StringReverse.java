public class StringReverse
{
  public static void main(String[] args)
  {
	  String str="aniket";
	  
	  System.out.println(reverse(str));
	  System.out.println(reverseStr(str));
	  System.out.println(reverseStr2(str));
  }
  
  public static String reverse(String str)
  {
	  StringBuffer sb=new StringBuffer();
	  helper(str, 0, sb);
	  return sb.toString();
  }
   public static void helper(String str , int index, StringBuffer sb)
   {
	    if(index==str.length())
			return ;
		helper(str, index+1, sb);
		sb.append(str.charAt(index));
   }
   
   
   public static String reverseStr(String s)
   {
	   return helperStr(s,s.length()-1);
	   
   }
   
   public static String helperStr(String s, int index)
   {
	   if(index==-1)
		   return "";
	   return s.charAt(index)+ helperStr(s, index-1);
	   
   }
   
   public static String reverseStr2(String s)
   {
	  if(s.isEmpty())
		   return "";
	   return s.charAt(s.length()-1)+ reverseStr2(s.substring(0,s.length()-1));
	   
   }
}