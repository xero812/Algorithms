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
public class GridChallenge
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        boolean []ans=new boolean[t];
        for (int i = 0; i < t; i++)
        {
            int n=sc.nextInt();
            char [][]grid=new char[n][n];
            for (int j = 0; j < n; j++) 
            {
                String str = sc.next();
                for (int k = 0; k < str.length(); k++) 
                {
                    grid[j][k] = str.charAt(k);
                }
            }
            ans[i]=canConvert(grid);
        }
        for (int i = 0; i < t; i++)
        {
            System.out.println(ans[i]?"YES":"NO");
        }
    }
    
    private static boolean canConvert(char [][] grid) 
    {
        /* Sort each row */
        int rows = grid.length;
        int cols = grid[0].length;
        for (int row = 0; row < rows; row++) 
        {
            Arrays.sort(grid[row]);
        }
        /* Check columns for lexicographic ordering */
        for (int row = 1; row < rows; row++) 
        {
            for (int col = 0; col < cols; col++) 
            {
                if (grid[row][col] < grid[row-1][col]) 
                    return false;
            }
        }
        return true;
    }
    
}
