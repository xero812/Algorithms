package trash;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adesh Srivastava
 */
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s="X"+sc.next();
        String a=""+s.charAt(1)+s.charAt(4)+s.charAt(8)+s.charAt(12)+s.charAt(16);
        String b=""+s.charAt(13)+s.charAt(9)+s.charAt(5)+s.charAt(2);
        String c=""+s.charAt(6)+s.charAt(10)+s.charAt(14)+s.charAt(17);
        String d=""+s.charAt(15)+s.charAt(11)+s.charAt(7)+s.charAt(3);
        String ans=a+b+c+d;
        for (int i = 1; i < ans.length(); i++)
        {
            if(ans.charAt(i)=='X')
                break;
            System.out.print(ans.charAt(i));
        }
        
    }
    
}
