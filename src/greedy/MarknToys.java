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
public class MarknToys
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> heap=new PriorityQueue<>(
            (Integer t, Integer t1) -> Integer.compare(t, t1));
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            heap.offer(sc.nextInt());
        }
        int sum=0,c=0;
        while(true)
        {
            int temp=heap.poll();
            if(sum+temp>k)
            {
                break;
            }
            sum+=temp;
            c++;
        }
        System.out.println(c);
    }
    
}
