import java.lang.Math;

public class Solution003 
{
    public static void main(String[] args)
    {
       long answer;
       long target = 600851475143L;
       answer = run(target);
       System.out.println("The largest factor is " + answer + "."); 
    }

    /* Finds largest prime factor. Don't need a list because last one is biggest one */
    public static long run(long target)
    {
        long largestFactor = 0;

        /*  We only need to check up to square root of our number */
        for(long i=2; i <= Math.sqrt(target) + 1; i++)
        {
            if(target % i == 0)  /* if i is a factor of our number */
            {
                if(isPrime(i))
                {
                    largestFactor = i; 
                }
            }
        } 
        return largestFactor;  
    }

    public static boolean isPrime(long num)
    {
        if(num <= 1)
        {
            return false; 
        }
        if(num == 2) 
        {
            return true;
        }
        if(num % 2 == 0)
        {
            return false;
        }

        /*  Again, only need to check up to square root of number */
        for(long i=3; i <= Math.sqrt(num) + 1; i = i + 2)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
