package string;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class KMP
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text=sc.next();int N=text.length();
        String pattern=sc.next(); int M=pattern.length();
        int[] lps=prefix(pattern);
        int j=0;
        int i = 0;  // index for txt[]
        while (i < N)
        {
            if (pattern.charAt(j) == text.charAt(i))
            {
                j++;
                i++;
            }
            if (j == M)
            {
                System.out.println("Found pattern at index " + (i-j));
                j = lps[j-1];
            }
            // mismatch after j matches
            else if (i < N && pattern.charAt(j) != text.charAt(i))
            {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j-1];
                else
                    i = i+1;
            }
        }
    }

    private static int[] prefix(String pattern)
    {
        char []ptrn=pattern.toCharArray();
        int []pie=new int[pattern.length()];
        int j=0;
        pie[0]=0;
        for (int i = 1; i < ptrn.length; )
        {
            if(ptrn[i]==ptrn[j])
            {
                pie[i]=j+1;
                i++;j++;
            }
            else if(j>0)
            {
                j=pie[j-1];
                pie[i]=0;
            }
            else
                i++;
        }
        
        return pie;
        
    }
    
}
