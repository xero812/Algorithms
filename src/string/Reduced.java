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
public class Reduced
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        for (int i = 0; i < s.length()-1 && s.length()>1; )
        {
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            if(a==b)
            {
                StringBuffer str=new StringBuffer(s);
                str.deleteCharAt(i);
                str.deleteCharAt(i);
                s=str.toString();
                i=0;
            }
            else
                i++;
        //    System.out.println(s);
        }
        if(s.length()>0)
            System.out.println(s);
        else
            System.out.println("Empty String");
    }
    
}
