public class Euler37
{
	public static void main (String [] args)
	{
		final int MAX = 11;

		int numTruncFound = 0;
		long sum = 0;
		int num = 8;

		while(numTruncFound < MAX)
		{
			//System.out.println("Checking " + num); //DEBUG
			if(isTruncatable(num))
			{
				numTruncFound++;
				sum += num;
				System.out.println("Truncatable Prime #" + numTruncFound + ":" + num);//DEBUG
			}

			num++;
		}

		System.out.println("\n\nThe sum of all primes truncatable from left to right / vice versa is: " + sum);
	}


	public static boolean isPrime(int num)
	{
		if( num < 2 )
		{
			return false;
		}

		else if ( num == 2 )
		{
			return true;
		}

		else
		{
			for( long i=2; i<=Math.sqrt(num); i++ )
			{
				if( num % i == 0 )
				{
					return false;
				}
			}
		}

		return true;

	}

	public static boolean isTruncatable ( int number )
	{
		String s = String.valueOf( number );
		String sub;

		for( int i=0; i<s.length(); i++ )
		{
			sub = s.substring( i );

			if( !isPrime(Integer.valueOf(sub)) )
			{
				return false;
			}
		}

		for( int i=s.length(); i>0; i-- )
		{
			sub = s.substring( 0, i );

			if( !isPrime(Integer.valueOf(sub)) )
			{
				return false;
			}
		}

		return true;
	}

}