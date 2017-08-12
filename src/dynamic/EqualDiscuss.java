/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author Adesh Srivastava
 */
public class EqualDiscuss
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n=sc.nextInt();
            int []arr=new int[n];
            for (int j = 0; j < n; j++)
            {
                arr[j]=sc.nextInt();
            }
            System.out.println(equalDiscuss(arr, 0));
        }
    }
    
    private static int equalDiscuss(int[] a,int c)
    {
        boolean flag = true;
        boolean flagForNegative = true;
        int first = a[0];
        for(int i = 1; i < a.length && flag; i++)
        {
            if (a[i] != first) flag = false;
            if(a[i]<0)flagForNegative=false;
        }
        if(!flagForNegative) return Integer.MAX_VALUE;
        if (flag) return c;
        else
        {
            int maxPos=maxPos(a);
            int []x=new int[a.length];int []y=new int[a.length];int []z=new int[a.length];
            System.arraycopy(a, 0, x, 0, a.length);
            System.arraycopy(a, 0, y, 0, a.length);
            System.arraycopy(a, 0, z, 0, a.length);
            x[maxPos]-=5;y[maxPos]-=2;z[maxPos]-=1;
            int minCost=min(checkCost(x),checkCost(y) , checkCost(z));
            if(minCost==checkCost(x))
                return equalDiscuss(x, c+1);
            else if(minCost==checkCost(y))
                return equalDiscuss(y, c+1);
            else
                return equalDiscuss(z, c+1);
            
            
          //  return min(equalDiscuss(x, c+1),
            //        equalDiscuss(y, c+1),
              //    equalDiscuss(z, c+1));
        }
    }

    private static int min(int a,int b,int c)
    {
        return Math.min(Math.min(a,b),c );
    }

    private static void display(int[] x)
    {
        System.out.print("{");
        for (int i = 0; i < x.length; i++)
        {
            System.out.print(x[i]+",");
        }
        System.out.println("}");
    }
    
    private static int maxPos(int []a)
    {
            int maxPos=0,max=a[0];
            for (int i = 1; i < a.length; i++)
            {
                if(max<a[i])
                {
                    max=a[i];
                    maxPos=i;
                }
            }
            return maxPos;
    }
    private static int minPos(int []a)
    {
            int minPos=0,min=a[0];
            for (int i = 1; i < a.length; i++)
            {
                if(min>a[i])
                {
                    min=a[i];
                    minPos=i;
                }
            }
            return minPos;
    }

    private static int checkCost(int[] a)
    {
        int cost=0;
        for (int i = 0; i < a.length; i++)
        {
            int n=a[i]-a[minPos(a)];
            int t5=n/5;
            int t2=(n%5)/2;
            int t1=n%5%2;
            cost+=(t5+t2+t1);
        }
        return cost;
    }
    
}
