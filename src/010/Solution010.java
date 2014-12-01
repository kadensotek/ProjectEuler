import java.lang.Math;

public class Solution010
{
    public static void main(String[] args)
    {
        long answer;
        int max = 2000000;   /* 2,000,000 */
        answer = run(max);
        System.out.println("The answer is " + answer + ".");
    }

    public static long run(int max)
    {
        long sum = 2;
        for(int i=1; i<max; i+=2)
        {
            if(isPrime(i))
            {
                sum += (long)i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int number)
    {
        if(number <= 1)
        {
            return false;
        }
        if(number == 2)
        {
            return true;
        }
        if(number % 2 == 0)
        {
            return false;
        }
        for(int i=3; i <= Math.sqrt(number) + 1; i+=2)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
