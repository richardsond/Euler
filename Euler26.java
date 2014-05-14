public class Euler26
{
	public static void main (String [] args)
	{
		final int MAX = 1000;

		int result = 0;
		int maxLength = 0;
		int currentLength;

		for(int i = 1; i < MAX; i++)
		{
			currentLength = lengthOfRecurringCycle(i, MAX);

			if(currentLength > maxLength)
			{
				result = i;
				maxLength = currentLength;
			}
		}

		System.out.println("The number " + result + " has the longest recurring cycle, with a length of: " + maxLength);
	}

	public static int lengthOfRecurringCycle(int n, int max)
	{
		int [] quotients = new int[max];
		int [] remainders = new int[max];

		remainders[0] = 1;
		quotients[0] = 0;

		for(int i = 1; i < quotients.length; i++)
		{
			quotients[i] = remainders[i-1]*10/n;
			remainders[i] = remainders[i-1]*10 - quotients[i]*n;

			for(int j = 1; j < i; j++)
			{
				if(quotients[j] == quotients[i] && remainders[j] == remainders[i])
				{
					return (i-j);
				}
			}
		}

		return -1;
	}//end lengthofRecurringCycle;
}