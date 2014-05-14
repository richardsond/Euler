import java.math.BigInteger;
import java.io.*;

public class Euler13
{
	public static void main(String [] args)
	{
		String line = null;
		BigInteger sum = BigInteger.ZERO;

		try
		{
			BufferedReader input = new BufferedReader(new FileReader("Euler13_Numbers.txt"));

			while((line = input.readLine()) != null)
			{
				sum = sum.add(new BigInteger(line));
			}
		}

		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}

		System.out.println("The first 10 digits of the sum are: " + sum.toString().substring(0,10));
	}
}