
package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        ArrayList<Integer> left=new ArrayList();
        ArrayList<Integer> right=new ArrayList();
        int pivot=a[0]=sc.nextInt();
        for (int i = 1; i < n; i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>pivot)
                right.add(a[i]);
            else 
                left.add(a[i]);
        }
        for (int i = 0; i < left.size(); i++)
        {
            System.out.print(left.get(i)+" ");
        }
        System.out.print(pivot+" ");
        for (int i = 0; i < right.size(); i++)
        {
            System.out.print(right.get(i)+" ");
        }
        System.out.println();
    }
}
