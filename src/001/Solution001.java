public class Solution001
{
    public static void main(String[] args)
    {
        int answer;
        int target = 1000;
        answer = run(target);
        System.out.println("The sum of natural numbers below " + target + " is " + answer + ".");
    }

    public static int run(int target)
    {
        int sum = 0;
        for(int i=0; i<target; i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}
