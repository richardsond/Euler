public class Euler4
{
	public static void main (String [] args)
	{
		int num1 = 999;
		int num2 = 999;

		int product = 0;

		for(int i = num1; i >= 100; i--)
		{
			for(int j = num2; j >= 100; j--)
			{
				if(isPalindrome(i * j))
				{
					if((i*j) > product)
					{
						product = i*j;
					}
				}
			}
		}

		System.out.println("The largest palindrome product of two three-digit numbers is: " + product);
	}

	public static boolean isPalindrome(int num)
	{
		String number = Integer.toString(num);
		for(int i = 0; i < number.length() / 2; i++)
		{
			if(number.charAt(i) != number.charAt(number.length()-(i+1)))
			{
				return false;
			}
		}

		return true;
	}
}