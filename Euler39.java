public class Euler39
{
	public static void main(String [] args)
	{
		final int MAX = 1000;

		long startTime = System.currentTimeMillis();
		int temp;
		int maxSol = 0;
		int bestP = 0;

		for(int i = 1; i <= MAX; i++)
		{
			temp = getNumSolutions(i);

			if (temp > maxSol)
			{
				bestP = i;
				maxSol = temp;
			}
		}


		System.out.println("The p value of " + bestP + " has the most solutions.");
		System.out.println("The program completed in " + ((System.currentTimeMillis() - startTime)/1000.00) + " sec.");
	}

	public static int getNumSolutions(int num)
	{
		int numSolutions = 0;

		for(int a = 0; a <= num; a++)
		{
			for(int b = a; b <= num; b++)
			{
				for(int c = b; c <= num; c++)
				{
					if((a*a) + (b*b) == (c*c) && a + b + c == num)
					{
						numSolutions++;
					}
				}
			}
		}

		return numSolutions-1;
	}

}