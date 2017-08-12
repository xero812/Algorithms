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
public class BigSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long s=0l;
        while(n>0)
        {
            s+=sc.nextLong();
            n--;
        }
        System.out.println(s);
    }
}
