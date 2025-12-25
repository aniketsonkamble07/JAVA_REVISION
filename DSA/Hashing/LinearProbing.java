import java.util.Arrays;

public class LinearProbing 
{

    static final double LOAD_FACTOR = 0.6;
    static int n = 0;
    static int N;
    static int[] table;

    static final int EMPTY = -1;
    static final int DELETED = -2;

    public LinearProbing(int size) 
	{
        N = size;
        table = new int[N];
        Arrays.fill(table, EMPTY);
    }

    private static int hash(int key) 
	{
        return key % N;
    }

    // Insert
    public static void add(int key) 
	{
        if ((double) n / N > LOAD_FACTOR)
		{
            rehashing(2 * N);
        }

        int index = hash(key);
        int i = 0;

        while (table[index] != EMPTY && table[index] != DELETED) 
		{
            i++;
            index = (hash(key) + i) % N;
        }

        table[index] = key;
        n++;
    }

    // Search
    public static boolean search(int key) 
	{
        int index = hash(key);
        int i = 0;

        while (table[index] != EMPTY && i < N) 
		{
            if (table[index] == key) return true;
            i++;
            index = (hash(key) + i) % N;
        }
        return false;
    }

    // Delete
    public static boolean delete(int key) 
	{
        int index = hash(key);
        int i = 0;

        while (table[index] != EMPTY && i < N) 
		{
            if (table[index] == key) 
			{
                table[index] = DELETED;
                n--;
                return true;
            }
            i++;
            index = (hash(key) + i) % N;
        }
        return false;
    }

    // Rehashing
    private static void rehashing(int newSize) 
	{
        int[] oldTable = table;

        table = new int[newSize];
        Arrays.fill(table, EMPTY);
        N = newSize;
        n = 0;

        for (int key : oldTable) 
		{
            if (key != EMPTY && key != DELETED) 
			{
                add(key);
            }
        }
    }
}
