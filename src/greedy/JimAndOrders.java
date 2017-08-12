/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class JimAndOrders
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt()+sc.nextInt();
        }
        int []index=new int[n];
        for (int i = 0; i < n; i++)
        {
            index[i]=i;
        }
        sort(a,index);
        for (int i = 0; i < n; i++)
        {
            System.out.print(index[i]+1+" ");
        }
    }

    private static void sort(int[] a, int[] index)
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
                    t=index[j];
                    index[j]=index[j+1];
                    index[j+1]=t;
                }
            }
        }
    }
    
}
