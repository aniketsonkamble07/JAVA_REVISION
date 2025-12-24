public class ArrayRecursionExample
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,6,5};
		System.out.println(isSorted(arr,0));
		System.out.println("Linear search "+ linearSearch(arr, 21,0));
	}
	public static boolean isSorted(int[] arr, int index)
	{
		if(index==arr.length-1)
			return true;
		 return arr[index]<=arr[index+1] && isSorted(arr, index+1);
	}
	
	public static boolean linearSearch(int[] arr, int key, int index)
	{
		if(index==arr.length)
		{
			return false;
		}
		return arr[index]==key || linearSearch(arr, key, index+1);
	}
	
	public static int linearSearchIndex(int[] arr, int key, int index)
	{
		if(index==-1)
			return -1;
		if(arr[index]==key)
			return index;
		else 
			return linearSearchIndex(arr, key,index+1);
	}
	public static ArrayList<Integer> linearSearchAllIndex(int[] arr, int key, int index ,ArrayList<Integer> list)
	{
		if(index==arr.length)
			return list;
		if(arr[index]==key)
			list.add(index);
		linearSearchAllIndex(arr, key,  index+1, list);
	}
}