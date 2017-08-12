/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Akas
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
        int q=sc.nextInt();
        for (int i = 0; i < q; i++)
        {
            switch(sc.next().charAt(0))
            {
                case 'C':
                    int X=sc.nextInt();
                    int Y=sc.nextInt();
                    X--;Y--;
                    int sum=0;
                    for (int j = X; j <= Y; j++)
                    {
                        sum+=F(a[j]);
                    }
                    System.out.println(sum%1000000007);
                    break;
                case 'U':
                    int M=sc.nextInt();
                    int N=sc.nextInt();
                    a[M-1]=N;
                    break;
            }
        }
    }
    
    private static int F(int x)
    {
        int f=0;
        for (int i = 1; i <= x; i++)
        {
            f+=GCD(i,x);
        }
        return f;
    }
    
    private static int GCD(int a,int b)
    {
        BigInteger b1 = new BigInteger(""+a); // there's a better way to do this. I forget.
    BigInteger b2 = new BigInteger(""+b);
    BigInteger gcd = b1.gcd(b2);
    return gcd.intValue();}
}
