import java.util.Scanner;
class elee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,a[],b[],i,j,k[],c=0,z=0,h=0;
        n=sc.nextInt();
        x=sc.nextInt();
        a=new int[n];
        b=new int[x];
        k=new int[n+x];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(j=0;j<x;j++)
        {
            b[j]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=-1;
                }
            }
        }
        for(i=0;i<x;i++)
        {
            for(j=i+1;j<x;j++)
            {
                if(b[i]==b[j])
                {
                    b[j]=-1;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]!=-1)
            {
                c=0;
                for(j=0;j<x;j++)
                {
                    if(a[i]==b[j])
                    {
                        c+=1;
                    }
                }
                if(c==0)
                {
                    h+=1;
                }
            }
        }
        for(i=0;i<x;i++)
        {
            if(b[i]!=-1)
            {
                c=0;
                for(j=0;j<n;j++)
                {
                    if(b[i]!=-1)
                    {
                        if(b[i]==a[j])
                        {
                            c+=1;
                        }
                    }
                }
                if(c==0)
                {
                    h+=1;
                }
            }
        }
        System.out.println(h);
    }
}