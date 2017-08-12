/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Priyanka
{
    static ArrayList<PriorityQueue<Integer>> listMin=new ArrayList<>();
    static ArrayList<PriorityQueue<Integer>> listMax=new ArrayList<>();
        
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int a=sc.nextInt();
            boolean found=false;
            for (int j=0;j<listMin.size();j++)
            {
                PriorityQueue<Integer> heapTempMin=listMin.get(j);
                PriorityQueue<Integer> heapTempMax=listMax.get(j);
                int min=heapTempMin.peek();
                int max=heapTempMax.peek();
                if((a>=min && a<=min+4) || (a>=max-4 && a<=max))
                {
                    heapTempMin.offer(a);
                    heapTempMax.offer(a);
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                PriorityQueue<Integer> heapMin=new PriorityQueue<>(
                (Integer t, Integer t1) -> Integer.compare(t, t1));
                PriorityQueue<Integer> heapMax=new PriorityQueue<>(
                (Integer t, Integer t1) -> Integer.compare(t1, t));
                heapMin.offer(a);
                heapMax.offer(a);
                listMin.add(heapMin);
                listMax.add(heapMax);
            }                
        }
        System.out.println(listMin.size());
        
    }
    
}
