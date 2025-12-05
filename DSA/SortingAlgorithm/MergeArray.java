public class MergeArray
{
	public static void main(String[] args)
	{
		int[] num1={2,3,4};
		int[] num2={1,5,7,8,9,10};
		
		int[] ans=new int[num1.length+ num2.length];
		int index=0;
		
		int i=0;
		int j=0;
		
		while(i< num1.length && j<num2.length)
		{
			if(num1[i]<num2[j])
			{
				ans[index]= num1[i];
				index++;
				i++;
			}
            else
			{
				ans[index]=num2[j];
				index++;
				j++;
			}					
		}
		
		while(i<num1.length)
		{
			ans[index]=num1[i];
			index++;
			i++;
		}
		while(j<num2.length)
		{
			ans[index]=num2[j];
			index++;
			j++;
		}
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int k=0;k<ans.length;k++)
		{
			if(ans[k]<min)
			{
				min=ans[k];
			}
			if(ans[k]>max)
			{
				max=ans[k];
			}
			
			System.out.print(ans[k] +"\t");
		}
		System.out.println("\n Min: "+ min);
		System.out.println("Max :"+ max);
	}
}