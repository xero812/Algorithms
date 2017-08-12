package trash;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adesh Srivastava
 */
public class VVPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if(i%2!=0)
                {
                    if(j%2==0)
                        System.out.print("\\");
                    else
                        System.out.print("/");
                }
                else
                {
                        if(j%2==0)
                        System.out.print("/");
                    else
                        System.out.print("\\");
                
                }
            }
            System.out.println();
        }
    }
    
}
