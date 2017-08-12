/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class PlusMinus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cP=0,c0=0,cM=0;
        for (int i = 0; i < n; i++)
        {
            int temp=sc.nextInt();
            if(temp<0)
                cM++;
            else if(temp==0)
                c0++;
            else
                cP++;
        }
        DecimalFormat df = new DecimalFormat("#.######"); 
        df.setRoundingMode(RoundingMode.HALF_UP); //Optional
        Double d = 2341234.212431324;
        System.out.println(df.format((cP*1.0)/n));
        System.out.println(df.format((cM*1.0)/n));
        System.out.println(df.format((c0*1.0)/n));
        
    }
    
}
