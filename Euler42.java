import java.io.*;
import javax.swing.*;


public class Euler42
{
	public static void main (String [] args)
	{
		final int MAX = 2000;

		int [] triangleNums = generateTriangleNums(MAX);
		String [] words = new String [] {"ERROR"};
		int numTriangleWords = 0;
		int wordValue = 0;

		try
		{
			words = readWords("Euler42_Words.txt");
		}
		catch(Exception e) {}

		for(int i = 0; i < words.length; i++)
		{
			wordValue = getWordValue(words[i]);

			for(int j = 0; j < triangleNums.length; j++)
			{
				if(wordValue == triangleNums[j])
				{
					numTriangleWords++;
				}
			}
		}

		System.out.println("The number of triangle words in the list is: " + numTriangleWords);
	}

	public static int [] generateTriangleNums(int num)
	{
		int [] triangleNums = new int [num];

		for(int i = 1; i < num; i++)
		{
			double value = (double) ((0.5) * i) * (i+1);
			triangleNums[i] = (int) value;
		}

		return triangleNums;
	}

	public static String [] readWords(String filename) throws Exception
	{
		BufferedReader r = new BufferedReader(new FileReader(filename));
		String temp = r.readLine();
		temp = temp.replaceAll("\"","");

		String [] words = temp.split(",");

		return words;

	}

	public static int getWordValue(String word)
	{
		int totalValue = 0;

		for(int i = 0; i < word.length(); i++)
		{
			totalValue += ((word.charAt(i) - 'A') + 1);
		}

		return totalValue;
	}
}