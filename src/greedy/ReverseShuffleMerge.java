/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class ReverseShuffleMerge
{
    
    static ArrayList<String> list=new ArrayList();
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int []d=new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            d[(int)(s.charAt(i))-97]++;
        }
        String text="";
        for (int i = 0; i < d.length; i++)
        {
            if(d[i]>0)
            {
                for (int j = 0; j < d[i]/2; j++)
                {
                    text+=((char)(i+97));
                }
            }
        }
        String ans="";
        for (int i = 0;i<=s.length()/2 ; i++)
        {
            String temp=(s.substring(i,i+s.length()/2));
            System.out.println(temp);
            if(areAnagrams(text,temp))
            {
                temp=new StringBuilder(temp).reverse().toString();
                if("".equals(ans))
                    ans=temp;
                else
                {
                    if(ans.compareTo(temp)>0)
                        ans=temp;
                }
                    
            }
        }
        System.out.println(ans);
        
    }
    
    
    private static boolean areAnagrams(String s1,String s2)
    {
        boolean isAnagram = false;
        if (s1.length() == s2.length()) 
        {
            char[] s1AsChar = s1.toCharArray();
            char[] s2AsChar = s2.toCharArray();
            Arrays.sort(s2AsChar);
            isAnagram = Arrays.equals(s1AsChar, s2AsChar);
        }
        return isAnagram;
    }
}
