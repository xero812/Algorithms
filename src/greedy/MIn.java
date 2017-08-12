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
public class MIn
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
        Arrays.sort(a);
        int min=a[1]-a[0];
        for (int i = 1; i < n-1; i++)
        {
            int temp=a[i+1]-a[i];
            if(temp<min)
                min=temp;
        }
        System.out.println(min);
        
    }
}
