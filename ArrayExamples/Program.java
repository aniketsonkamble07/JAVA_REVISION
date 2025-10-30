class Program
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50};
		int[] a, b;
		a=new int[5];
		b=new int[5];
		
		int[] c[], d;
		// c become 2D array and d 
		int[]e, []f;
		// e is 1D , f is 2D
		
		int[] num=new int[5];
		
		num[0]=60;
		num[1]=70;
		num[2]=80;
		num[3]=90;
		num[4]=100;
		
		System.out.println(a[0]);
		System.out.println(b[0]);
	
		
		System.out.println("Array Elements Are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		System.out.println("Number array elements:: ");
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(num[i]+"\t");
		}
	}
}