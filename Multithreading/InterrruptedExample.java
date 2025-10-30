public class InterrruptedExample extends Thread
{
	public void run() 
	{
		try {
            System.out.println("Thread sleeping...");
            Thread.sleep(5000);
            System.out.println("Thread woke up.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while sleeping!");
        }

		
	}
}

