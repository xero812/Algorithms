/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Cakewalk
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Integer []a=new Integer[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        long sum=0;
        Arrays.sort(a,Collections.reverseOrder());
        for (int i = 0; i < n; i++)
        {
            sum+=(a[i])*Math.pow(2,i);
            System.out.println(sum);
        }
        System.out.println(sum);
    }
    
}
