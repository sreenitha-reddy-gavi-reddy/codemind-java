import java.util.Scanner;
class assarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,b,k=0,c=1;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                c+=1;
            }
        }
        if(c==n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}