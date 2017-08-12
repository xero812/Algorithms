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
public class Insertion1
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        int e=a[a.length-1];
        boolean f=!true;
        for (int i = n-2; i >= 0; i--)
        {
            if(a[i] > e)
            {
                a[i+1] = a[i];
            }
            else
            {
                a[i+1] = e;
                f=true;
            }
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[j]+" ");
            }
            System.out.println();
            if(f)break;
        }
        if(e<a[0]){a[0]=e;
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
        

    }
}
