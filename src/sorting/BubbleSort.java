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
public class BubbleSort
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
        //bubbleSort(a);
        bubbleSortOptimized(a);
        printArray(a);
    }

    private static void bubbleSort(int[] a)
    {
        for (int i = a.length-1; i >=0 ; i--)
        {
            for (int j = 0; j <= i-1 ; j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }

    private static void printArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    private static void bubbleSortOptimized(int[] a)
    {
        for (int i = a.length-1; i >=0 ; i--)
        {
            boolean swapped=true;
            for (int j = 0; j <= i-1 ; j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    swapped=false;
                }
            }
            if(swapped)
                break;
        }
    }
}
