/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Adesh Srivastava
 */
public class Fraud
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        int notif=0;
        int c=0;
        for (int i = d; i < n; i++)
        {
            int[]t=new int[d];
            int k=0;
            for (int j = c++; j < i ; j++)
            {
                t[k++]=a[j];
            }
            Arrays.sort(t);
            int median=t[t.length/2];
            if(a[i]>=median*2)
                notif++;
        }
        System.out.println(notif);
    }
    
    private static void printArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    
}
