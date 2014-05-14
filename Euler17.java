public class Euler17
{
	 private static String getTens(int i)
	        {
	                if (i == 0)
	                        return "";

	                String result = "";

	                switch (i)
	                {
	                case 10: return "ten";
	                case 11: return "eleven";
	                case 12: return "twelve";
	                case 13: return "thirteen";
	                case 15: return "fifteen";
	                case 18: return "eighteen";
	                }

	                if (i >= 10 && i < 20)
	                        return getOnes(i % 10) + "teen";
	                if (i >= 20 && i < 30)
	                        return "twenty"+ getOnes(i % 10);
	                if (i >= 30 && i < 40)
	                        return "thirty"+ getOnes(i % 10);
	                if (i >= 40 && i < 50)
	                        return "forty"+ getOnes(i % 10);
	                if (i >= 50 && i < 60)
	                        return "fifty"+ getOnes(i % 10);
	                if (i >= 80 && i < 90)
	                        return "eighty"+ getOnes(i % 10);

	                if (i >= 10)
	                        result = getOnes(i / 10) + "ty";

	                return result + getOnes(i % 10);
	        }

	        private static String getOnes(int i)
	        {
	                String numbers[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

	                if (i < 0 || i > 9)
	                        throw new IllegalArgumentException("Expected single digit but got: " + i);

	                return numbers[i];
	        }

	        private static String getThousands(int i)
	        {
	                if (i == 0)
	                        return "";

	                String result = "";
	                int tn = i / 1000;
	                result = getOnes(tn);
	                result += "thousand";
	                return result + getHundreds(i % 1000);
	        }

	        private static String getHundreds(int i)
	        {
	                if (i == 0)
	                        return "";

	                String result = "";
	                int tn = i / 100;
	                result = getOnes(tn);
	                result += "hundred";
	                if (i % 100 > 0)
	                        result += "and";
	                return result + getTens(i % 100);
	        }

	        public static String getLiteral(int i) {
	                String result = "";

	                if (i > 9999)
	                        throw new IllegalArgumentException("Not higher than 9999 allowed");

	                if (i >= 1000)
	                        result = getThousands(i);
	                else if (i >= 100)
	                        result = getHundreds(i % 1000);
	                else if (i >= 10)
	                        result = getTens(i % 100);
	                else
	                        result = getOnes(i % 10);

	                return result;
	        }

	        public static int getLiteralCount(int max)
	        {
	                int result = 0;
	                for (int i = 1; i <= max; ++i)
	                {
	                        String s = getLiteral(i);
	                        result += s.length();
	                }
	                return result;
	        }

	        public static void main(String [] args)
	        {
				final int MAX = 1000;
				int sum = getLiteralCount(MAX);

				System.out.println("The sum of all numbers from 1 to " + MAX + " is: " + sum);

			}

}