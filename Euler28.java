public class Euler28
{
	public static void main(String [] args)
	{
		final int GRID_SIZE = 1001;

		int result = getDiagonalSum(GRID_SIZE);

		System.out.println("The sum of a " + GRID_SIZE + " x " + GRID_SIZE + " grid's diagonals is: " + result);
	}

	public static int getDiagonalSum(int size)
	{
		size = size / 2 + 1;
		int result = 0;

		for(int i = 1; i <= size; i++)
		{
			result += getLevelSum(i);
		}

		return result;
	}

	public static int getLevelSum(int lvl)
	{
		if (lvl <= 1)
		{
			return 1;
		}

		int result = 1;
		int start = 1;

		for(int count = 1; count < lvl; count++)
		{
			int step = count*2;
			start += step;
			result = start;

			for(int diag = 0; diag < 3; diag++)
			{
				start += step;
				result += start;
			}
		}

		return result;
	}
}