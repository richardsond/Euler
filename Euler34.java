public class Euler34
{
	public static void main(String [] args)
	{
		final int max = 99999 ;
		int result = 0;

		for(int i = 3; i < max; i++)
		{
			if(checkNum(i))
			{
				result += i;
			}
		}

		System.out.println("The result is: " + result);
	}

	public static boolean checkNum(int num)
	{
		boolean isValid = false;
		int sum = 0;
		String digits = String.valueOf(num);

		for(int i = 0; i < digits.length(); i++)
		{
			sum += getFactorial(Integer.parseInt(digits.substring(i,i+1)));
		}

		if(sum == num)
		{
			isValid = true;
		}

		return isValid;

	}

	public static int getFactorial(int num)
	{
		int result = 1;

		while(num > 0)
		{
			result *= num;
			num--;
		}

		return result;
	}
}