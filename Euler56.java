import java.math.*;
 
public class Euler56 
{
    public static void main(String[] args) 
    {    
        int result = 0;
 
        for( int a=1; a<100; a++ )
        {
            for( int b=1; b<100; b++ )
            {
                BigInteger n = BigInteger.valueOf(1);
                int sum = 0;
 
                for( int i=0; i<b; i++ )
                {
                    n = n.multiply( BigInteger.valueOf(a) );
                }
 
                String s = n.toString();
 
                for( int i=0; i<s.length(); i++ )
                {
                    sum += (s.charAt(i) - '0');
                }
 
                if( sum > result )
                {
                    result = sum;
                }
            }
        }
 
        System.out.println( result );
    }
}