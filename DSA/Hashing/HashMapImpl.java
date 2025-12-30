import java.util.*;

public class HashMapImpl 
{

    // Node class
    static class Node 
	{
        String key;
        int value;

        Node(String key, int value) 
		{
            this.key = key;
            this.value = value;
        }
    }

    static int CAPACITY;
    static LinkedList<Node>[] bucket;
    static double LOAD_FACTOR = 0.6;
    static int n = 0;

    // Constructor
    public HashMapImpl(int capacity) 
	{
        CAPACITY = capacity;
        bucket = new LinkedList[CAPACITY];

        for (int i = 0; i < CAPACITY; i++)
		{
            bucket[i] = new LinkedList<>();
        }
    }

    // Hash function
    public static int hash(String key) 
	{
        return Math.abs(key.hashCode()) % CAPACITY;
    }

    // Add / Put
    public static void add(String key, int value) 
	{
        if ((double) n / CAPACITY > LOAD_FACTOR) 
		{
            rehash(2 * CAPACITY);
        }

        int index = hash(key);
        LinkedList<Node> list = bucket[index];

        // Update value if key exists
        for (Node node : list)
		{
            if (node.key.equals(key)) 
			{
                node.value = value;
                return;
            }
        }

        // Insert new node
        list.add(new Node(key, value));
        n++;
    }

    // Search
    public static boolean search(String key) 
	{
        int index = hash(key);
        for (Node node : bucket[index]) 
		{
            if (node.key.equals(key)) 
			{
                return true;
            }
        }
        return false;
    }

    // Delete
    public static boolean delete(String key) 
	{
        int index = hash(key);
        Iterator<Node> it = bucket[index].iterator();

        while (it.hasNext()) 
		{
            Node node = it.next();
            if (node.key.equals(key)) 
			{
                it.remove();
                n--;
                return true;
            }
        }
        return false;
    }
	/*  We cant remove using for each loop
	public static boolean delete(String key)
	{
		int index=hash(key);
		LinkedList<Node> list=bucket[index];
		for(Node node : list)
		{
			if(node.Key.equals(key))
			{
				list.remove(node);
				return true
			}
		}
		return false;
	}
	*/

    // Rehashing
    public static void rehash(int newSize) 
	{
        LinkedList<Node>[] oldBucket = bucket;

        CAPACITY = newSize;
        bucket = new LinkedList[CAPACITY];
        n = 0;

        for (int i = 0; i < CAPACITY; i++) 
		{
            bucket[i] = new LinkedList<>();
        }

        for (LinkedList<Node> list : oldBucket) 
		{
            for (Node node : list) 
			{
                add(node.key, node.value);
            }
        }
    }
}
