import javax.swing.*;

public class Euler49
{
	public static void main (String [] args)
	{
		for(int t1 = 1001; t1 <= 1488; t1 += 2)
		{
			System.out.println(t1);

			if(isPrime(t1))
			{
				for(int i = 0; (i + i + t1) <= 9999; i++)
				{
					int t2 = t1 + i;
					int t3 = t1 + i + i;

					if(isPerm(t1, t2, t3))
    				{
						System.out.println("T1: " + t1 + "\tT2: " + t2 + "\tT3: " + t3);
        				break;
    				}

				}
        	}
		}
	}

	public static Boolean isPrime(int num)
    {
    	if(num % 2 == 0)
        {
        	return false;
        }

        for(int i = 3; i < num; i++)
        {
	    	if(num % i == 0)
            {
            	return false;
            }
        }

		return true;
	}



	public static Boolean isPerm(int n1, int n2, int n3)
    {
   		String str1 = sort(Integer.toString(n1));
        String str2 = sort(Integer.toString(n2));
        String str3 = sort(Integer.toString(n3));

      	if(str1.equals(str2) && str1.equals(str3) && n1 != n2 && n1 != n3)
		{
			JOptionPane.showMessageDialog(null, "FOUND: " + n1 + ", " + n2 + ", " + n3 );
			return true;
		}

		return false;
	}

	public static String sort(String str)
	{
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
}
