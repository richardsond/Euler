import java.io.*;
import java.util.Arrays;

public class Euler22
{
	public static void main(String [] args) throws Exception
	{
		BufferedReader r = new BufferedReader(new FileReader("Euler22_Names.txt"));
		String [] names;
		String temp;
		int totalScore = 0;

		temp = r.readLine().replaceAll("\"","");

		names = temp.split(",");

		Arrays.sort(names);

		for(int i = 0; i < names.length; i++)
		{
			System.out.println((i+1) + ": " + names[i]); //DEBUG
			totalScore += ((i+1) * getNameValue(names[i]));
		}

		System.out.println("\nThe total value of all names in the textfile is: " + totalScore);
	}

	public static int getNameValue(String name)
	{
		int value = 0;

		for(int i = 0; i < name.length(); i++)
		{
			value += (name.charAt(i) - 'A') + 1;
		}

		return value;
	}
}