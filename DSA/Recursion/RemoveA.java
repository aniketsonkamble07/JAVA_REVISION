public class RemoveA
{
	public static void main(String[] args)
	{
		String str="abcaabcda";
		StringBuffer ans=new StringBuffer();
		removeA1(str,0,ans);
		System.out.println("After removal ans= "+ ans);
		System.out.println("After removal ans= "+ removeA2(str,0, ans));
	}
	public static void  removeA1(String str, int index, String ans)
	{
		if(str.length()==index)
			return ;
		if(str.charAt(index)!='a')
			ans=ans+str.charAt(index);
		
		removeA1(str, index+1, ans);
	}
	
	public static String removeA2(String str, int index)
	{
		if(str.length()==index)
			return "";
		if(str.charAt(index)=='a')
			return removeA2(str, index+1);
		return str.charAt(index)+removeA2(str, index+1);
	}
	//or 
	public static String removeA3(String str)
	{
		if(str.isEmpty())
			return "";
		if(str.charAt(0)=='a')
			return removeA2(str.substring(1));
		return str.charAt(0)+removeA2(str.substring(1));
	}
	
	public static String removeApple(String str)
	{
		if(str.isEmpty())
			return "";
		if(str.startsWith("apple"))
			removeApple(str.substring(5));
		str.charAt(0)+removeApple(str.substring(1));
	}
	public static String removeAppNotApple(String str)
	{
		if(str.isEmpty())
			return "";
		if(str.startsWith("app") && ! str.startsWith("apple"))
			removeAppNotApple(str.substring(5));
		str.charAt(0)+removeAppNotApple(str.substring(1));
	}
	
	public static void subseq(String p, String un)
	{
		if(un.isEmpty())
			System.out.println(p);
		char ch=un.charAt(0);
		subseq(p+ch, un.substring(1));
		subseq(p, un.substring(1));
	}
	
	
	public static ArrayList<String> subseqRet(String p, String un)
	{
		if(un.isEmpty())
		{
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch=un.charAt(0);
		ArrayList<String> left=subseqRet(p+ch, un.substring(1));
		ArrayList<String> right=subseqRet(p, un.substring(1));
		left.appendAll(right);
		return left;
	}
	
	public static ArrayList<String> subseqAscii(String p, String un) {
    if (un.isEmpty()) {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }

    char ch = un.charAt(0);

    ArrayList<String> first = subseqAscii(p + ch, un.substring(1));
    ArrayList<String> second = subseqAscii(p + (int) ch, un.substring(1));
    ArrayList<String> third = subseqAscii(p, un.substring(1));

    first.addAll(second);
    first.addAll(third);

    return first;
}

}