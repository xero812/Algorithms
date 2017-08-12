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
public class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            String s=sc.next();
            if(s.length()%2!=0)
                System.out.println(-1);
            else
            {
                String x=s.substring(0,s.length()/2);
                String y=s.substring(s.length()/2);
                int []a=new int[26];
                for (int j = 0; j < x.length(); j++)
                {
                    int m=(int)x.charAt(j)-97;
                    a[m]++;
                }
                int []b=new int[26];
                for (int j = 0; j < y.length(); j++)
                {
                    int m=(int)y.charAt(j)-97;
                    b[m]++;
                }
                int c=0;
                for (int j = 0; j < 26; j++)
                {
                    if(b[j]>a[j])
                        c+=(b[j]-a[j]);
                }
                System.out.println(c);
            }
        }
    }
    
}
