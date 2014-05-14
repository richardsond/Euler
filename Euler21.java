import java.util.ArrayList;

public class Euler21
{
	public static void main(String [] args)
	{
		final int MAX = 10000;

		int result = 0;

		for(int i = 1; i < MAX; i++)
		{
			int a = getDivisorSum(i);
			int b = getDivisorSum(a);

			if(b == i && a != b)
			{
				result += a;
			}

			System.out.println("Number: " + i + "\tSum of Divisors: " + a);

		}

		System.out.println("\nThe sum of all amicable pairs under " + MAX + " is: " + result);
	}

	public static int getDivisorSum(int number)
	{
		ArrayList<Integer> list = getFactorList(number);
		int sum = sumUpList(list);

		return sum;
	}

	public static int sumUpList(ArrayList<Integer> list)
	{
		int result = 0;

		for(int i : list)
		{
			result += i;
		}

		return result;
	}

	public static ArrayList<Integer> getFactorList(int number)
	{
		ArrayList<Integer> result = new ArrayList<Integer> ();

		for(int i = 1; i < number; i++)
		{
			if (number % i == 0 )
			{
				result.add(i);
			}
		}

		return result;
	}
}