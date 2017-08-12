import java.util.TreeSet;
import java.util.Scanner;

public class P_Sorting
{

    private static String change(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        generate(s,0,s.length()-1);
        for (String t:list)
        {
            if(t.equals(new StringBuilder(t).reverse().toString()))
                System.out.println(t);
        }
    }
    
    private static void generate(String str, int l, int r)
    {
        if (l == r)
            list.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = change(str,l,i);
                generate(str, l+1, r);
                str = change(str,l,i);
            }
        }
    }
    
    static TreeSet<String> list=new TreeSet();
    
}
