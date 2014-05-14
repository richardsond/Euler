import java.util.ArrayList;

public class Euler3
{
	public static void main(String[] args)
	{
		long finalNum = 600851475143L;
	    int num = 2;//2 is the first prime number
	    int primeCounter = 1;
	    boolean prime;
	    ArrayList<Integer> primeNums = new ArrayList<Integer> ();

	    primeNums.add(new Integer(2));

	    while(primeCounter < 1000)
	    {
	    	prime = true;

	        for(int i = 2; i < num; i++)
	    	{
	        	if(num % i == 0)//checking for non prime numbers
	        	{
	            	prime = false;
	            	break;
	           	}
	       	}

	       	if(prime)
	       	{
	        	primeNums.add(new Integer (num));
	        	primeCounter++;//keeping count of primes numbers
	       	}
	       	num++;
	    }

	    for(int j = primeNums.size()-1; j > 0; j--)
	    {
			if(finalNum % primeNums.get(j) == 0)
			{
				System.out.println("The largest prime factor of 600851475143 is " + primeNums.get(j));
				break;
			}
		}
	}
}