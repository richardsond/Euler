public class Euler12
{
	public static void main(String [] args)
	{
		final int TARGET = 500;
		int sum = 0;
		int num = 1;

		while(countDivisors(sum) < TARGET)
		{
			sum += num;
			num++;
			System.out.println(sum + " has " + countDivisors(sum) + " divisors.");
		}

		System.out.println("\nThe first triangle number with over " + TARGET + " divisors would be: " + sum);
	}

	public static int countDivisors(int num)
	{
		int numDivisors = 0;

		for(int i = 1; i < Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				numDivisors++;
			}
		}

		return numDivisors*2;
	}
}