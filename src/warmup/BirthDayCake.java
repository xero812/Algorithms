/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class BirthDayCake
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        int max=Collections.max(list);
        int c=0;
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i)==max)
                c++;
        }
        System.out.println(c);
    }
}
