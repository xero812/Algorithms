/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class BigSorting
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String []a=new String[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.next();
        }
        Arrays.sort(a, (String x,String y)->(compare(x,y)));
        //sort(a);
        printArray(a);
    }

    
    private static void printArray(String[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        //System.out.println();
    }

    private static int compare(String s1, String s2)
    {
        if(s1.length() > s2.length()) return 1;
        if(s1.length() < s2.length()) return -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
        }
        return 0;
    }

    
}
