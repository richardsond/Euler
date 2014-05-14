import java.io.*;
import java.math.*;

public class Euler18
{
	final static int length = 15;

	public static void main(String [] args)
	{
		int[][] numbers = new int [length][length];
		int currentLine = 0;
		String temp;
		String [] bits;

		try
		{
			BufferedReader r = new BufferedReader(new FileReader("Euler18_Numbers.txt"));

			temp = r.readLine();

			while(temp != null)
			{
				bits = temp.split("\\s+");
				for(int i = 0; i < bits.length; i++)
				{
					numbers[currentLine][i] = Integer.parseInt(bits[i]);
				}
				currentLine++;
				temp = r.readLine();
			}

			r.close();
		}

		catch(IOException e) {}

		//DEBUG//
		for(int i = 0; i < length; i++)
		{
			for(int j = 0; j < length; j++)
			{
				System.out.printf("%4d",numbers[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\n");
		//END DEBUG//

		getMaximumRoute(numbers);
	}//end main

	public static void getMaximumRoute(int[][] numbers)
	{
		int sum = 0;
		int lastPosition = 0;
		int temp1;
		int temp2;
		int pos0, posF;

		for(int line = 0; line < length - 1; line++)
		{
			pos0 = numbers[line][lastPosition];
			posF = numbers[line][lastPosition + 1];

			temp1 = pos0 + Math.max(numbers[line+1][lastPosition], numbers[line+1][lastPosition+1]);
			temp2 = posF + Math.max(numbers[line+1][lastPosition+1], numbers[line+1][lastPosition+2]);

			if(temp1 > temp2)
			{
				sum += pos0;
				System.out.println(pos0 + "\tLast Position: " + lastPosition + "\tTotal Sum: " + sum); //DEBUG
			}

			if(temp2 > temp1)
			{
				sum += posF;
				System.out.println(posF + "\tLast Position: " + lastPosition + "\tTotal Sum: " + sum); //DEBUG
				lastPosition++;
			}
		}

		pos0 = numbers[length - 1][lastPosition];
		posF = numbers[length - 1][lastPosition+1];

		if(pos0 > posF)
		{
			sum += pos0;
			System.out.println(pos0 + "\tLast Position: " + lastPosition + "\tTotal Sum: " + sum); //DEBUG
		}

		if(posF > pos0)
		{
			sum += posF;
			System.out.println(posF + "\tLast Position: " + lastPosition + "\tTotal Sum: " + sum); //DEBUG
		}

		System.out.println("\nThe largest sum using adjacent squares is: " + sum);
	}//END GETMAXROUTE

}