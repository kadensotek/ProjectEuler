public class Solution006
{
    public static void main(String[] args)
    {
        int answer;
        int target = 100;
        answer = run(target);
        System.out.println("The answer is " + answer + ".");
    }

    public static int run(int target)
    {
        int sumOfSquares = 0;
        int squareOfSum = 0;

        for(int i=1; i<=target; i++)
        {
            sumOfSquares += i * i;  /* Adds i^2 to the sum */
            squareOfSum += i;   /* Simply adds i, to be squared later */
        }
        squareOfSum *= squareOfSum;  /*  And here is where we square it */

        return squareOfSum - sumOfSquares; 
    }
}
