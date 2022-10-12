import java.util.Scanner;
class vac
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c,j,d=0,sum=0;
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=1;
            if(a[i]>0)
            {
                for(j=i+1;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        c+=1;
                        a[j]=-1;
                    }
                }
                if(c==a[i])
                {
                    d+=1;
                }
            }
        }
        System.out.println(d);
    }
}