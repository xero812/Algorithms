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
public class Huffman
{
    static PriorityQueue<BinaryTreeNode> heap=new PriorityQueue<>(
            (BinaryTreeNode t, BinaryTreeNode t1) -> Integer.compare(t.getData(), t1.getData()));
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            heap.offer(new BinaryTreeNode(sc.nextInt()));
        }
        for (int i = 1; i < n; i++)
        {
            BinaryTreeNode temp=new BinaryTreeNode();
            temp.setLeft(heap.poll());
            temp.setRight(heap.poll());
            temp.setData(temp.getLeft().getData()+
                    temp.getRight().getData());
            heap.offer(temp);
        }
        
       
    }
    
}
