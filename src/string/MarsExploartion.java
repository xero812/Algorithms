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
public class MarsExploartion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for (int i = 0; i < s.length(); i+=3)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            char ch3=s.charAt(i+2);
            if(ch1!='S')c++;
            if(ch2!='O')c++;
            if(ch3!='S')c++;
        }
        System.out.println(c);
    }
    
}
