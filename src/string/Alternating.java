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
public class Alternating
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int c=0;
            String s=sc.next();
            for (int j = 1; j < s.length(); )
            {
                char current=s.charAt(j);
                char prev=s.charAt(j-1);
                if(current==prev)
                {
                    c++;
                    s=new StringBuffer(s).deleteCharAt(j).toString();
                }
                else
                    j++;
            }
            System.out.println(c);
        }
    }
    
}
