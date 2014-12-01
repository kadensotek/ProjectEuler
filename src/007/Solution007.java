import java.lang.Math;

public class Solution007
{
    public static void main(String[] args)
    {
        int answer;
        answer = run();
        System.out.println("The answer is " + answer + ".");
    }

    public static int run()
    {
        int count = 0;
        int currentVal = 2;

        while(count != 10001)
        {
            /* Increments count when prime number is reached */
            if(isPrime(currentVal))
            {
                count++;
            } 
            currentVal++;
        }
        /* Return one less than current because of the extra increment */
        return currentVal - 1;
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

        /* Only need to check up to square root of number */
        for(int i=3; i<=Math.sqrt(number) + 1; i+=2)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
