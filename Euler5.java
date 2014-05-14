public class Euler5
{
	public static void main (String [] args)
	{
		int i = 1;

		while(!isValid(i))
		{
			i++;
		}

		System.out.println("The smallest positive number that is evenly divisible by "
			+ "all the numbers from 1 to 20 is: " + i);
	}

	public static boolean isValid(int num)
	{
		final int MAX = 20;

		for(int i = 1; i < MAX; i++)
		{
			if((num % i) != 0)
			{
				return false;
			}
		}

		return true;
	}
}