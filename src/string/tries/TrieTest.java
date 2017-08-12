/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.tries;

import java.util.Scanner;


 
 
/* Class Trie Test */
public class TrieTest
{
    public static void main(String[] args)
    {            
        Scanner scan = new Scanner(System.in);
        /* Creating object of AATree */
        Trie t = new Trie(); 
        System.out.println("Trie Test\n");          
        char ch;
        /*  Perform tree operations  */
        do    
        {
            System.out.println("\nTrie Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter string element to insert");
                t.insert( scan.next() );                     
                break;                          
            case 2 : 
                System.out.println("Enter string element to delete");
                try
                {
                    t.remove( scan.next() ); 
                }                    
                catch (Exception e)
                {
                    System.out.println(e.getMessage()+" not found ");
                }
                break;                         
            case 3 : 
                System.out.println("Enter string element to search");
                System.out.println("Search result : "+ t.search( scan.next() ));
                break;                                          
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
}