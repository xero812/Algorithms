package amazon;

import java.util.Scanner;

class NewClass3
{
    
    public static int costMin(String X, String Y, int costX, int costY)
    {
        int m = X.length(), n = Y.length();
        int l = sub(X, Y, m, n);
        return costX * (m - l) +costY * (n - l);
    }
    
    public static void main(String []a)
    {
        Scanner sc = new Scanner(System.in);
        String X=sc.next();
        String Y=sc.next();
        int costX=sc.nextInt();
        int costY=sc.nextInt();
        System.out.println(costMin(X, Y, costX, costY));;
    }
    
    public static int sub(String X, String Y, int m, int n)
    {
        int [][]L=new int[m+1][n+1];
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1; 
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
    return L[m][n]; 
    }
 
    
}
