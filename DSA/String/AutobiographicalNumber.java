public class AutobiographicalNumber
{
	public static void main(String[] args)
	{
		int ans=isAutobiographicalNumber("1210");
		System.out.println(ans);
	}
	public static int isAutobiographicalNumber(String input)
	{
		int count1=0;
		int count0=0;
		int count=0;
	    char[] arr=input.toCharArray();
        for(char ch : arr)
		{
			if(ch-'0'==0)
			{
				count0++;
				
			}
			else if(ch-'0'==1)
			{
				count1++;
			}
			
		}
		System.out.println("0= " +count0 + " 1= "+ count1);
      if(count0!=(input.charAt(0)-'0') || count1 !=(input.charAt(1)-'0'))
	  {
		  return 0;
	  }else
	  {
		  for(int i=0;i<arr.length;i++)
		  {
			  char ch=arr[i];
			  boolean flag=true;
			  for( int j=0;j<arr.length;j++)
			  {
				  if(ch==arr[j])
				  {
					  flag=false;
					  break;
				  }
			  }
			  if(flag==true)
			  {
				  count++;
			  }
		  }
	  }
return count;	  
	}
}