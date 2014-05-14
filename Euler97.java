import java.math.BigInteger;

public class Euler97
{
	public static void main (String [] args)
	{
		System.out.println("Project Euler: Problem 97 by Dave Rich");
		long time = System.currentTimeMillis();


		final int MULT = 28433;
		final int BASE = 2;
		final int EXP = 7830457;
		final int ADD = 1;

		BigInteger multiplicand = BigInteger.valueOf(BASE).pow(EXP);
		BigInteger total = (BigInteger.valueOf(MULT).multiply(multiplicand)).add(BigInteger.ONE);

		System.out.println(total.toString());

		System.out.println("Program finished proper in " + (System.currentTimeMillis() - time) + " milliseconds.");

	}
}