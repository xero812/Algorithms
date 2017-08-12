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
public class Electricty
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
        int energy=a[0];
        for (int i = n-1; i >= 0; i--)
        {
            energy=(energy+a[i]+1)/2;
        }
        System.out.println(energy);
    }
}
