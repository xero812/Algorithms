/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Adesh Srivastava
 */
public class Weighted
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        Set<Integer> c=new HashSet();
        int flag=1;
        for (int i = 0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
            int m=(int)ch-96;
            if(i!=0)
            {
                if(s.charAt(i)==s.charAt(i-1))
                {
                    flag++;
                }
                else
                {
                    flag=1;
                }
            }
            c.add(m*flag);
        }
        for (int i = 0; i < n; i++)
        {
            if(c.contains(a[i]))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    
}
