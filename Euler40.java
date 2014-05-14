public class Euler40
{
	public static void main (String [] args)
	{
		final int MAX = 450000;
		final int [] desiredNums = {1,10,100,1000,10000,100000,1000000};

		StringBuffer sb = new StringBuffer();
		sb.append("0.");
		System.out.println("Generating String Of Integers From 1 to " + MAX);
		int product = 1;

		for(int i = 1; i < MAX; i++)
		{
			sb.append(i);
		}

		String s = sb.toString();
		System.out.println("Length of string: " + s.length());

		for(int i = 0; i < desiredNums.length; i++)
		{
			product *= Integer.parseInt(String.valueOf(s.charAt(desiredNums[i]+1)));
		}

		System.out.println("The product of those integers is: " + product);
	}
}