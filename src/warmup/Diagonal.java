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
public class Diagonal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int [][]a=new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int primaryDiagonal=0;
        for (int i = 0; i < n; i++)
        {
            primaryDiagonal+=a[i][i];
        }
        int secondaryDiagonal=0;
        for (int i = 0; i < n; i++)
        {
            secondaryDiagonal+=a[i][n-1-i];
        }
        System.out.println(Math.abs(primaryDiagonal-secondaryDiagonal));
    }
}
