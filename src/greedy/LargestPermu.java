/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class LargestPermu
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> list=new HashMap();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        PriorityQueue<Integer> heap=new PriorityQueue<>(
            (Integer t1, Integer t) -> Integer.compare(t, t1));
        for (int i = 0; i < n; i++)
        {
            int temp=sc.nextInt();
            list.put(temp, i+1);
            heap.offer(temp);
        }
        for (int i = 0; i < k; i++)
        {
            int m=heap.poll();
            int index=list.get(m);
            
        }
    }
    
}
