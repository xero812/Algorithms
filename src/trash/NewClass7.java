package trash;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass7
{
    public static void main(String[] args)
    {
        String s=new Scanner(System.in).next();
        String a=s.substring(0,5);
        String b=s.substring(5);
        boolean f=true;
        if("@hogwarts.com".equals(b) && a.length()==5 && check(a))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        
    }

    private static boolean check(String a)
    {
        for (int i = 0; i < 5; i++)
        {
            if((int)(a.charAt(i))<97 || (int)(a.charAt(i))>122)
                return false;
        }
        return true;
    }
}
