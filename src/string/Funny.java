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
public class Funny
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            boolean f=true;
            String s=sc.next();
            String r=new StringBuffer(s).reverse().toString();
            for (int j = 1; j < s.length(); j++)
            {
                if(Math.abs((int)s.charAt(j)-(int)s.charAt(j-1))
                        !=Math.abs((int)r.charAt(j)-(int)r.charAt(j-1)))
                {
                    f=!f;
                    break;
                }
            }
            if(f)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }
    }
}
