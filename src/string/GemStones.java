package string;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Adesh Srivastava
 */
public class GemStones
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[]s=new String[n];
        for (int i = 0; i < n; i++)
        {
            s[i]=sc.next();
        }
        int c=0;
        for (int i = 97; i <= 122; i++)
        {
            boolean f=true;
            char ch=(char)i;
            for (int j = 0; j < n; j++)
            {
                if(!s[j].contains(ch+""))
                {
                    f=false;
                    break;
                }
            }
            if(f)c++;
        }
        System.out.println(c);
    }
    
}
