public class Euler2
{
	public static void main (String [] args)
	{
		final int MAX = 4000000;
		int sum = 0;
		int temp;
		int f0 = 0;
		int f1 = 1;

		for(int i = 0; f0 <= MAX && f1 <= MAX; i++)
		{
			temp = f1;
			f1 += f0;
			f0 = temp;

			if(f0 % 2 == 0)
			{
				sum += f0;
			}
		}

		System.out.println("The sum of the fibonacci numbers that do not exceed " + MAX + " is " + sum);
	}
}