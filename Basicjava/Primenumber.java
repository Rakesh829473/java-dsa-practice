public class Primenumber
{
    public static void main(String[] args) {
       int n=999;
       boolean isprime=true;
        
        if(n<=1)
        {
            isprime=false;
            
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        if(isprime)
        {
            System.out.println("prime numbewr");
        }
        else{
            System.out.println(" not prime number");
        }

    }
}
