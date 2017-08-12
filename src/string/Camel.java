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
public class Camel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for (int i = 0; i < s.length(); i++)
        {
            int m=(int)s.charAt(i);
            if(m>=65 && m<=90)
                c++;
        }
        System.out.println(c+1);
    }
}
