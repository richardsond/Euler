import java.util.ArrayList;

public class Euler23
{
	public static void main (String [] args)
	{
		ArrayList<Integer> abundantNums = new ArrayList<Integer> ();
		int sum = 0;
		int totalSum = 0;
		//Populate abundantNums
		for(int i = 12; i <= 28123; i++)
		{
			if(isAbundant(i))
			{
				abundantNums.add(i);
				totalSum += i;
			}
		}

		sum = getSumOf(abundantNums, totalSum);

		System.out.println("The sum of all is: " + sum);
	}

	public static boolean isAbundant(int num)
	{
		int sum = 0;
		boolean isAbundant = false;

		for(int i = 1; i < num; i++)
		{
			if(num % i == 0)
			{
				sum += i;
			}
		}

		if(sum > num)
		{
			isAbundant = true;
			System.out.println(num + " is abundant."); // DEBUG
		}

		return isAbundant;

	}

	public static int getSumOf(ArrayList<Integer> abundantNums, int totalSum)
	{
		int sum = 0;

		for( int i=0; i<abundantNums.size(); i++ )
		{
			for( int j=i; j<abundantNums.size(); j++ )
			{
				int index = abundantNums.get(i) + abundantNums.get(j) - 1;

		 		if( index < 28123 )
				{
					totalSum -= (index+1);
				}
			}
		}


		return sum;
	}
}