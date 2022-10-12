import java.util.Scanner;
class primesnarray
{
    public static int is_it_prime(int l)
    {
        int j;
        for(j=2;j<=Math.sqrt(l);j++)
        {
            if(l%j==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,t;
        n=sc.nextInt();
        i=0;
        int []a=new int[100];
        int c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                continue;
            }
            else
            {
                t=is_it_prime(a[i]);
                if(t==1)
                {
                    c+=1;
                }
            }
        }
        System.out.print(c);
    }
}