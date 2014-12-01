public class Solution005
{
    public static void main(String[] args)
    {
        int answer;
        answer = run();
        System.out.println("The answer is " + answer + ".");
    }

    public static int run()
    {
        int i = 20; /* We can ignore numbers before 20 */

        /* Only need to check top half because all of the bottom 
         * half are represented if all of the top are valid 
         */
        while(i % 11 != 0 || i % 12 != 0 || i % 13 != 0 || i % 14 != 0 || i % 15 != 0
                 || i % 16 != 0 || i  % 17 != 0 || i % 18 != 0 || i % 19 != 0 || i % 20 != 0) 
        {
            i += 20; /* We can ignore non-multiples of 20 */
        }
        return i;
    }
}
