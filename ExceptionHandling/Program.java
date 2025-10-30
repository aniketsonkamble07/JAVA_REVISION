public class Program
{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		try
		{
			System.out.println("Result="+ a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			System.out.println("This is Finally block");
		}
		
		
		System.out.println("This is throwExample output:");
		ThrowExample t=new ThrowExample();
		try
		{
			t.operations();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}