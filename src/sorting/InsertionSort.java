/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;
/**
 *
 * @author Adesh Srivastava
 */
public class InsertionSort
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        insertionSort(a);
        printArray(a);
    }

    private static void insertionSort(int[] a)
    {
        int c=0;
        for (int i = 1; i < a.length ; i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
                c++;
            }
            a[j+1]=key;
            //printArray(a);
        }
        //System.out.println(c);
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
