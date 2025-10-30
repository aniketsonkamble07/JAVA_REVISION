public class ThrowExample
{
	int a=10;
	int b=0;
	public void operations()
	{
		if(a/b==0)
		{
			throw new ArithmeticException("This is not mathemethically correct");
		}
	}
}