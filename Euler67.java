import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Euler67
{

	public static void main(String[] args)
  	{
  		String[] lines = new String[100];
     	Scanner scan;

   		try
   		{
       		scan = new Scanner(new File("Euler67_Numbers.txt"));
       		int lineNo = 0;

       		while(scan.hasNext())
       		{
         		lines[lineNo] = scan.nextLine();
         		lineNo++;
       		}

       		for(int i = lines.length - 2; i >= 0; i--)
       		{
         		String[] vals = lines[i].split(" ");
         		String[] belowVals = lines[i + 1].split(" ");

         		for(int pos = 0; pos <= vals.length - 1; pos++)
         		{
           			vals[pos] = String.valueOf(Integer.valueOf(vals[pos]) + Math.max(Integer.valueOf(belowVals[pos]), Integer.valueOf(belowVals[pos + 1])));
         		}

         		// Re-write the line...
         		lines[i] = "";

         		for(int k = 0; k < vals.length; k++)
         		{
           			lines[i] += vals[k];
           			if(k < vals.length - 1){
             		lines[i] += " ";
           		}
         	}
       }

     System.out.println(lines[0]);
     }

     catch (FileNotFoundException ex)
     {
     	Logger.getLogger(Euler67.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
}