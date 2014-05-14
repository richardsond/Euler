import java.math.*;

public class Euler48
{
	public static void main (String [] args)
	{
		final int MAX = 1000;

		BigInteger result = BigInteger.ZERO;
		BigInteger temp = BigInteger.ZERO;

		for(int i = 1; i <= MAX; i++)
		{
			temp = BigInteger.valueOf(i).pow(i);
			result = result.add(temp);
		}

		String str = result.toString();
		System.out.println("The last 10 digits of the number are: " + str.substring(str.length() - 10));
	}
}