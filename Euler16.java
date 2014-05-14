import java.math.*;

public class Euler16
{
	public static void main(String [] args)
	{
		final BigInteger BASE = BigInteger.valueOf(2);
		final BigInteger EXPONENT = BigInteger.valueOf(1000);
		int sum = 0;


		BigInteger result = BASE.pow(EXPONENT.intValue());

		System.out.println(BASE + "^" + EXPONENT + " = " + result);

		String str = String.valueOf(result);

		for(int i = 0; i < (str.length()); i++)
		{
			sum += Integer.parseInt(str.substring(i,i+1));
		}

		System.out.println("The sum of the digits is: " + sum + "\n\n");
	}
}