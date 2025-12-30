public class StackExample
{
	public static void main(String[] args)
	{
		 StackImpl stack = new StackImpl(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); // 30
        System.out.println(stack.pop());  // 30
        System.out.println(stack.pop());  // 20
	}
}