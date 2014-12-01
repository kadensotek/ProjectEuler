import java.lang.StringBuilder;
import java.lang.Character;

public class Solution008
{
    public static void main(String[] args)
    {
        String strNum = new String(initString());
        long answer;
        int length = 13;  /* size of product series */

        answer = run(strNum, length);
        System.out.println("The answer is " + answer + ".");
    }

    public static long run(String strNum, int length)
    {
        char[] charArray = strNum.toCharArray();
        long product;
        long biggest = 0;

        /* Starts at end of first series and iterates through entire string */
        for(int i=length-1; i<charArray.length-1; i++)
        {
            product = 1;

            /* Starts at current place and multiplies back the length of series */ 
            for(int j=i; j>=i-length+1; j--)
            {
                product *= (long)Character.getNumericValue(charArray[j]);
            }

            if(product > biggest)
            {
                biggest = product;
            }
        }

        return biggest;
    }

    public static String initString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("73167176531330624919225119674426574742355349194934");
        sb.append("96983520312774506326239578318016984801869478851843");
        sb.append("85861560789112949495459501737958331952853208805511");
        sb.append("12540698747158523863050715693290963295227443043557");
        sb.append("66896648950445244523161731856403098711121722383113");
        sb.append("62229893423380308135336276614282806444486645238749");
        sb.append("30358907296290491560440772390713810515859307960866");
        sb.append("70172427121883998797908792274921901699720888093776");
        sb.append("65727333001053367881220235421809751254540594752243");
        sb.append("52584907711670556013604839586446706324415722155397");
        sb.append("53697817977846174064955149290862569321978468622482");
        sb.append("83972241375657056057490261407972968652414535100474");
        sb.append("82166370484403199890008895243450658541227588666881");
        sb.append("16427171479924442928230863465674813919123162824586");
        sb.append("17866458359124566529476545682848912883142607690042");
        sb.append("24219022671055626321111109370544217506941658960408");
        sb.append("07198403850962455444362981230987879927244284909188");
        sb.append("84580156166097919133875499200524063689912560717606");
        sb.append("05886116467109405077541002256983155200055935729725");
        sb.append("71636269561882670428252483600823257530420752963450");
        return sb.toString();
    }
}
