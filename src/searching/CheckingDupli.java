package searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CheckingDupli
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        /*
        Map<Integer,Integer> list=new HashMap();
        for (int i = 0; i < n; i++)
        {
            int a=sc.nextInt();
            if(list.containsKey(a))
            {
                list.put(a, list.get(a)+1);
            }
            else
                list.put(a, 1);
        }
        Set<Integer> keys=list.keySet();
        for (Integer i:keys)
        {
            System.out.println(list.get(i));
        }
        */
        boolean flag=false;
        TreeSet<Integer> list=new TreeSet();
        for (int i = 0; i < n; i++)
        {
            if(!list.add(sc.nextInt()))
            {
                flag=true;
                break;
            }
        }
        System.out.println(flag);
        
    }
    
}
