package trash;


import java.util.ArrayList;
import java.util.HashSet;
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
public class NewClass10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        HashSet<ArrayList<Integer>> list=PrintSubsets(a);
        System.out.println(list);
    }
    
    static HashSet<ArrayList<Integer>> PrintSubsets(int []source) 
    {
        HashSet<ArrayList<Integer>> list=new HashSet();
        int currentSubset = (int)Math.pow(2, source.length); 
        int tmp; 
        while(currentSubset>0) 
        {
            ArrayList<Integer> subset=new ArrayList();
            System.out.print("(");
            tmp = currentSubset; 
            for(int i = 0; i<source.length; i++) 
            { 
                if (tmp>0) 
                    subset.add(source[i]);
                tmp = tmp>> 1; 
            }   
            list.add(subset);
            currentSubset--; 
        }
        return list;
    }
}
