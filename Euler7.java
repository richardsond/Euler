public class Euler7
{
	public static void main (String [] args)
	{
		final int target = 10001;
		int primesFound = 0;
		int currentPrime = 2;
		int num = 2;

		while(primesFound < target)
		{
			if(isPrime(num))
			{
				currentPrime = num;
				System.out.println("Found " + (++primesFound) + " prime numbers."); // DEBUG
			}

			num++;
		}

		System.out.println("\nPrime Number #" + target + ": " + currentPrime);
	}

	public static boolean isPrime(int num)
	{
		int i;
		boolean isPrime = false;

		for(i = 2; i < num; i++)
		{
			int n = num % i;
			if(n == 0)
			{
				isPrime = false;
				break;
			}
		}

		if(i == num)
		{
			isPrime = true;
		}

		return isPrime;
	}
}