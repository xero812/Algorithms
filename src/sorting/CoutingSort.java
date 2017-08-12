
package sorting;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class CoutingSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=0;
        }
        for (int i = 0; i < n; i++)
        {
            a[sc.nextInt()]++;
        }
        for (int i = 0; i < n; i++)
        {
            if(a[i]>0)
            {
                for (int j = 1; j <= a[i]; j++)
                {
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();
    }
    
}
