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
public class Staircase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
                for (int k = 0; k < n-i-1; k++)
                {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            
        }
    }
    
}
