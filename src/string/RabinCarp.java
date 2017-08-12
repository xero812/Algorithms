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
public class RabinCarp
{
    
    public static int d=256;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text=sc.next();int n=text.length();
        String pattern=sc.next();int m=pattern.length();
        int q=11;     
        int h=(int) Math.pow(d, m-1)%q;
        int p=0,t=0;
        for (int i = 0; i < m; i++)
        {
            t=(d*t+(int)text.charAt(i))%q;
            p=(d*p+(int)pattern.charAt(i))%q;
        }
        boolean found=false;
        for (int i = 0; i <= n-m; i++)
        {
            if(p==t)
            {
                int j=0;
                for (; j < m; j++)
                {
                    if(text.charAt(i+j)!=pattern.charAt(j))
                        break;
                }
                if(j==m)
                {
                    System.out.println("Pattern found at :"+(i+1));
                    found=true;
                }
            }
            if(i<n-m)
            {
                t = (d*(t - (int)(text.charAt(i))*h) + (int)(text.charAt(i+m)))%q;
                if(t<0)t+=q;
            }
        }
        if(!found)System.out.println("Not found");
        
        
    }
    
}
