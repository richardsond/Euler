public class Euler9
{
	public static void main(String [] args)
	{
		final int TARGET = 1000;
		int a = 0, b = 0, c = 0, product = 0;
		double temp;

		root: for(a = 0; a < TARGET; a++)
		{
			for (b = 0; b < (TARGET- a / 2); b++)
			{
				if(Math.sqrt((a*a) + (b*b)) == (int)(Math.sqrt((a*a) + (b*b))))
				{
					c = (int) Math.sqrt((a*a) + (b*b));
					if((a + b + c) == TARGET)
					{
						if(a < b && b < c)
						{
							product = (a*b*c);
							break root;
						}
					}
				}
			}
		}

		System.out.println("A: " + a + "\nB: " + b + "\nC: " + c + "\n\nHave a Sum of "
			+ TARGET + "\nA product ABC of " + product);
	}
}