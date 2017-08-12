package dynamic;

class Fibonacci
{
    public static void main (String args[])
    {
    int n = 4;
    a=new int[n+1];
        for (int i = 0; i < n; i++)
        {
            System.out.println(fib2(i));
        }
    }
    
    static int[]a;
    static int fib2(int n)
    {
        if(a[n]==0)
        {
            if(n<=1)
            {
                a[n]=n;
            }
            else
            {
                a[n]=fib2(n-1)+fib2(n-2);
            }
        }
        return a[n];
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
    
    static int fib1(int n)
    {
        /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+1];
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
    
    
      
}
