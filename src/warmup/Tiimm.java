/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Tiimm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String []str=s.split(":");
        if(str[2].charAt(2)=='P')
        {
            System.out.print(Integer.parseInt(str[0])+12+":");
            System.out.print(str[1]+":");
            System.out.println(""+str[2].charAt(0)+""+str[2].charAt(1));
        }
        else
        {
            int hh=Integer.parseInt(str[0]);
            if(hh==12)
                hh=0;
            System.out.print(hh+":");
            System.out.print(str[1]+":");
            System.out.println(""+str[2].charAt(0)+""+str[2].charAt(1));
        }
        
    }
}
