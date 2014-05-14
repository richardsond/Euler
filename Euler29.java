import java.util.*;
import java.math.*;

public class Euler29
{
	public static void main(String [] args)
	{
		final int MIN = 2;
		final int MAX = 100;

		ArrayList<BigInteger> numbers = new ArrayList<BigInteger> ();
		BigInteger temp;;

		for(int base = MIN; base <= MAX; base++)
		{
			for(int power = MIN; power <= MAX; power++)
			{
				temp = BigInteger.valueOf(base);
				temp = temp.pow(power);
				numbers.add(temp);
			}
		}

		numbers = removeDuplicates(numbers);
		Collections.sort(numbers);
		//DEBUG: print(numbers);
		System.out.println("\nThere are " + numbers.size() + " terms in the sequence.\n");
	}

	public static ArrayList<BigInteger> removeDuplicates(ArrayList<BigInteger> numbers)
	{
		ArrayList<BigInteger> newNumbers = new ArrayList<BigInteger> ();

		for(int i = 0; i < numbers.size(); i++)
		{
			if(newNumbers.indexOf(numbers.get(i)) < 0)
			{
				newNumbers.add(numbers.get(i));
			}
		}
		return newNumbers;

	}

	public static void print(ArrayList<BigInteger> numbers)
	{
		for(int i = 0; i < numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		}
	}
}