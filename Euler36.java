public class Euler36
{
	public static void main (String [] args)
	{
		final int MAX = 1000000;

		int result = process(MAX);

		System.out.println("The sum of all palindromes in base 10 and base 2 (below one million) is: " + result);
	}

	public static int process(int max)
	{
		String temp;
		int result = 0;

		for(int i = 1; i < max; i++)
		{
			if(checkPalindrome(String.valueOf(i)))
			{
				if(checkPalindrome(Integer.toBinaryString(i)))
				{
					result += i;
				}
			}
		}

		return result;
	}

	public static String toBinaryString(int num)
	{
		return Integer.toBinaryString(num);
	}

	public static boolean checkPalindrome(String str)
	{
		String temp = new String();
		boolean palindrome = true;
		int l = str.length()-1;

		if(str.length() >= 2)
		{
			for(int i = 0; i < str.length(); i++)
			{
				if(str.charAt(i) != str.charAt(l--))
				{
					palindrome = false;
					break;
				}
			}
		}

		return palindrome;
	}
}//end class
