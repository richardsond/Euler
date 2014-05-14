public class Euler1
{
	public static void main (String [] args)
	{
		final int MAX = 1000;
		int sum = 0;

		for(int i = 0; i < MAX; i++)
		{
			if( i % 3 == 0 || i % 5 == 0)
			{
				sum += i;
			}
		}

		System.out.println("The sum of all natural numbers below " + MAX + " is " + sum);
	}
}