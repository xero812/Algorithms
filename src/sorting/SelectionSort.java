package sorting;

import java.util.Scanner;

public class SelectionSort
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
        selectionSort(a);
        printArray(a);
    }

    private static void selectionSort(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int min=a[i],pos=i;
            for (int j = i+1; j < a.length; j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    pos=j;
                }
            }
            int t=a[i];
            a[i]=a[pos];
            a[pos]=t;
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

}
