import java.util.ArrayList;

public class Euler145
{
	public static void main (String [] args)
	{
		final int MAX = 1000000000;

		int result = process(MAX);

		System.out.println(result);
	}

	public static int process(int max)
	{
		int result = 0;
		boolean isValid = true;
		int num = 0;
		ArrayList<Integer> validNums = new ArrayList();

		for(int i = 1; i < max; i++)
		{
			isValid = true;

			if(reverse(i) != -1 && validNums.indexOf(i) < 0)
			{
				num = i + reverse(i);

				for(int j = 0; j < String.valueOf(num).length(); j++)
				{
					String str = String.valueOf(num);
					int currentInt = Integer.parseInt(String.valueOf(str.charAt(j)));

					if(currentInt % 2 == 0)
					{
						isValid = false;
						break;
					}
				}

				if(isValid)
				{
					System.out.println(i);
					validNums.add(i);
					validNums.add(reverse(i));
					result += 2;
				}//end if
			}//end if
		}//end for

		return result;
	}

	public static int reverse(int num)
	{
		String temp = String.valueOf(num);
		String newStr = "";

		for(int i = temp.length()-1; i >= 0; i--)
		{
			newStr += temp.charAt(i);
		}

		if(newStr.charAt(0) == '0')
		{
			return -1;
		}
		else
		{
			return Integer.parseInt(newStr);
		}
	}
}