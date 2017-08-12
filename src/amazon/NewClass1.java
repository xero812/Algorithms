/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        TreeSet<Character> output=new TreeSet();
        
        for (int i = 0; i < s1.length(); i++)
        {
            if(!s2.contains(s1.charAt(i)+""))
                output.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++)
        {
            if(!s1.contains(s2.charAt(i)+""))
                output.add(s2.charAt(i));
        }
        System.out.println(output);
        
        
        
        
    }
}
