import java.util.Scanner;
public class xyz
{
    public static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,a[],i;
        double s=0,c=0,avg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(prime(a[i]))
            {
                s+=a[i];
                c+=1;
            }
        }
        avg=s/c;
        //System.out.println(avg);
        System.out.format("%.2f",avg);
    }
}