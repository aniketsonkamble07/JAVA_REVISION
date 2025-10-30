import java.util.*;
import java.io.*;
class Program
{
	public static void main(String[] args)throws FileNotFoundException
	{
		
		System.out.println("Scanner class examples:");
		Scanner sc=new Scanner(System.in);
		File f1=new File("F:\\Java_Revision\\ScannerClass\\Sample.txt");
		Scanner sc1=new Scanner(f1);
		/*System.out.println("Enter int");
	     int num=sc.nextInt();
		System.out.println("Enter float");
		float num1=sc.nextFloat();
		System.out.println("Enter string");
		String message=sc.nextLine();
		System.out.println("Enter character");
		String ch=sc.next();
		System.out.println("enter boolean value");
		boolean result=sc.nextBoolean();
		
		System.out.println("entered integer value: "+num);
		System.out.println("entered float value: "+num1);
		System.out.println("entered string value: "+num);
		System.out.println("entered boolean value: "+num);
		*/
		// Reading file
		
		try
		{
			
		System.out.println("File data");
		while(sc.hasNextLine())
		{
			String data=sc1.nextLine();
			System.out.println(data);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Method1(1);
		Method1(5);
		
	}
	
	public static void Method1(int index)
	{
		System.out.println();
		
		
		switch(index)
		{
			case 1: System.out.println("One");
			break;
			case 2: System.out.println("Two");
			break;
			case 3: System.out.println("Three");
			break;
			case 4: System.out.println("Four");
			break;
			default: System.out.println("Invalid Data");
			
			
		}
	}
}