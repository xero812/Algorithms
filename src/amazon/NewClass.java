/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=n+"";
        int pos=-1;
        for (int i = s.length()-2; i >= 0; i--)
        {
            int prev=Integer.parseInt(s.charAt(i)+"");
            int next=Integer.parseInt(s.charAt(i+1)+"");
            if(prev<next)
            {
                pos=i;
                break;
            }
        }
        String output="";
        if(pos==-1)
            System.out.println("Not Acceptable");
        else
        {
            output=s.substring(0,pos)+s.charAt(s.length()-1);
            String str=s.substring(pos,s.length()-1);
            char []ch=str.toCharArray();
            Arrays.sort(ch);
            str=new String(ch);
            System.out.println(output+str);
        }
    }
    
}
