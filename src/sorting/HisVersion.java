package sorting;

import java.util.*;
public class HisVersion 
{
    static int t1=0,t=0;
    static int partition(int[]arr,int low,int high)
    {
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                t1++;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        t1++;
        return i+1;
    }
    
    static void Quicksort(int []arr,int low,int high)
    {
        if(low<high)
        {
            int p=partition(arr,low,high);
            Quicksort(arr,low,p-1);
            Quicksort(arr,p+1,high);
        }
    }
        
    static  void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
                t++;            
            }
            arr[j+1] = key;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int  n=s.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            arr1[i]=arr[i];
        }
        Quicksort(arr,0,n-1);
        sort(arr1);
        System.out.print(t-t1);
    }
}