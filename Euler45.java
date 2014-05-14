import java.math.*;
import java.util.*;

public class Euler45
{
	public static void main(String[] args)
	{
		String result = null;
		Set setPentagonal = new TreeSet();
		Set setHexagonal = new TreeSet();

		for( int i=166; i<99999; i++ )
		{
			BigInteger tmp1 = new BigInteger( String.valueOf(i) );
			BigInteger tmp2 =  tmp1.multiply( new BigInteger( String.valueOf(3) ) );
			tmp2 = tmp2.subtract( new BigInteger( String.valueOf(1) ) );
			tmp1 = tmp1.multiply( tmp2 );
			tmp1 = tmp1.divide( new BigInteger( String.valueOf(2) ) );

			setPentagonal.add( tmp1.toString() );
		}

		for( int i=144; i<99999; i++ )
		{
			BigInteger tmp1 = new BigInteger( String.valueOf(i) );
			BigInteger tmp2 =  tmp1.multiply( new BigInteger( String.valueOf(2) ) );
			tmp2 = tmp2.subtract( new BigInteger( String.valueOf(1) ) );
			tmp1 = tmp1.multiply( tmp2 );

			setHexagonal.add( tmp1.toString() );
		}

		for( int i=285; i<Integer.MAX_VALUE; i++ )
		{
			BigInteger tmp1 = new BigInteger( String.valueOf(i) );
			tmp1 = tmp1.multiply( tmp1.add( new BigInteger( String.valueOf(1) ) ) );
			tmp1 = tmp1.divide( new BigInteger( String.valueOf(2) ) );
			String tmp = tmp1.toString();

			if( setPentagonal.contains(tmp) && setHexagonal.contains(tmp) )
			{
				result = tmp;
				break;
			}
		}

		System.out.println( result );
	}
}