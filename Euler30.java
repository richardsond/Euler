import java.math.*;
import java.util.*;

public class Euler30
{
	public static void main (String [] args)
	{
		double time = System.currentTimeMillis();
		final int POWER = 5;
		final int MAX = ((int)Math.pow(9, POWER) * 6);

		int [] digits;
		int length;

		long sum = 0L;
		long totalSum = 0L;

		String temp;

		for(int num = 2; num < MAX; num++)
		{
			temp = String.valueOf(num);
			length = temp.length();
			digits = new int [temp.length()];
			sum = 0;

			for(int i = 0; i < length; i++)
			{
				digits[i] = Integer.parseInt(temp.substring(i,i+1));
				sum += Math.pow(digits[i], POWER);
			}

			if(sum == num)
			{
				System.out.println(num);
				totalSum += num;
			}

			//DEBUG//
			System.out.print(num + " = ");
			for(int i = 0; i < digits.length; i++)
			{
				System.out.print(digits[i] + "^" + POWER + " + ");
			}
			System.out.println(" = " + sum);
			//END DEBUG//
		}

		time = System.currentTimeMillis() - time;

		System.out.println("\nA Total Sum of: " + totalSum);
		System.out.println("Processing took: " + (time/1000) + " seconds!");

	}//end main
}//end class