/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.PriorityQueue;
import java.util.Scanner;
/**
 *
 * @author Adesh Srivastava
 */
public class PermutingToArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            PriorityQueue<Integer> heap1=new PriorityQueue<>(
            (Integer x, Integer y) -> Integer.compare(x, y));
            PriorityQueue<Integer> heap2=new PriorityQueue<>(
            (Integer x, Integer y) -> Integer.compare(x, y));
            for (int j = 0; j < n; j++)
                heap1.offer(sc.nextInt());
            for (int j = 0; j < n; j++)
                heap2.offer(k-sc.nextInt());
            //System.out.println(heap1+"\n"+heap2);
            boolean condition =true;
            for (int j = 0; j < n; j++)
            {
                if(heap2.poll()>heap1.poll())
                {
                    condition=false;
                    break;
                }
            }
            System.out.println(condition?"YES":"NO");
        }
    }
}
