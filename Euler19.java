public class Euler19
{
	public static void main (String [] args)
	{
		int sundays = 0;
		int currentDay = 2;
		int years = 1901;
		int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

		while(years < 2001)
		{
			daysInMonth[1] = 28;

			if(years % 400 == 0 || years % 4 == 0)
			{
				daysInMonth[1] = 29;
			}

			for(int j = 0; j < daysInMonth.length; j++)
			{
				currentDay += daysInMonth[j];
				if(currentDay % 7 == 0)
				{
					sundays++;
				}

			}
			years++;

		}

		System.out.println("There were " + sundays + " Sundays between January 1st, 1901, and December 31, 2000.");

	}
}