import java.math.*;

public class Euler55
{
	public static boolean isPalindrome( String number )
	{
		for( int i=0; i<number.length()/2; i++ )
		{
			if( number.charAt(i) != number.charAt(number.length()-i-1) )
			{
				return false;
			}
		}

		return true;
	}

	public static String reverse( String str )
	{
		char[] result = new char[str.length()];

		for( int i=0; i<result.length; i++ )
		{
			result[i] = str.charAt( str.length()-i-1 );
		}

		return new String(result);
	}

	public static boolean isLychrel( int number )
	{
		int counter = 1;
		BigInteger n1 = BigInteger.valueOf( number );
		BigInteger n2;

		while( counter < 50 )
		{
			n2 = new BigInteger( reverse(n1.toString()) );
			n1 = n1.add( n2 );

			if( isPalindrome( n1.toString() ) )
			{
				return false;
			}

			counter++;
		}

		return true;
	}

	public static void main(String[] args)
	{
		int result = 0;

		for( int i=0; i<10000; i++ )
		{
			if( isLychrel(i) )
			{
				result++;
			}
		}

		System.out.println( result );
	}
}