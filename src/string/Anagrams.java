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
public class Anagrams
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int []aa=new int[26];
        int []bb=new int[26];
        for (int i = 0; i < a.length(); i++)
        {
            int m=(int)a.charAt(i)-97;
            aa[m]++;
        }
        for (int i = 0; i < a.length(); i++)
        {
            int m=(int)b.charAt(i)-97;
            bb[m]++;
        }
        int c=0;
        for (int i = 0; i < 26; i++)
        {
            c+=Math.abs(aa[i]-bb[i]);
        }
        System.out.println(c);

    }
    
}
