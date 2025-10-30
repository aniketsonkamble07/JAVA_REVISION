public class Child1
{
	IParent p;
public Child1(IParent p)
{
	this.p=p;
}
public void caller1()
{
	p.Display();
}
}