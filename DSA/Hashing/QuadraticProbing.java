import java.util.*;

class QuadraticProbing 
{

    static int[] table;
    static int N;
    static int n = 0;

    static final double LOAD_FACTOR = 0.5;
    static final int EMPTY = -1;
    static final int DELETED = -2;

    public QuadraticProbing(int size) 
	{
        N = size;
        table = new int[N];
        Arrays.fill(table, EMPTY);
    }

    static int hash(int key) 
	{
        return key % N;
    }

    public static void add(int key) 
	{

        if ((double) n / N > LOAD_FACTOR) 
		{
            rehash(2 * N);
        }

        int i = 0;
        while (i < N) 
		{
            int index = (hash(key) + i * i) % N;

            if (table[index] == EMPTY || table[index] == DELETED) 
			{
                table[index] = key;
                n++;
                return;
            }
            i++;
        }
    }



    public static boolean search(int key) 
	{
        int i = 0;
        while (i < N) 
		{
            int index = (hash(key) + i * i) % N;

            if (table[index] == EMPTY)
                return false;

            if (table[index] == key)
                return true;

            i++;
        }
        return false;
    }

    public static boolean delete(int key) 
	{
        int i = 0;
        while (i < N) 
		{
            int index = (hash(key) + i * i) % N;

            if (table[index] == EMPTY)
                return false;

            if (table[index] == key) 
			{
                table[index] = DELETED;
                n--;
                return true;
            }
            i++;
        }
        return false;
    }

    private static void rehash(int newSize) 
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
