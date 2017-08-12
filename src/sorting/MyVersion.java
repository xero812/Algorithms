package sorting;

import java.util.Scanner;

public class MyVersion
{
    static int cQ,cI;
    
    static int partition(int[] a, int low, int high)
    {
        int x=a[high];
        int i=low-1;
        for (int j = low; j < high; j++)
        {
            if(a[j]<=x)
            {
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                cQ++;
            }
        }
        int t=a[i+1];
        a[i+1]=a[high];
        a[high]=t;
        cQ++;
        return i+1;
    }
    
    private static void quickSort(int[]a, int low, int high)
    {
        if(high>low)
        {
            int pivot=partition(a, low, high);
            quickSort(a, low, pivot-1);
            quickSort(a, pivot+1, high);
        }
    }

    private static void insertionSort(int[] a)
    {
        int n = a.length;
        for (int i=1; i<n; ++i)
        {
            int key = a[i];
            int j = i-1;
            while (j>=0 && a[j] > key)
            {
                a[j+1] = a[j];
                j = j-1;
                cI++;            
            }
            a[j+1] = key;
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        for (int i = 0; i < n; i++)
        {
            b[i]=a[i]=sc.nextInt();
        }      
        quickSort(a,0,a.length-1);
        insertionSort(b);
        System.out.println(cI-cQ);
    }
    
    
    
    
    
    
}
