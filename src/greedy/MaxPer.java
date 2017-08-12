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
public class MaxPer
{
    static PriorityQueue<Integer> heap=new PriorityQueue<>(
            (Integer t1, Integer t) -> Integer.compare(t, t1));
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            heap.offer(sc.nextInt());
        }
        boolean found=false;
        while(heap.size()>=3)
        {
            int a=heap.poll();
            int b=heap.poll();
            int c=heap.poll();
            if(a<b+c)
            {
                System.out.println(c+" "+b+" "+a);
                found=true;
                break;
            }
            heap.offer(b);
            heap.offer(c);
        }
        if(!found)System.out.println(-1);
    }
    
}
