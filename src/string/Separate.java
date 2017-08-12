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
public class Separate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        
    }
    public static boolean check(String s,int i)
    {
        boolean f=true;
        int a=Integer.parseInt(s.substring(0,i));
        a++;
        int lengthOfNext=String.valueOf(a).length();
        for (int j = 0; j < 10; j++)
        {
            
        }
        return f;
    }
    
}
