/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Gr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n=sc.nextInt();
            int [][]a=new int[n][n];
            for (int j = 0; j < n-1; j++)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                int z=sc.nextInt();
                a[x-1][y-1]=z;
                a[y-1][x-1]=z;
            }
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    System.out.print(a[j][k]);
                }
                System.out.println();
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }
    
}
