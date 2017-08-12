/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Hackerland
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int []t=new int[n];
        int max=-1;
        for (int i = 0; i < n; i++)
        {
            t[i]=sc.nextInt();
            if(t[i]>max)
                max=t[i];
        }
        System.out.println(max);
        int []a=new int[max+1];
        for (int i = 0; i <n; i++)
        {
           a[t[i]]=1;
        }
        
        
        int pass=r*2+1;
        int ans=0;
        for (int i = 0; i < a.length; i++)
        {
            if(a[i]==1)
            {
                ans++;
                i+=pass-1;
         //       System.out.println(ans+" "+i);
            }
            
        }
       System.out.println(ans);
        
        
        
        
        
        
    }
}
