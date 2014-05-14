public class Euler10
{
	public static void main(String [] args)
	{
		final int MAX = 2000000;
		long sum = 2L;
		System.out.println("Found prime: 2");

		for(int i = 3; i < MAX; i += 2)
		{
			if(isPrime(i))
			{
				sum += i;
				System.out.println("Found prime: " + i); // DEBUG
			}
		}

		System.out.println("The sum of all primes below " + MAX + " is: " + sum);
	}

	public static boolean isPrime(int num)
	{
		if(num == 2)
		{
			return true;
		}

		else if(num == 1)
		{
			return false;
		}

		else if(num % 2 == 0)
		{
			return false;
		}

		for(int i = 3; i <= Math.sqrt(num); i+= 2)
		{
			if(num % i == 0)
			{
				return false;
			}
		}

		return true;
	}
}