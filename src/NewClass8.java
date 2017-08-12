
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long [][]d=new long[n-k+1][k];
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        for (int x = 0; x < n-k+1; x++)
        {
            int m=0;
            for (int i = x; i < x+k; i++)
            {
                d[x][m++]=a[i];
            }
        }
        int c=0;
        for (int i = 0; i < n-k+1; i++)
        {
            c+=invCount(d[i]);
        }
        System.out.println(c);
        
    }
    
    static long merge(long[] arr, long[] left, long[] right) {
    int i = 0, j = 0, count = 0;
    while (i < left.length || j < right.length) {
        if (i == left.length) {
            arr[i+j] = right[j];
            j++;
        } else if (j == right.length) {
            arr[i+j] = left[i];
            i++;
        } else if (left[i] <= right[j]) {
            arr[i+j] = left[i];
            i++;                
        } else {
            arr[i+j] = right[j];
            count += left.length-i;
            j++;
        }
    }
    return count;
}

    static long invCount(long[] arr) {
    if (arr.length < 2)
        return 0;

    int m = (arr.length + 1) / 2;
    long []left=Arrays.copyOfRange(arr,0,m);
    long []right=Arrays.copyOfRange(arr,m,arr.length);
    return invCount(left) + invCount(right) + merge(arr, left, right);
}
    
 }