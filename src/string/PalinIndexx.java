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
public class PalinIndexx
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int k = 0; k < n; k++)
        {
            String s=sc.next();
            System.out.println(process(s));
        }
    }

    private static int process(String s)
    {
        StringBuffer str1=new StringBuffer(s);
        StringBuffer rev1=new StringBuffer(s).reverse();
        if(str1.toString().equals(rev1.toString()))
        {
            return -1;
        }
        for (int i = 0; i < s.length(); i++)
        {
            StringBuffer t=new StringBuffer(s);
            t.deleteCharAt(i);
            String temp=t.toString();
            StringBuffer str=new StringBuffer(temp);
            StringBuffer rev=new StringBuffer(temp).reverse();
            if(str.toString().equals(rev.toString()))
            {
                return i;
            }
        }
        return -11;
    }
    
}
