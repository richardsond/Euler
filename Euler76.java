public class Euler76
{
	final static int NUM = 100;

    public static void main(String[] args)
    {
        System.out.println(partition(NUM));
    }

	public static long partition(int num)
	{
		return partition(0, num-1, 0);
	}

	public static long partition(int sum, int top, long counter)
	{
		for(int i = 1; i <= top; i++)
		{
			if(sum + i == NUM)
			{
				return counter + 1;
			}
			else if (sum + i < NUM)
			{
				counter = partition(sum + i, i, counter);
			}
		}

		return counter;
	}
}