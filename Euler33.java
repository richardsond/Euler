public class Euler33
{
	public static void main (String [] args)
	{
		final int MIN = 10;
		final int MAX = 99;

		int prodNumer = 1;		//The numerator of the product
		int prodDenom = 1;		//The denominator of the product
		int lowestDeom = 0; 	//Product denominator red. as much as possible.

		for(int numer = MIN; numer < MAX; numer++)
		{
			for(int denom = MIN; denom < MAX; denom++)
			{
				if(!isTrivial(numer, denom))
				{
					prodNumer *= numer;
					prodDenom *= denom;
					System.out.println("Found non-trivial number: " + numer +
						"/" + denom + "."); //DEBUG
				}
			}
		}

		System.out.println("\n" + prodNumer + "/" + prodDenom);
		System.out.println("\nThe solution is: " + returnLowestDenom(prodNumer, prodDenom));
	}

	public static boolean isTrivial(int numer, int denom)
	{
		boolean isTrivial = true;

		int numFirstDigit = getFirstDigit(numer);
		int numLastDigit = getLastDigit(numer);
		int denFirstDigit = getFirstDigit(denom);
		int denLastDigit = getLastDigit(denom);

		if(numLastDigit == 0 && denLastDigit == 0)
		{
			return true;
		}

		if(numFirstDigit == denFirstDigit && (double)numer / denom < 1)
		{
			if((double)numer / denom == (double)numLastDigit / denLastDigit)
			{
				return false;
			}
		}

		if(numLastDigit == denLastDigit && (double)numer / denom < 1)
		{
			if((double)numer / denom == (double)numFirstDigit / denFirstDigit)
			{
				return false;
			}
		}

		if(numFirstDigit == denLastDigit && (double)numer / denom < 1)
		{
			if((double)numer / denom == (double)numLastDigit / denFirstDigit)
			{
				return false;
			}
		}

		if(numLastDigit == denFirstDigit && (double)numer / denom < 1)
		{
			if((double) numer / denom == (double)numFirstDigit / denLastDigit)
			{
				return false;
			}
		}

		return isTrivial;
	}

	public static int getFirstDigit(int num)
	{
		while(num >= 10)
		{
			num /= 10;
		}

		return num;
	}

	public static int getLastDigit(int num)
	{
		return num % 10;
	}

	public static int returnLowestDenom(int numer, int denom)
	{
		return denom / numer;
	}
}