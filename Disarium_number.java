import java.util.*;;
public class dis
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int a=0;
        int len=(int)(Math.log10(n)+1);
        while(len>0)
        {
            int k=temp%10;
            a+=Math.pow(k,len);
            temp=temp/10;
            len-=1;
            
            
        }
        if(a==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}