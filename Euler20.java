import java.math.BigInteger;

public class Euler20
{
	public static void main(String [] args)
	{
		final int startNum = 100;
		int sum = 0;

		BigInteger result = BigInteger.valueOf(1);

		for(int i = startNum; i > 1; i--)
		{
			result = result.multiply(BigInteger.valueOf(i));
		}



		String str = String.valueOf(result);

		for(int i = 0; i < (str.length()); i++)
		{
			sum += Integer.parseInt(str.substring(i,i+1));
		}

		System.out.println("The sum of the digits in " + startNum + "! is: " + sum);
	}
}