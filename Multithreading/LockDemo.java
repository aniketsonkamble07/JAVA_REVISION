public class LockDemo
{
	public static void main(String[] args)throws InterruptedException
	{
		Incremental inc=new Incremental();
		Thread t1=new Thread(()->
		{
			for(int i=0;i<100;i++)
			{
				inc.Increment();
			}
		});
		Thread t2=new Thread(()->
		{
			for(int i=0;i<100;i++)
			{
				inc.Increment();
			}
		});
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
		t1.join();
        t2.join();
			System.out.println(inc.count);

	}
}