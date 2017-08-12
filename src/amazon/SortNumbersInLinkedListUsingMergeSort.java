/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.ArrayList;

public class SortNumbersInLinkedListUsingMergeSort 
{

    Node head;

    public static void main(String[] args) 
    {
        SortNumbersInLinkedListUsingMergeSort sll = new SortNumbersInLinkedListUsingMergeSort();
        // creating an unsorted linked list
        sll.head = new Node(2);
        sll.head.next = new Node(5);
        sll.head.next.next = new Node(3);
        sll.head.next.next.next = new Node(-1);
        sll.head.next.next.next.next = new Node(1);
        sll.head.next.next.next.next.next = new Node(99);
        printList(sll.head);
        sll.head = Merge(sll.head);
        printList(sll.head);
    }



    // 
    public static Node Merge(Node head){

        // if linked list has no or only one element then return
        if (head == null || head.next == null){
            return null;
        }

        // split the linked list into two halves, (front and back as two heads) 
        ArrayList<Node> list = splitIntoSublists(head);

        // Recursively sort the sub linked lists 
        Merge(list.get(0));
        Merge(list.get(1));

        // merge two sorted sub lists
        head = mergeTwoSortedLists(list.get(0), list.get(1));

        return head;


    }

    // method to merge two sorted linked lists
    public static Node mergeTwoSortedLists(Node front, Node back){

        Node result;

        if (front == null){
            return back;
        }

        if (back == null){
            return front;
        }

        if (front.data >= back.data){
            result = back;
            result.next = mergeTwoSortedLists(front, back.next);
        }
        else{
            result = front;
            result.next = mergeTwoSortedLists(front.next, back);
        }

        return result;
    }

    // method to split linked list into two list in middle.
    public static ArrayList<Node> splitIntoSublists(Node head){
        Node slowPointer;
        Node fastPointer ;

        Node front = null;
        Node back = null;

        ArrayList<Node> li = new ArrayList<Node>();

        if (head == null || head.next == null){
            front = head;
            back = null;
        }
        else{
            slowPointer= head;
            fastPointer = head.next;

            while (fastPointer != null && fastPointer.next != null){

                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;

            }

            front = head;
            back =  slowPointer.next;
            slowPointer.next = null;

        }

        li.add(front);
        li.add(back);
        return li;
    }

    // method to print linked list
    public static void printList(Node head){
        Node pointer = head;

        while (pointer != null){
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }

}

// class to define linked list 
class Node{
    int data;
    Node next;

    public Node (int data){
        this.data = data;
    }
}