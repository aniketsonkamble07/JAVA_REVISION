import java.util.*;

public class SequentialChainingExample 
{

    static int N;
    static LinkedList<Integer>[] buckets;
    static int n = 0;                   // number of elements
    static final double LOAD_FACTOR = 0.75;

    public SequentialChainingExample(int size) 
	{
        N = size;
        buckets = new LinkedList[N];
        for (int i = 0; i < N; i++) 
		{
            buckets[i] = new LinkedList<>();
        }
    }

    private static int hashFun(int num) 
	{
        return num % N;
    }

    private static void rehashing(int newSize) 
	{

        LinkedList<Integer>[] newBuckets = new LinkedList[newSize];
        for (int i = 0; i < newSize; i++) {
            newBuckets[i] = new LinkedList<>();
        }

        // reinsert elements
        for (int i = 0; i < buckets.length; i++) 
		{
            for (int value : buckets[i]) 
			{
                int newIndex = value % newSize;
                newBuckets[newIndex].add(value);
            }
        }

        buckets = newBuckets;
        N = newSize;
    }

    public static void add(int data) 
	{
        int index = hashFun(data);
        buckets[index].add(data);
        n++;

        double loadFactor = (double) n / N;
        if (loadFactor > LOAD_FACTOR) 
		{
            rehashing(N * 2);
        }
    }

    public static boolean search(int data) 
	{
        int index = hashFun(data);
        return buckets[index].contains(data);
    }

    public static boolean delete(int data) 
	{
        int index = hashFun(data);
        boolean removed = buckets[index].remove((Integer) data);
        if (removed) n--;
        return removed;
    }

    public static void display() 
	{
        for (int i = 0; i < N; i++) 
		{
            System.out.println(i + " → " + buckets[i]);
        }
    }
}
