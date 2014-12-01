public class Solution004
{
    public static void main(String[] args)
    {
        int answer;
        answer = run();
        System.out.println("The answer is " + answer + ".");
    }

    public static int run()
    {
        boolean isPalindrome;
        int maxPal = 0;
        
        /* Multiplies all three digit numbers */
        for(int i=100; i<1000; i++)
        {
            for(int j=100; j<1000; j++)
            {
                isPalindrome = checkPalindrome(i * j);

                /* if it's a palindrome and bigger than the current biggest */
                if(isPalindrome && i * j > maxPal)
                {
                    maxPal = i * j;
                }
                isPalindrome = false;
            }
        }
        return maxPal;
    }

    public static boolean checkPalindrome(int num)
    {
        String strNum = Integer.toString(num);
        char[] charNum = strNum.toCharArray();
        int frontIndex = 0;
        int backIndex = charNum.length - 1;

        /* Starts at beginning and end and checks to see if both match */
        while(frontIndex <= backIndex)
        {
            if(charNum[frontIndex] != charNum[backIndex])
            {
                return false; 
            }
            frontIndex++;
            backIndex--;
        }
        return true;
    }
}
