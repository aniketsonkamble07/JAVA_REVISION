import java.util.*;
public class Demo
{
	static int[] dp;
	public static void main(String[] args)
	{
		int[] arr={10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(helper(arr,0,0));
		dp=new int[arr.length+1];
		Arrays.fill(dp,0);
	}
	
	public static int helper(int[] arr, int indx, int count) 
	{

    
    if (indx == arr.length - 1) 
	{
        return count;
    }

    
    if (arr[indx] < arr[indx + 1]) 
	{
        return helper(arr, indx + 1, count + 1);
    } 
	else 
	{
        return helper(arr, indx + 1, count);
    }
   }

    public static int helper2(int[] arr, int indx)
	{
		if(indx==arr.length)
		{
			return dp;
		}
		
		
	}

}


