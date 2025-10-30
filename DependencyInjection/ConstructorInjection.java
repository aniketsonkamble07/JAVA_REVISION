


class ConstructorInjection
{
	public static void main(String[] args)
	{
		Parent1 p1=new Parent1();
			
		//Child1 c1=new Child1(p1);
		//c1.caller1();
		Child2 c2=new Child2();
		c2.setObject(p1);
		c2.Caller2();
		
	}
}
