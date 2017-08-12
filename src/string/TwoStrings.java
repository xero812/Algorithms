/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class TwoStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            boolean f=false;
            String a=sc.next();
            String b=sc.next();
            for (char ch:"abcdefghijklmnopqrstuvwxyz".toCharArray())
            {
                if(a.indexOf(ch)>-1 && b.indexOf(ch)>-1)
                {
                    f=true;
                    break;
                }
            }
            System.out.println(f?"YES":"NO");
        }
    }
    
}
