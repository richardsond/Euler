import java.lang.Math.*;
import java.util.Arrays;

public class Euler41
{
	public static void main (String [] args)
	{
		long time = System.currentTimeMillis();

		int largestNum = 0;

		for(int i = 987654321; i > 123456789; i--)
		{
			if( isPandigital(i) )
			{
				if( isPrime(i) )
				{
					largestNum = i;
					System.out.println(i + " is a pandigital prime.");
					break;
				}
			}
		}

		System.out.println("\n\nThe largest pandigital prime is: " + largestNum);
		System.out.println("The program finished in: " + (System.currentTimeMillis() - time)/1000 + " seconds");

	}

	public static boolean isPandigital(int num)
	{
		boolean isPandigital = true;

		char [] tmp = Integer.toString(num).toCharArray();
		Arrays.sort(tmp);
		String temp = String.valueOf(tmp);

		for(int i = 1; i <= temp.length(); i++)
		{
			if(temp.charAt((i-1)) != i + '0')
			{
				return false;
			}
		}

		return isPandigital;
	}

	public static boolean isPrime(int num)
	{
		if( num == 2)
		{
			return true;
		}

		if( num % 2 == 0)
		{
			return false;
		}

		for(int i = 3; i < Math.sqrt(num) + 1; i += 2)
		{
			if(num % i == 0)
			{
				return false;
			}
		}

		return true;
	}
}