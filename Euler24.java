public class Euler24
{
	public static void main(String [] args)
	{
		final int NUM = 1000000;
		long result = getPermutation(NUM);

		System.out.println("The " + NUM + "th lexicographic permutation of the numbers 0-9 is: " + result + "\n");

	}//end main


	public static int[] permutation(int[] s, int num)
	{
		// get the factorial of the size of the array
	    int factorial = 1;
        for(int i = 2; i < s.length; i++)
        {
	    	factorial *= i;
		}

        for(int index = 0; index < s.length - 1; index++)
        {
          	int offset = (num / factorial) % (s.length - index);
	        int content = s[index + offset];

	    	for(int i = index + offset; i > index; i--)
	        {
				s[i] = s[i-1];
	        }

	    	s[index] = content;
	        factorial /= (s.length - (index + 1));
		}

	    return s;
	}//end permutation

	public static long getPermutation(int count)
	{
    	int _array[] = new int[] {0,1,2,3,4,5,6,7,8,9};
	    int mutated[] = permutation(_array, count - 1);
	    long result = 0;

		for (int i: mutated)
		{
			result = result * 10 + i;
		}

	    return result;
	}//end getPermutation()
}//end class