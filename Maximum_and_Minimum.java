import java.util.Scanner;
class minuuu
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
                    b[d++]=a[i];
                }
            }
        }
        if(d==0)
        {
            System.out.println("-1");
        }
        else
        {
            int min=b[0];
            int max=b[0];
            for(i=0;i<n;i++)
            {
                if(b[i]<min && b[i]!=0)
                {
                    min=b[i];
                }
                if(b[i]>max && b[i]!=0)
                {
                    max=b[i];
                }
            }
            System.out.print(min+" "+max);
        }
    }
}