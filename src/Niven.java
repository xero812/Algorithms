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
public class Niven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int T=sc.nextInt();
        for (int i = 1; i <= 1000; i++)
        {
            System.out.println(i+" "+ifNiven(i, b));
        }
    }

    private static int sumOfDigits(int num)
    {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    private static boolean ifNiven(int n, int base)
    {
        int nTobase10=Integer.valueOf(String.valueOf(n),base);
        int sumOfDigits=sumOfDigits(n);
        if(nTobase10%sumOfDigits==0)
            return true;
        return false;
    }
    
    
    
    
}
