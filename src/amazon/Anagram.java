/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.*;
class Anagrams
{
    static int c = 0;
    static TreeSet<String> list=new TreeSet();
    
    
    static void display(String s1, String s2)
    {
        if(s2.length()<=1)
        {
            c++;
            list.add(s1+s2);
        }
        else
        {
            for(int i=0; i<s2.length(); i++)
            {
                String x = s2.substring(i, i+1);
                String y = s2.substring(0, i);
                String z = s2.substring(i+1);
                display(s1+x, y+z);
            }
        }
    }
     
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            String str=sc.next();
            int n=sc.nextInt();
            display("",str);
            String[] result = list.toArray(new String[list.size()]);
            System.out.println(result[n-1]);
            list.clear();
        }
        
        
        /*
        System.out.print("Enter a word : ");
        String s = sc.next();
        System.out.println("The Anagrams are : ");
        */
        
    }
}