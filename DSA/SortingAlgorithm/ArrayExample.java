import java.util.*;

public class ArrayExample
{
    public static void main(String[] args)
    {
        int[] arr = {2,78,4,6,23,14,52,2,4,6,52,4,78};

        occurencesCoun1(arr);
        System.out.println("4th Largest: " + kthLargest(arr.clone(), 4)); // Use clone to preserve original array
        System.out.println("Array Sum: " + arraySum(arr));
    }


    public static void occurencesCoun1(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] == arr[i])
                    count++;
            }
            System.out.println("Count of " + arr[i] + " is : " + count);
        }
    }


    public static void occurencesCoun2(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int element : arr)
        {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }


    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for(int num : arr)
        {
            sum += num;
        }
        return sum;
    }


    // Correct Bubble Sort for kth largest
    public static int kthLargest(int[] arr, int position)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            boolean swapped = false;

            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] < arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }

        return arr[position - 1];
    }
}
