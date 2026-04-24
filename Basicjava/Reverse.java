import java.util.*;

public class Reverse 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:=");
        int nums= sc.nextInt();
        int reverse=0;

        while(nums>0)
        {
            int digit=nums%10;
            reverse=reverse*10+digit;
            nums=nums/10;
            
        }
    System.out.println(reverse);
    sc.close();

    }
}
