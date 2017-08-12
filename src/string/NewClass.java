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
public class NewClass
{
    static String s;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        for (int i = 0; i < s.length(); i++)
        {
            doClean(i);
        }
        System.out.println(s);
    }

    private static void doClean(int i)
    {
            for (int j = i; j < s.length(); j++)
            {
                if(s.charAt(j)==s.charAt(j+1))
                {
                    s=s.substring(0,j)+s.substring(j+2);
                    return;
                }
            }
    }
    
    
    
}
