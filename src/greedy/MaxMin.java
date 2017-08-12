/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int min=a[k-1]-a[0];
        for (int i = 1; i < n-k+1; i++)
        {
            if((a[k-1+i]-a[i])<min)
                min=(a[k-1+i]-a[i]);
        }
        System.out.println(min);
    }
}
