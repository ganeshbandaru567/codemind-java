import java.util.*;
public class abd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        if (sum>a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}