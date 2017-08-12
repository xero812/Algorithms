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
public class GameOfThrones
{
    public static void main(String[] args)
    {
        String s=new Scanner(System.in).next();
        int []a=new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            int m=(int)s.charAt(i)-97;
            a[m]++;
        }
        int c=0;
        for (int i = 0; i < 26; i++)
        {
            if(a[i]%2!=0)
                c++;
        }
        System.out.println(c>1?"NO":"YES");
    }
    
}

