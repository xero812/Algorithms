/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class SimpleArraySum
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            sum+=sc.nextInt();
            n--;
        }
        System.out.println(sum);
    }
    
}
