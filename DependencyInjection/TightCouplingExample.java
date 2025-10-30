import java.util.*;

public class TightCouplingExample
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.Caller();
	}
}
