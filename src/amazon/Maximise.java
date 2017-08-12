/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Maximise
{
    static int len;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        String s=""; 
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        process(s);
        System.out.println(len);
    }

    private static void process(String s)
    {
        
        if(!s.contains("0"))
        {
            len=s.length();
        }
        else if(zeroOccursOnce(s))
        {
            len=s.length()-1;
        }
        else
        {
            int start=0;
            int length=0;
            for (int i = 0; i < s.length(); i++)
            {
                char ch=s.charAt(i);
                if(ch=='1')
                {
                    length++;
                }
            }
        }
    }
    private static boolean zeroOccursOnce(String s)
    {
        int  c=0;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)=='0')
                c++;
        }
        if(c==1)
            return true;
        return false;
    }
    
}
