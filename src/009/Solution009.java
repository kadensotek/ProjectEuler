public class Solution009
{
    public static void main(String[] args)
    {
        int answer;
        answer = run();
        System.out.println("The answer is " + answer + ".");
    }

    public static int run()
    {
        int max = 1000;

        /* Finds A, B, and C that add to 1000 */
        for(int a=1; a<=max; a++)
        {
            for(int b=1; b<=max; b++)
            {
                int c = max - a - b;

                if(isPythTriplet(a, b, c))
                {
                    return a * b * c ; 
                }
            }
        }
        return 0;
    }

    /* Applies Pythagorean theorem to current A, B and C */
    public static boolean isPythTriplet(int a, int b, int c)
    {
        int aSqr = a * a;
        int bSqr = b * b;
        int cSqr = c * c;

        if(aSqr + bSqr == cSqr)
        {
            return true;
        }
        return false;
    }
}
