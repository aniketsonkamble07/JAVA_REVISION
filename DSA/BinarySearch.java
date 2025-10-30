import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 55, 60};

        if (search(arr, 10)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

    public static boolean search(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) 
		{
            int mid = (l + r) / 2;

            if (arr[mid] == k) 
			{
                return true; 
            }
			else if (k > arr[mid])
			{
                l = mid + 1; // Search in right half
            } else 
			{
                r = mid - 1; // Search in left half
            }
        }
        return false; // Element not found
    }
}
