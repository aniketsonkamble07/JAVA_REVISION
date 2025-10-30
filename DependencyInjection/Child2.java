public class Child2
{
	IParent p;
	public void setObject(IParent p)
	{
		this.p=p;
	}	
	public void Caller2()
	{
		p.Display();
	}
}