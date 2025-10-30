public class LoopingExample {
    public static void main(String[] args) {
        printNumber();
    }

    public static void printNumber() {

        // 1. Print 0 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + "\t");
        }

        // 2. Even numbers from 1 to 10
        System.out.println("\nEven numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }

        // 3. Odd numbers from 1 to 10
        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }

        // 4. First 10 even numbers
        System.out.println("\nFirst 10 even numbers:");
        int num = 0;
        int count = 0;
        while (count < 10) {
            if (num % 2 == 0) {
                System.out.print(num + "\t");
                count++;
            }
            num++;
        }

        // 5. Find 5th prime number
        System.out.println("\n5th Prime number:");
        int primeCount = 0;
        int target = 5;

        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
            if (primeCount == target) {
                System.out.println(i);
                break;
            }
        }
    }

    // Prime number check
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void findMissingNumber()
	{
		int[] arr={1,2,3,5};
		int num=5;
		
		for(int i=1;i<=num;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println("Missing element is "+i);
				return;
			}
		}
	}
	
	public static void findMissingNumber2()
	{
		int[] arr={1,2,3,5};
		int num=5;
		HashMap<Integer, Integer> m=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			m.put(arr[i], m.getOrDefault(arr[i],0)+1);
		}
		
		for(int i=1;i<=num;i++)
		{
			if(!m.containsKey(i))
			{
				System.out.println("Missing element is "+i);
			}
		}
	}
	
	public static void findMissingNumber3()
	{
		int[] arr={1,2,3,5};
		int expectedSum=0;
		int sum=0;
		for(int i=0;i<=arr.length+1;i++)
		{
			expectedSum=expectedSum+i;
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int missing=expectedSum-sum;
		
		System.out.println("Missing element is "+missing);
		
	}
	//or
	public static void findMissingNumber4() {
    int[] arr = {1, 2, 3, 5};
    int n = 5;  // The range is from 1 to 5

    // Expected sum of 1 to n
    int expectedSum = n * (n + 1) / 2;

    // Actual sum of array elements
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }

    // Missing number
    int missing = expectedSum - sum;

    System.out.println("Missing element is " + missing);
}

public static void findSum(int number)
{
	int sum=0;
	while(number!=0)
	{
	sum=sum+number%10;
number=number/10;	
	}
}
public static void isPallindrom(int num)
{
	int sum=0;
	int temp=number;
	
	while(number!=0)
	{
		sum=sum+number%10;
		number=number/10;
	}
	if(sum==temp)
	{
		System.out.println(temp+ " is pallindrom");
	}
}
public static void isPallindromString(String str)
{
	String temp=str;
	for(int i=str.length();i>=0;i--)
	{
		temp+=str.charAt(i);
	}
	if (str.equals(temp)) {
        System.out.println(str + " is a palindrome.");
    } else {
        System.out.println(str + " is not a palindrome.");
    }
}
}
