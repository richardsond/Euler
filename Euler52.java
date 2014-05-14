import java.util.*;

public class Euler52
{
	public static void main (String [] args)
	{
		boolean foundResult = false;
		int count = 2;

		while(!foundResult)
		{
			String digits = orderDigits(count);

			String TwoTimes = orderDigits(count * 2);
			String ThreeTimes = orderDigits(count * 3);
			String FourTimes = orderDigits(count * 4);
			String FiveTimes = orderDigits(count * 5);
			String SixTimes = orderDigits(count * 6);

			if(TwoTimes.indexOf(digits) >= 0)
			{
				if(ThreeTimes.indexOf(digits) >= 0)
				{
					if(FourTimes.indexOf(digits) >= 0)
					{
						if(FiveTimes.indexOf(digits) >= 0)
						{
							if(SixTimes.indexOf(digits) >= 0)
							{
								foundResult = true;
								break;
							}

						}
					}
				}
			}

			count++;
		}


		System.out.println("The smallest x-integer is: " + count);
	}

	public static String orderDigits(int num)
	{
		char [] digits = String.valueOf(num).toCharArray();
		String sortedNum = "";
		Arrays.sort(digits);

		for(int i = 0; i < digits.length; i++)
		{
			sortedNum += digits[i];
		}

		return sortedNum;
	}
}