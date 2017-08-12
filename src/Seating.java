
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
public class Seating
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int []a=new int[t];
        for (int i = 0; i < t; i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < t; i++)
        {
            int n=a[i];
            int y=n%12;
            int ans=0;
            if(y==0)
            {
                ans=n-11;
            }
            else if(y>0 && y<=6)
            {
                ans=n+(13-2*y);
            }
            else
            {
                y=y%6;
                ans=n-(2*y-1);
            }
            System.out.print(ans+" ");
            int b=ans%12;
            switch (b)
            {
                case 0:
                case 1:
                case 6:
                case 7:
                    System.out.println("WS");
                    break;
                case 2:
                case 5:
                case 8:
                case 11:
                    System.out.println("MS");
                    break;
                default:
                    System.out.println("AS");
                    break;
            }
        }
    }
    
}
