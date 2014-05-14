import java.math.*;

public class Euler53
{
	public static void main(String[] args)
	{
		long result = 0;

		for( int n=1; n<=100; n++ )
		{
			for( int r=1; r<=n; r++ )
			{
				if( c( n, r ).compareTo( BigInteger.valueOf(1000000) ) > 0 )
				{
					result++;
				}
			}
		}

		System.out.println( result );
	}

	public static BigInteger multiply( int from, int to )
	{
		BigInteger result = BigInteger.valueOf(from);

		if( from == to )
		{
			return BigInteger.valueOf(1);
		}

		for( int i=from+1; i<=to; i++ )
		{
			result = result.multiply( BigInteger.valueOf(i) );
		}

		return result;
	}

	public static BigInteger c( int n, int r )
	{
		if( n == r )
		{
			return BigInteger.valueOf(1);
		}

		BigInteger l1 = multiply( r+1, n );
		BigInteger l2 = multiply( 1, n-r );

		return l1.divide( l2 );
	}
}