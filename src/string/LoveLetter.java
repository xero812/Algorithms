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
public class LoveLetter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int c=0;
            String s=sc.next();
            for (int j = 0; j < s.length()/2; j++)
            {
                c+=Math.abs((int)s.charAt(s.length()-1-j)-(int)s.charAt(j));
            }
            System.out.println(c);
        }
    }
    
}
