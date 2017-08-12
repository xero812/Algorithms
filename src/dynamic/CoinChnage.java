/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
class CoinChange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(coinChange(amount,a));
    }

    private static int coinChange(int amount, int[] coins)
    {
        int []change=new int[amount+1];
        Arrays.fill(change, 0);
        change[0]=1;
        
        for (int coin:coins)
        {
            for (int i = 1; i < change.length; i++)
            {
                if(i>=coin)
                {
                    change[i]=change[i]+change[i-coin];
                }
            }
        }
        return change[amount];
    }
}