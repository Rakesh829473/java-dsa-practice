public class Fibonacci 
{
    public static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
       return fibonacci(n-1)+fibonacci(n-2);
      
    }
    public static void main(String[] args)
    {
        int n=10;
        
        for(int i=0;i<n;i++)
       {
        System.out.print(fibonacci(i)+" ");
       }

      
        int a=0;
        int b=1;
        System.out.print(a+","+b);
        for(int i=3;i<=n; i++)
        {
            int c=a+b;
            System.err.print( c+" ,");
            a=b;
            b=c;
        }
        
    }
    
}
