import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Euler35
{
	static ArrayList<Integer> circularPrimes = new ArrayList<Integer> ();

	public static void main (String [] args)
	{
		final int MAX = 1000000;
		long time = System.currentTimeMillis();

		for(int i = 2; i <= MAX; i++)
		{
			if(isPrime(i))
			{
				getPermutations(i);
			}

		}

		print(circularPrimes, MAX);

		long totalTime = System.currentTimeMillis() - time;

		System.out.println("\nThe program completed as designed in a total of: " + totalTime + " milliseconds.");


	}

	public static void getPermutations(int num)
	{
		String numStr = String.valueOf(num);
		ArrayList<Integer> perms = new ArrayList<Integer>();
		boolean validPrime = true;
		int count = 0;

		for(int i = 0; i < numStr.length(); i++)
		{
			perms.add(Integer.parseInt(numStr));
			numStr = numStr.substring(1) + numStr.charAt(0);
		}

		for(int i = 0; i < perms.size(); i++)
		{
			if(isPrime(perms.get(i)))
			{
				count++;
			}

			if(count == numStr.length())
			{
				circularPrimes.add(num);
			}
		}
	}

	public static boolean isPrime(int num)
	{
		boolean isPrime = true;

		for(int i = 2; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
		}

		return isPrime;

	}

	public static void print(ArrayList<Integer> nums, int max)
	{
		Collections.sort(nums);

		System.out.print("The circular primes below " + max + " are: \n");
		for(int i = 0; i < nums.size(); i++)
		{
			System.out.print(nums.get(i) + ", ");
		}
		System.out.println("\nThere are: " + nums.size() + " circular primes between 0 and " + max);
	}
}