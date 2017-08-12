/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.*;


public class StringConst 
{

public static void main(String[] args) 
{
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int a0 = 0; a0 < n; a0++)
    {
        String s = in.next();
        Set<Character> aiseHi = new HashSet<>();
        char[] c = s.toCharArray();
        for(char ch: c)
        {
            aiseHi.add(ch);
        }
      System.out.println(aiseHi.size());
    }
}
}