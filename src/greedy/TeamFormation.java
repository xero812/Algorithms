/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author Adesh Srivastava
 */
public class TeamFormation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++)
        {
            int n=sc.nextInt();
            PriorityQueue<Integer> heap=new PriorityQueue<>(    
                    (Integer x, Integer y) -> Integer.compare(x, y));
            for (int j = 0; j < n; j++)
            {
                heap.offer(sc.nextInt());
            }
            int  temp=1;
            TreeSet<Integer> result=new TreeSet();
            while(heap.size()>1)
            {
                int prev=heap.poll();
                int next=heap.peek();
                if(prev+1==next)
                {
                    temp++;
                }
                else
                {
                    result.add(temp);
                    temp=1;
                }
            }
            result.add(temp);
            System.out.println(result.first());
            
        }
    }
    
}
