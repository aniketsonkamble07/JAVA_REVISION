 import java.util.*;
 public class Demo
 {
	 public static void main(String[] args)
	 {
		 String s="abc";
		 String s1="abc";
		 String s2="ABC";
		 System.out.println("String Length= "+ s.length());
		 System.out.println(s==s1);
		 
		 String name="Aniket";
		 System.out.println("Is empty? " + name.isEmpty());
		 System.out.println("Start with Ani ? "+ name.startsWith("Ani"));
		 System.out.println("End with t ? " + name.endsWith("t"));
		 System.out.println("SubString " + name.substring(2,4));
		 System.out.println("Character at 3rd index="+ name.charAt(3));
		 System.out.println("Are the s equals to s1? "+ s.equals(s1));
		 System.out.println("Are the s1 equals to s2? "+ s1.equalsIgnoreCase(s2));
		 System.out.println("Last Index of "+ name.lastIndexOf("i"));
		 char ch=(char)11;
		 System.out.println("Char = "+ch);
		 char ch2=(char)(ch+'0'); 
		 System.out.println(ch2);
		 System.out.println("Are the String palindrome "+ isPalindrome("maam"));
		 
		s2= s2.replace("A", "S");
		 
		 System.out.println(s2);
		 s1=s1.replace("abc", "xyz");
		 System.out.println(s1);
		 System.out.println(s1.indexOf("x"));
		 
	 }
	 
	 public static boolean isPalindrome(String str)
	 {
		 int i=0;
		 int j=str.length()-1;
		boolean flag=false; 
		 while(i<j)
		 {
			 if(str.charAt(i)==(str.charAt(j)))
			 {
				 flag=true;
			 }
			 else
			 {
				 return false;
			 }
			 i++;
			 j--;
		 }
		 return flag;
	 }
	 /*
	 class Student 
	 {
    String name;
    int rollno;

    @Override
    public boolean equals(Object obj) {
        // 1. Check if obj is null
        if (obj == null) return false;

        // 2. Check if obj is same type
        if (!(obj instanceof Student)) return false;

        // 3. Cast obj to Student
        Student s = (Student) obj;

        // 4. Compare fields
        return this.name.equals(s.name) && this.rollno == s.rollno;
    }
	@Override
    public int hashCode() 
	{
        return name.hashCode() + rollno;
    }
   }
   */

 }