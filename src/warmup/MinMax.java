/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class MinMax
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long []a=new long[5];
        long max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        long sum=0;
        for (int i = 0; i < 5; i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
            sum+=a[i];
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
}
