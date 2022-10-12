import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c,j,d=0,sum=0;
        float avg;
        n=sc.nextInt();
        int a[]=new int[n];
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
                    sum+=a[i];
                    d+=1;
                }
            }
        }
        if(d==0)
        {
            System.out.println("-1");
        }
        else
        {
            avg=(float)(sum)/d;
            System.out.printf("%.2f",avg);
        }
    }
}