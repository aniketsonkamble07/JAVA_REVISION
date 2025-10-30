import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Incremental
{
	int count=0;
	public Lock lock=new ReentrantLock();
	public void Increment()
	{
			lock.lock();
			try{
				count++;
			}
			finally
			{
				lock.unlock();
			}	
	}
	
}