package trash;

/*

1
10
10 8 5 2 2 5 5 6 8 9



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Adesh Srivastava
 */
public class NewClass9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n=sc.nextInt();
            String s="";
            boolean f=true;
            for (int j = 0; j < n; j++)
            {
                int temp=sc.nextInt();
                if(temp>n)
                    f=false;
                s=s+temp+" ";
            }
            if(!f)
                System.out.println("NO");
            else
            {
            for (int j = 0; j < n; j++)
            {
                int length=s.split("( )+").length;
                s=fastReplace(s, String.valueOf(length), " ");
                s=s.trim();
                if(s.length()==0)
                    break;
            }
            if(s.length()==0)
                System.out.println("YES");
            else
                System.out.println("NO");
            }   
            
        }
    }
    
    static String fastReplace( String str, String target, String replacement ) {
    int targetLength = target.length();
    if( targetLength == 0 ) {
        return str;
    }
    int idx2 = str.indexOf( target );
    if( idx2 < 0 ) {
        return str;
    }
    StringBuilder buffer = new StringBuilder( targetLength > replacement.length() ? str.length() : str.length() * 2 );
    int idx1 = 0;
    do {
        buffer.append( str, idx1, idx2 );
        buffer.append( replacement );
        idx1 = idx2 + targetLength;
        idx2 = str.indexOf( target, idx1 );
    } while( idx2 > 0 );
    buffer.append( str, idx1, str.length() );
    return buffer.toString();
}
    
}
