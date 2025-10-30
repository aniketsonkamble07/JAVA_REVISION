import java.util.*;
class Program
{
	public static void main(String[] args)
	{
		Student s1=new Student(1, "Aniket", "IT");
		Student s2=new Student(1, "Aniket", "IT");
		boolean result=s1==s2;
		System.out.println("s1==s2?:"+result);
		boolean result2=s1.equals(s2);
		System.out.println("s1.equals(s2)?:"+result2);
		
		Student s3=s2;
		
		boolean result3=s2==s3;
		System.out.println("s2==s3?:"+result3);
		boolean result4=s2.equals(s3);
		System.out.println("s2.equals(s3)?:"+result4);
		
		System.out.println("s1:"+s1);
		System.out.println("1.toString()"+ s1.toString());
	
	}
}