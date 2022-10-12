import java.util.Scanner;
class Palin
{
    public static int is_it_p(int i)
    {
        int rev=0,d;
        int temp=i;
        while(i!=0)
        {
            d=i%10;
            rev=rev*10+d;
            i/=10;
        }
        if(rev==temp)
        {
            return temp;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,t,i;
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=m;i<n;i++)
        {
            t=is_it_p(i);
            if(t>0)
            {
                System.out.print(t+" ");
            }
        }
    }
}