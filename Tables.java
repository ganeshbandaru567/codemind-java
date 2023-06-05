import java.util.*;
public class table
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=b;i++)
        {
            if(i%2!=0)
            {
                
                System.out.println(a+" "+"x"+" "+i+" "+"="+" "+a*i);
            }
        }
    }
}