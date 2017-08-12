package string;

import java.util.Scanner;
        
public class Hackkkernk 
{
public static void main(String[] args) 
{
    int index = 0;
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
       String sFirst = in.next();
        if(sFirst.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*")){
            System.out.print("YES" + "\n");
        } else {
            System.out.print("NO" + "\n");
        }

}
} }