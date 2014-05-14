public class Euler6
{
	public static void main (String [] args)
	{
		final int MAX = 100;

		long sqSum = 0L; //Used for the square of the sum of all the numbers
		long sumSq = 0L; //Used for the sum of the squares of all the numbers.
		long difference;

		for(int i = 0; i <= MAX; i++)
		{
			sqSum += i;
			sumSq += (i*i);
		}

		sqSum *= sqSum;
		difference = sqSum - sumSq;

		System.out.println("The sum of the squares: " + sumSq
			+ "\nThe square of the sums: " + sqSum
			+ "\nThe difference: " + difference);
	}
}