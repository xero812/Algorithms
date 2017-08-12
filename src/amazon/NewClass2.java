/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        String []s1=new String[n];
        for (int i = 0; i < n; i++)
        {
            s[i]=s1[i]=sc.next();
        }
        for (int i = 0; i < n; i++)
        {
            String temp=s1[i];
            char[] chars = temp.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            s1[i]=sorted;
        }
        for (int i = 0; i < n; i++)
        {
            String t=s[i];
            String t1=s1[i];
            int c=0;
            for (int j = i; j < n; j++)
            {
                if(s1[j]!="" && t1.equals(s1[j]))
                {
                    System.out.println(s[j]);
                    if(i!=j)
                        s1[j]="";
                }
            }           
        }
    }
    
}
