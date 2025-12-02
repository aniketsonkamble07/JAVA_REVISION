import java.util.*;
public class StreamExample
{
	public static void main(String[] args)
	{
		List<Integer> numbers=List.of(10,12,3,2,31,7);
		numbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		List<Integer> evenNum=numbers.stream().map(n->n).filter(n->n%2==0).toList();
	}
}