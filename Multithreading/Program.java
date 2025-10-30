 import java.util.*;
 public class Program 
 {
	 public static void main(String[] args)
	 {
		 System.out.println();
		 Thread.currentThread().setName("Main Thread");
		 System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
		 ThreadDemo d=new ThreadDemo();
		// d.start();
		/* 
		 Thread t1=new Thread(()->
		 {
			 task1();
			 
		 });
		 Thread t2=new Thread(()->
		 {
			 task2();
			 
		 });
		 t1.setPriority(9);
		 t1.setName("Task1 thread");
		 
		 t2.setName("Task2 thread");
		 t2.setPriority(7);
		// t1.start();
		// t2.start();
		*/
		 InterrruptedExample i1=new InterrruptedExample();
		 i1.start();
		 try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        i1.interrupt();  // interrupt the sleeping thread
    

		 
	 }
	/*
public static void task1()
{
	System.out.println("Thread Name:"+ Thread.currentThread().getName());
	for(int i=0;i<5;i++)
	{
	
	  System.out.println("Task1:"+i);
	}
}	
public static void task2()
{
	System.out.println("Thread Name:"+Thread.currentThread().getName());
	for(int i=0;i<5;i++)
	{
	
	  System.out.println("Task2:"+i);
	}
}
*/
 }