public class Euler15
{

	public static void main(String [] args)
	{
		final int SIZE = 20;
		long numRoutes;

		numRoutes = getRoutes(SIZE);

	    System.out.println("There are " + numRoutes + " routes from top-left to bottom-right of a " + SIZE + " x " + SIZE + " grid.");
	}

    public static long getRoutes(int gridsize)
    {
    	++gridsize;

        long[][] grid = new long[gridsize][gridsize];

        grid[0][0] = 0;
        grid[1][0] = grid[0][1] = 1;

        for (int y = 0; y < gridsize; ++y)
        {
        	for (int x = 0; x < gridsize; ++x)
            {
        	    long pre_x = 0, pre_y = 0;
                try
                {
					pre_x = grid[y-1][x];
				}
                catch(Exception e)
                {
				}
					try
				{
					pre_y = grid[y][x-1];
				}
	                catch (Exception e)
                {
				}
	                if (grid[y][x] == 0)
                {
                	grid[y][x] = pre_x + pre_y;
                }
        	}
        }

        return grid[gridsize - 1][gridsize - 1];
	}
}