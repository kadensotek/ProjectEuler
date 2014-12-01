public class Solution002
{
    /*
     *   Finds sum of all even Fibonacci values less than 4,000,000
     */

    public static void main(String[] args)
    {
        int answer = 2;  /* Initialize to two because the initial two can't be a newValue in the recursive calls */
        answer = run(answer, 1, 2);
        System.out.println("The answer is " + answer + ".");
    }

    public static int run(int answer, int first, int second)
    {
        int newValue = first + second;
        if(newValue > 4000000)
        {
            return answer;
        }
        else
        {
             answer = run(answer, second, newValue);

             /* Adds value to answer if even */ 
             if(newValue % 2 == 0)
             {
                 return answer + newValue;
             }
             else
             {
                 return answer;
             }
        }
    }
}
