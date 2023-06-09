import java.util.*;
public class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int rev=0;
        while (a!=0)
        {
            int k=a%10;
            rev=rev*10+k;
            a=a/10;
        }
        if(rev==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}