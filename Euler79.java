import java.io.*;
import java.util.ArrayList;

public class Euler79
{
	public static void main(String [] args)
	{
		ArrayList keys = new ArrayList();
		ArrayList nums = new ArrayList();

		int max;
		int counter = 1;
		int [] input = new int[3];
		boolean passFound = false;
		int currentSize = 2;
		String line;

		try
		{
			BufferedReader in = new BufferedReader(new FileReader("Euler79_Keylog.txt"));
			while((line = in.readLine()) != null)
			{
				System.out.println("Reading entry #" + (counter++) + " - '" + line + "':\n");

				input[0] = line.charAt(0);
				input[1] = line.charAt(1);
				input[2] = line.charAt(2);

				keys.add(input);

			}//end while

			while(!passFound)
			{
				max = (int)Math.pow(10, currentSize++);

				//populate numbers
				for(int i = 0; i <= max; i++)
				{
					nums.add(i);
				}

				//check keys against numbers
				for(int i = 0; i < nums.size(); i++)
				{
					if( (nums.get(i).indexOf(keys[0])) > (nums.get(i).indexOf(keys[1])) ||
						(nums.get(i).indexOf(keys[1])) > (nums.get(i).indexOf(keys[2])) )
					{
						nums.remove(i);
						i--;
					}
				}

				if(nums.size() == 1)
				{
					System.out.println(nums.get(0));
				}
			}
		}//end try

		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
	}//end main()
}//end class
