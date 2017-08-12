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
public class CaesarCipher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();char []s=str.toCharArray();
        int k=sc.nextInt();
        k=k%26;
        for (int i = 0; i < n; i++)
        {
            char ch=s[i];
            int m=(int)ch;
            if((m>=65 && m<=90))
            {
                m-=64;
                m+=k;
                if(m>26)
                    m=m-26;
                m+=64;
                System.out.print((char)m);
            }
            else if((m>=97 && m<=122))
            {
                m-=96;
                m+=k;
                if(m>26)
                    m=m-26;
                m+=96;
                System.out.print((char)m);
            }
            else
            {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
    
}
