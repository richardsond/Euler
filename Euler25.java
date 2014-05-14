import java.math.BigInteger;

public class Euler25
{
	public static void main(String [] args)
	{
		final int targetNum = 1000;

		int firstTerm = getFirstTerm(targetNum);

		System.out.println("The first term with " + targetNum + " digits is: " + firstTerm);
	}

	public static int getFirstTerm(int targetNum)
	{
		BigInteger f1 = BigInteger.ONE;
		BigInteger f2 = BigInteger.ONE;

		int count = 2;

		for(;;)
		{
			++count;
			if( count % 2 == 0)
			{
				f1 = f1.add(f2);
				if(f1.toString().length() >= targetNum)
				{
					return count;
				}
			}

			else
			{
				f2 = f2.add(f1);
				if(f2.toString().length() >= targetNum)
				{
					return count;
				}
			}
		}//end for
	}
}