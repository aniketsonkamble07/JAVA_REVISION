public class SortedRecursion
{
	public static void main(String[] args)
	{
	int[] arr = {1, 2, 3, 5, 9};
System.out.println(isSorted(arr, 0));	
	}
	public static boolean isSorted(int[] arr, int index)
	{
		if(index==arr.length-1)
		{
			return true;
		}
		
		return arr[index]<=arr[index+1] && isSorted(arr, index+1);
	}
	public boolean isSorted2(int[] arr, int index)
	{
		if(index==arr.length-1)
		{
			return true;
		}
		if(arr[index]>=arr[index+1])
			return false;
	 return isSorted2(arr, index+1);
	}
	
	public static boolean searchElement(int[] arr, int target, int index)
	{
		if(index==arr.length)
		{
			return false;
		}
		return arr[index]==target || searchElement(arr, target, index+1);
	}
	
	// optimized
	public static boolean searchElement(int[] arr, int target, int index) {
    if (index == arr.length) return false;
    if (arr[index] == target) return true;
    return searchElement(arr, target, index + 1);
}

}