import java.util.Date;

public class Euler14
{
	public static void main(String[] args)
	{
	    int startNumber = 1;
	    long maxNumber = 1000000;

        long number = 0;
        long numberOfTerms = 0;
        long theNumberWithTheBiggestNumberOfTerms = 0;
        long biggestNumberOfTerms = 0;
        int arraySize = (int) maxNumber * 3;
        long[] mapOfNumbersAndTheirNumberOfTerms = new long[arraySize];

        for (int i = startNumber; i <= maxNumber; i++)
        {
			number = i;
			numberOfTerms = 0;

            while (number != 1)
            {
	        	if (number < arraySize && mapOfNumbersAndTheirNumberOfTerms[(int) number] != 0)
	        	{
	            	numberOfTerms += mapOfNumbersAndTheirNumberOfTerms[(int) number];
	                number = 1;
	            }

	            else
	            {
	            	numberOfTerms++;
                    if (number % 2 == 0)
                    {
	                 	number = number / 2;
	                }

	                else
	                {
	                	number = number * 3 + 1;
	                }
	        	}
			}


			if (i < arraySize && mapOfNumbersAndTheirNumberOfTerms[i] == 0)
			{
	    		mapOfNumbersAndTheirNumberOfTerms[i] = numberOfTerms;
	    	}

			if (numberOfTerms >= biggestNumberOfTerms)
			{
				theNumberWithTheBiggestNumberOfTerms = i;
				biggestNumberOfTerms = numberOfTerms;
			}
		}//end for

 		System.out.println("The best number to start from is: " + theNumberWithTheBiggestNumberOfTerms
	    	+ ". It has " + biggestNumberOfTerms + " terms.");
   }//end main

   	public static int getCollatzNumber(int n)
   	{
   		if (n == 1)
   		{
   	        return n;
   	    }

   	    else if (n % 2 == 0)
   	    {
   	    	n = n / 2;
   	        return getCollatzNumber(n);
   	    }

   	    else
   	    {
   			System.out.println("n = " + n);
   			n = n * 3 + 1;
   			return getCollatzNumber(n);
   	    }
  	}//end getCollatzNumber()

}//end class