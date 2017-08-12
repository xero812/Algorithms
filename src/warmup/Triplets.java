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
public class Triplets
{

    private static int pa;
    private static int pb;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int b3=sc.nextInt();
        update(a1, b1);
        update(a2, b2);
        update(a3, b3);
        System.out.println(pa+" "+pb);
        
    }

    private static int check(int a, int b)
    {
        if(a>b)
            return 1;
        else if(a<b)
            return -1;
        else
            return 0;
    }
    
    private static void update(int a,int b)
    {
        if(check(a,b)==1)
            pa++;
        else if(check(a,b)==-1)
            pb++;
    }
    
}
