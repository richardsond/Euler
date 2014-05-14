public class Euler46
{
	public static void main(String [] args)
	{
		final int START = 9;
		boolean found = false;
		int test;

		int num = START;

		while(!found)
		{
			if(isOddComposite(num))
			{
				found = false;

				for(int i = 0; i <= num; i++)
				{
					test = num - 2 * (i*i);
					if(isPrime(test))
					{
						found = true;
						System.out.println("Found: " + num + " = " + test + " + 2 * " + i + "^2");
					}

					if(found)
					{
						break;
					}

				}

				num++;
				found = false;

			}
		}
	}

	public static boolean isOddComposite(int num)
	{
		if(num % 2 == 0)
		{
			return false;
		}

		for(int i = 3; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				return true;
			}
		}

		return false;
	}

	public static boolean isPrime(int num)
	{
		if(num % 2 == 0)
		{
			return false;
		}

		for(int i = 3; i <= Math.sqrt(num); i += 2)
		{
			if(num % i == 0)
			{
				return false;
			}
		}

		return true;
	}
}