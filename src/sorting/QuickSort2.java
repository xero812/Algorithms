package sorting;

import java.util.Scanner;

public class QuickSort2
{
    static int cQ,cI;
    
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
        System.out.println(Math.abs(cI-cQ));
    }
    
    private static int partition(int[] a, int low, int high)
    {
        int x=a[high];
        int i=low-1;
        for (int j = low; j < high; j++)
        {
            if(a[j]<=x)
            {
                i=i+1;
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
        
        
        /*
        ArrayList<Integer> left=new ArrayList();
        ArrayList<Integer> right=new ArrayList();
        int pivot=a[low];
        for (int i = low+1; i <= high; i++)
        {
            if(a[i]>pivot)
                right.add(a[i]);
            else 
                left.add(a[i]);
        }
        int c=low;
        for (int i = 0; i < left.size(); i++)
        {
            a[c++]=left.get(i);
        }
        int position=c;
        a[c++]=pivot;
        for (int i = 0; i < right.size(); i++)
        {
            a[c++]=right.get(i);
        }
        return position;
        */
        
        /*
        int left,right,pivot_item=a[low];
        left=low;
        right=high;
        
        while(left<right)
        {
            while(a[left] <= pivot_item)
                left++;
            while(a[right] > pivot_item)
                right--;
            if(left<right)
                swap(a,left,right);
        }
        a[low]=a[right];
        a[right]=pivot_item;
        */    
    }

    private static void swap(int[] a, int left, int right)
    {
        int t=a[left];
        a[left]=a[right];
        a[right]=t;
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
    
}
